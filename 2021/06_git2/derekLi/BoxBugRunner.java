package derekLi;

import java.awt.Color;

import info.gridworld.actor.ActorWorld;

public class BoxBugRunner {
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld(); 
        
        world.add(new BoxBug());


        BoxBug foo = new BoxBug(2); 
        
        foo.setColor(Color.YELLOW);
        foo.turn();
        world.add(foo);
        world.show(); 
    }
}
