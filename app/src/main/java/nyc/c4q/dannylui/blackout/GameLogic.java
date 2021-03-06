package nyc.c4q.dannylui.blackout;

import java.util.Random;

/**
 * Created by dannylui on 9/21/16.
 */
public class GameLogic {
    public static int imageResId = R.drawable.under_construction_bg;

    public static int gameLevel = 0;
    public static boolean convergingPath = false;
    public static boolean gameOver = false;

    public static int monsterHealth = 100;
    public static int monsterMaxFatigue = 3;
    public static int playerDamage = 34;
    public static double playerChanceToHit = .5;
    public static double playerChanceToDodge = .5;
    public static boolean baseballBat = false;

    public static String getDialogue(int input) {
        String dialogue = null;
        gameLevel++;
        if (!convergingPath) {
            if (gameLevel == 1 && input == 1) {
                gameOver = true;
                imageResId = R.drawable.you_died_bg;
                dialogue = (Dialogue.getDeadLog(0));
            }
            if (gameLevel == 1 && input == 2) {
                imageResId = R.drawable.waking_up_bg;
                dialogue = (Dialogue.getLivingLog(1)); //1. Open the door, 2. Try to unboard the windows
            }
            if (gameLevel == 2 && input == 1) { //converging
                convergingPath = true;
                imageResId = R.drawable.opening_door_bg;
                dialogue = (Dialogue.getLivingLog(4)); //1. Go back and grab the candle, 2. Continue forward
            }
            if (gameLevel == 2 && input == 2) {
                imageResId = R.drawable.boarded_window_bg;
                dialogue = (Dialogue.getLivingLog(2)); //1. Investigate the noise, 2. Wait and hide behind your bed
            }

            if (gameLevel == 3 && input == 1) {
                gameOver = true;
                imageResId = R.drawable.you_died_bg;
                dialogue = (Dialogue.getDeadLog(1));
            }

            if (gameLevel == 3 && input == 2) {
                imageResId = R.drawable.hiding_behind_bed_bg;
                dialogue = (Dialogue.getLivingLog(3)); //1. Open your door, 2. Stay in your room
            }

            if (gameLevel == 4 && input == 1) {
                gameLevel = 2;
                convergingPath = true;
                imageResId = R.drawable.opening_door_bg;
                dialogue = (Dialogue.getLivingLog(4)); //1. Go back and grab the candle, 2. Continue forward
            }
            if (gameLevel == 4 && input == 2) {
                gameOver = true;
                imageResId = R.drawable.you_died_bg;
                dialogue = (Dialogue.getDeadLog(2));
            }


        } else {
            if (gameLevel == 3 && input == 1) {
                imageResId = R.drawable.hallway_bg;
                dialogue = (Dialogue.getLivingLog(5)); //1. Proceed left of the hallway, 2. Proceed right of the hallway
            }

            if (gameLevel == 3 && input == 2) {
                gameOver = true;
                imageResId = R.drawable.you_died_bg;
                dialogue = (Dialogue.getDeadLog(4));
            }

            if (gameLevel == 4 && input == 1) {
                gameOver = true;
                imageResId = R.drawable.you_died_bg;
                return (Dialogue.getDeadLog(3));
            }
            if (gameLevel == 4 && input == 2){
                imageResId = R.drawable.baseball_bat_bg;
                dialogue = (Dialogue.getLivingLog(6)); //1. Take the baseball bat, 2. Leave the baseball bat
            }

            if (gameLevel == 5 && input == 1) {
                imageResId = R.drawable.monster_bg;
                dialogue = (Dialogue.getLivingLog(7)); //1. Fight it, 2. Run
            }
            if (gameLevel == 5 && input == 2) {
                imageResId = R.drawable.monster_bg;
                dialogue = (Dialogue.getLivingLog(8)); //1. Fight it, 2. Run
            }

            if (gameLevel == 6 && input == 1) {
                baseballBat = true;
                updatePlayerStats(0.00, 0.25, 16); //chanceToDodge,chanceToHit,damage increased by...
                dialogue = monsterFight();
            }
            if (gameLevel == 6 && input == 2) {
                gameOver = true;
                imageResId = R.drawable.you_died_bg;
                dialogue = (Dialogue.getDeadLog(5));
            }
        }

        return dialogue;
    }

    public static String monsterFight() {
        String result = "";
        result += Dialogue.getCombatLog(0) + " ";

        int monsterCurrentFatigue = 0;

        while (monsterCurrentFatigue < monsterMaxFatigue) {
            Random rand1 = new Random();
            if ( playerChanceToHit * 100 >= rand1.nextInt(100) + 1 ) {
                if (monsterHealth > 0) {
                    result += Dialogue.getCombatLog(1) + " ";
                    monsterHealth -= playerDamage;
                    //result += (Dialogue.getCombatLog(7) + monsterHealth) + " ";

                }
                else {
                    gameOver = true;
                    imageResId = R.drawable.escaped_bg;
                    result += Dialogue.getCombatLog(2) + " ";
                    break;
                }
            }
            else {
                result += Dialogue.getCombatLog(3) + " ";
                Random rand2 = new Random();
                if (playerChanceToDodge * 100 >= rand2.nextInt(100) + 1) {
                    result += Dialogue.getCombatLog(4) + " ";
                    monsterCurrentFatigue++;
                }
                else {
                    gameOver = true;
                    imageResId = R.drawable.you_died_bg;
                    result += Dialogue.getCombatLog(5) + " ";
                    break;
                }
            }
        }

        if (monsterCurrentFatigue == monsterMaxFatigue) {
            gameOver = true;
            imageResId = R.drawable.escaped_bg;
            result += Dialogue.getCombatLog(6) + " ";
        }

        return result;
    }

    public static void updatePlayerStats(double dodgeChance, double hitChance, int damage) {
        playerChanceToDodge += dodgeChance;
        playerChanceToHit += hitChance;
        playerDamage += damage;
    }

    public static void resetGame() {
        gameOver = false;
        gameLevel = 0;
        convergingPath = false;
        imageResId = R.drawable.under_construction_bg;

        monsterHealth = 100;
        monsterMaxFatigue = 3;
        playerChanceToHit = .5;
        playerChanceToDodge = .5;
        playerDamage = 34;
    }
}
