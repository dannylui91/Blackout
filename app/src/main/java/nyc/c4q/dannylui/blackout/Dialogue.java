package nyc.c4q.dannylui.blackout;

import java.util.Arrays;
import java.util.List;

/**
 * Created by dannylui on 9/20/16.
 */

public class Dialogue {
    public static List<String> livingLog = Arrays.asList(
            "\nYou wake up in the middle of the night drenched in sweat and\nwondering whose bed you're in and how you got here.\n1. Go back to sleep.\n2. Get out of bed.\nEnter:",
            "\nThe room is dark and you can barely make out your surroundings. Only one corner of the room is lit up by a candle and you notice a door there. A window is also by your bed but seems to be boarded up nicely.\n1. Open the door.\n2. Try to unboard the window.\nEnter:",
            "\nThe boards doesn't seem to budge and there doesn't seem to be any cracks to peer through.\nYou hear a loud bang outside the room.\n1. Investigate the noise.\n2. Wait and hide behind your bed.\nEnter:",
            "\nYou hear a large hammer being dragged outside your room.\nThe noise seems to be coming from the left.\nIt gets louder as it approaches the door.\nYou proceed to go under your bed but the noise gradually subsides as it passes your room.\n1. Open your door.\n2. Stay in your room.",
            "\nYou move towards the door and gentle open up a crack\nbut the hallway is too dark to see.\n1. Go back and grab the candle.\n2. Continue forward.\nEnter:",
            "\nYou grabbed the candle and proceed outside the door.\nYou seem to be in a hallway in what seems to be a large house or mansion.\n1. Proceed left of the hallway.\n2. Proceed right of the hallway.\nEnter:",
            "\nYou peer outside to see that nothings there.\nYou turn right and proceed down the hallway.\nAs you cautiously make your way down your feet hits something hard.\nYou see a baseball bat lying on the floor.\n1. Take the baseball bat.\n2. Leave the baseball bat.\nEnter:",
            "\nYou pick up the baseball bat and\nlook up to see a ogre like behemoth standing in front of you with a huge sledge hammer.\n1. Fight it.\n2. Run.\nEnter:",
            "\nYou decide to not take the baseball bat,\nas you look up you see a huge behemoth standing in front of you with a huge sledgehammer.\n1. Fight it.\n2. Run.\nEnter:"
    );

    public static List<String> deadLog = Arrays.asList(
            "\nYou slept through the entire night and never woke up...",
            "\nAs you open the door, a huge force pushes you back and dazes you.\nYou become disoriented but could hear a large hammer being dragged along the floor.\nYou struggle to get to your feet but feel an immense pain...",
            "\nYou hide behind your bed hoping whatever just passed your room is gone.\nIt becomes quiet and you start to calm down.\nSuddenly, the door bursts open with a dark figure standing in the door way.\nYou cannot make out what it is but continue to peer over your bed.\nYou get spotted and the next thing you see is a large dark object flying at you...",
            "\nYou peer outside to see that nothings there.\nYou turn left and proceed down the hallway.\nA loud thumping noise quickly approaches you from behind.\nYou turn arou...",
            "\nYou walk blindly into the darkness and you hit a wall.\nThe noise you made echoes throughout the hallway and you hear thumping.\nThe thumping noise quickly gets louder and you know its coming for you.\nSomething grabs your leg and you feel your body being lifted from the floor and you get taken away into the abyss...",
            "\nYou attempt to escape but the monster instantly grabs your leg and slams you to the floor.\nYou hear the sledgehammer being lifted and what followed was a violent onslaught on you...",
            "You dodged 3 times and tired the monster. You managed to run passed it. Congratulations you escaped!~"

    );

    public static String[] combatLog = {
            "\nYou are preparing to engage the beast!",
            "You dealt some damage to the beast!",
            "The monster stumbles on it's feet and falls to the side and you see an opening and an exit.\nYou take this chance and dash towards the door. Congratulations you escaped!~",
            "You missed your swing and give the beast a chance to hit you.",
            "You dodged a fatal attack!",
            "You take fatal blow and the monster hauls you away into the abyss...",
            "You dodged 3 times and tired the monster. You managed to run passed it. Congratulations you escaped!~",
            "Monster remaining HP: "
    };

    public static String getCombatLog(int index) {
        return combatLog[index];
    }

    public static String getLivingLog(int index) {
        return livingLog.get(index);
    }

    public static String getDeadLog(int index) {
        return deadLog.get(index);
    }
}
