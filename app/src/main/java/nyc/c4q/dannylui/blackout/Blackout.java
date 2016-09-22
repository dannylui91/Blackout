package nyc.c4q.dannylui.blackout;

import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;

/**
 * Created by dannylui on 9/21/16.
 */
public class Blackout {
    public static int gameLevel = 0;
    public static boolean convergingPath = false;
    public static boolean gameOver = false;
    public static int imageResId = R.drawable.under_construction_bg;

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
                dialogue = (Dialogue.getLivingLog(1)); //1. Open the door, 2. Try to unboard the windows
            }
            if (gameLevel == 2 && input == 1) { //converging
                convergingPath = true;
                dialogue = (Dialogue.getLivingLog(4)); //1. Go back and grab the candle, 2. Continue forward
            }
            if (gameLevel == 2 && input == 2) {

                dialogue = (Dialogue.getLivingLog(2)); //1. Investigate the noise, 2. Wait and hide behind your bed
            }

            if (gameLevel == 3 && input == 1) {
                gameOver = true;
                imageResId = R.drawable.you_died_bg;
                dialogue = (Dialogue.getDeadLog(1));
            }

            if (gameLevel == 3 && input == 2) {
                dialogue = (Dialogue.getLivingLog(3)); //1. Open your door, 2. Stay in your room
            }

            if (gameLevel == 4 && input == 1) {
                gameLevel = 2;
                convergingPath = true;
                dialogue = (Dialogue.getLivingLog(4)); //1. Go back and grab the candle, 2. Continue forward
            }
            if (gameLevel == 4 && input == 2) {
                gameOver = true;
                imageResId = R.drawable.you_died_bg;
                dialogue = (Dialogue.getDeadLog(2));
            }


        } else {
            if (gameLevel == 3 && input == 1) {
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
                dialogue = (Dialogue.getLivingLog(6)); //1. Take the baseball bat, 2. Leave the baseball bat
            }

            if (gameLevel == 5 && input == 1) {
                dialogue = (Dialogue.getLivingLog(7)); //1. Fight it, 2. Run
            }
            if (gameLevel == 5 && input == 2) {
                dialogue = (Dialogue.getLivingLog(8)); //1. Fight it, 2. Run
            }
        }

        return dialogue;
    }
}
