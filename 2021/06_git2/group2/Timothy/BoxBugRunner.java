package group2.Timothy;

import java.awt.Color;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class BoxBugRunner {
    public static void main(String[] args) {
        // create visual workspace
        ActorWorld world = new ActorWorld();

        // add our two bugs
        // bug #1
        world.add(new Location(5, 2), new BoxBug());    // preset spawn point, default constructor
        // bug #2
        BoxBug foo = new BoxBug(2);                     // unset spawn point, given length
        foo.setColor(Color.YELLOW);                     // change color
        world.add(new Location(5, 6), foo);             // set spawn point
        world.show();                                   // display
    }
}
