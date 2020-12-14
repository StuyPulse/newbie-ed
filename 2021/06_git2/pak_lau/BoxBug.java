package pak_lau;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class BoxBug extends Bug {
    int sideLength;
    int steps;

    public BoxBug(int sideLength) {
        this.sideLength = sideLength;
        steps = 1;
    }

    public BoxBug() {
        this(4);
    }

    @Override
    public void turn() {
        setDirection(getDirection() + Location.RIGHT);
    }

    @Override
    public void act() {
        if(steps++ < sideLength && canMove()) {
            move();
        } else { 
            turn();
            steps = 1;
        }
    }

}