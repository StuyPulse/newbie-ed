package group2.Timothy;

import info.gridworld.actor.Bug;

public class CircleBug extends Bug {
    int steps;  // counter variable, tracks steps taken
    int length; // distance bug moves before changing direction

    //// CONSTRUCTOR(S)

    // given length
    public CircleBug(int length) {
        this.steps = 1;
        this.length = length;
    }

    // default constructor
    public CircleBug() {
        this.steps = 1;
        this.length = 4;    // default, can be changed
    }

    // no need for helper function

    // runs once per loop, dictates movement
    @Override
    public void act() {
        if(steps < length && canMove()) {   // conditions must be met before continuing
            move();         // move in target direction
            steps++;        // increment steps counter
        } else {
            turn();         // rotate 45 degrees clockwise
            steps = 1;      // reset steps
        }
    }
}
