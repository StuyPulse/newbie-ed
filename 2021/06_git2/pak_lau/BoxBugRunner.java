package pak_lau;

import java.awt.Color;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class BoxBugRunner {
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        world.add(new Location(5, 2), new BoxBug());
        BoxBug foo = new BoxBug(2);
        foo.setColor(Color.YELLOW);
        world.add(new Location(5,5), foo);
        world.show();
    }
}
