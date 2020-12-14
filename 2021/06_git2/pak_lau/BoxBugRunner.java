package pak_lau;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;

public class BoxBugRunner {

    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        world.add(new Location(5, 2), new BoxBug());
        world.add(new Location(0,0), new RainbowBug());
        BoxBug foo = new BoxBug(2);
        foo.setColor(Color.YELLOW);
        world.add(new Location(5,5), foo);
        world.show();
    }

}