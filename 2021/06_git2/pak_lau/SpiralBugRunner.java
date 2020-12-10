package pak_lau;

import java.awt.Color;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class SpiralBugRunner {
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        SpiralBug foo = new SpiralBug(3);
        foo.setColor(Color.YELLOW);
        world.add(new Location(5, 2), foo);
        world.show();
    }
}
