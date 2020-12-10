package pak_lau;

import info.gridworld.actor.Bug;

public class CircleBug extends Bug {
    int sideLength;
    int steps;
    
    public CircleBug(int sideLength) {
        this.sideLength = sideLength;
        steps = 1;
    }

    public CircleBug() {
        this(4);
    }

    @Override
    public void act() {
        if(steps < sideLength && canMove()) {
            move();
            steps++;
        } else {
            turn();
            steps = 1;
        }
    }
}
