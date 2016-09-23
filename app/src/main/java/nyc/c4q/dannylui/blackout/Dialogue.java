package nyc.c4q.dannylui.blackout;

import java.util.Arrays;
import java.util.List;

/**
 * Created by dannylui on 9/20/16.
 */

public class Dialogue {
    public static List<String> livingLog = Arrays.asList(
            "You wake up in the middle of the night drenched in sweat and wondering whose bed you're in and how you got here.\n1. Go back to sleep.\n2. Get out of bed.",
            "The room is dark and you can barely make out your surroundings. Only one corner of the room is lit up by a candle and you notice a door there. A window is also by your bed but seems to be boarded up nicely.\n1. Open the door.\n2. Try to unboard the window.",
            "The boards doesn't seem to budge and there doesn't seem to be any cracks to peer through.\nYou hear a loud bang outside the room.\n1. Investigate the noise.\n2. Wait and hide behind your bed.",
            "You hear a large hammer being dragged outside your room. The noise seems to be coming from the left. It gets louder as it approaches the door. You proceed to go under your bed but the noise gradually subsides as it passes your room.\n1. Open your door. 2. Stay in your room.",
            "You move towards the door and gentle open up a crack but the hallway is too dark to see.\n1. Go back and grab the candle.\n2. Continue forward.",
            "You grabbed the candle and proceed outside the door. You seem to be in a hallway in what seems to be a large house or mansion.\n1. Proceed left of the hallway.\n2. Proceed right of the hallway.",
            "You peer outside to see that nothings there. You turn right and proceed down the hallway. As you cautiously make your way down your feet hits something hard. You see a baseball bat lying on the floor.\n1. Take the baseball bat.\n2. Leave the baseball bat.",
            "You pick up the baseball bat and look up to see a ogre like behemoth standing in front of you with a huge sledge hammer.\n1. Fight it.\n2. Run.",
            "You decide to not take the baseball bat, as you look up you see a huge behemoth standing in front of you with a huge sledgehammer.\n1. Fight it.\n2. Run."
    );

    public static List<String> deadLog = Arrays.asList(
            "You slept through the entire night and never woke up...",
            "As you open the door, a huge force pushes you back and dazes you. You become disoriented but could hear a large hammer being dragged along the floor. You struggle to get to your feet but feel an immense pain...",
            "You hide behind your bed hoping whatever just passed your room is gone. It becomes quiet and you start to calm down. Suddenly, the door bursts open with a dark figure standing in the door way. You cannot make out what it is but continue to peer over your bed. You get spotted and the next thing you see is a large dark object flying at you...",
            "You peer outside to see that nothings there. You turn left and proceed down the hallway. A loud thumping noise quickly approaches you from behind. You turn arou...",
            "You walk blindly into the darkness and you hit a wall. The noise you made echoes throughout the hallway and you hear thumping. The thumping noise quickly gets louder and you know its coming for you. Something grabs your leg and you feel your body being lifted from the floor and you get taken away into the abyss...",
            "You attempt to escape but the monster instantly grabs your leg and slams you to the floor. You hear the sledgehammer being lifted and what followed was a violent onslaught on you...",
            "You dodged 3 times and tired the monster. You managed to run passed it. Congratulations you escaped!~"

    );

    public static String[] combatLog = {
            "You are preparing to engage the beast!",
            "You dealt some damage to the beast!",
            "The monster stumbles on it's feet and falls to it's side. You see an opening and an exit. You take this chance and dash towards the door. Congratulations you escaped!~",
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
