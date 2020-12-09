package group2.Timothy;

import java.awt.Color;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class CircleBugRunner {
    public static void main(String[] args) {
        // create visual workspace
        ActorWorld world = new ActorWorld();

        // adding just one bug this time (too chaotic)
        CircleBug foo = new CircleBug(2);               // unset spawn point, given length
        foo.setColor(Color.YELLOW);                     // change color
        world.add(new Location(5, 6), foo);             // set spawn point
        world.show();                                   // display
    }
}
