package pak_lau;

import java.awt.Color;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class CircleBugRunner {
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        CircleBug foo = new CircleBug(2);
        foo.setColor(Color.YELLOW);
        world.add(new Location(5, 2), foo);
        world.show();
    }
}
