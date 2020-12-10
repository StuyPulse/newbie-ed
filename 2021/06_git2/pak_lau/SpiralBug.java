package pak_lau;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class SpiralBug extends Bug {
    int sideLength;
    int steps;

    public SpiralBug(int sideLength) {
        this.sideLength = sideLength;
        steps = 1;
    }

    public SpiralBug() {
        this(4);
    }

    @Override
    public void turn() {
        setDirection(getDirection() + Location.RIGHT);
    }

    @Override
    public void act() {
        if(steps < sideLength && canMove()) {
            move();
            steps++;
        } else {
            turn();
            steps = 1;
            sideLength++;
        }
    }
}
