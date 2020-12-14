package group3;

import java.awt.Color;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class BoxBugKevinRunner {
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        // add our two bugs
        world.add(new Location(5, 2), new BoxBugKevin());
        BoxBugKevin foo = new BoxBugKevin(2);
        // changing color
        foo.setColor(Color.YELLOW);
        world.add(new Location(5, 6), foo);
        world.show();
    }
}
