package mahir_riki;

import java.awt.Color;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class BoxBugRunner {
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        
        world.add(new Location(5,1), new BoxBug());
        BoxBug foo = new BoxBug(2);

        foo.setColor(Color.YELLOW);
        world.add(new Location(5, 7), foo);
        world.show();
    }
}
