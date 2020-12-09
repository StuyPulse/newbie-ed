package group2.Timothy;

import info.gridworld.actor.Bug;

public class BoxBug extends Bug {
    int steps;  // counter variable, tracks steps taken
    int length; // distance bug moves before changing direction

    //// CONSTRUCTOR(S)

    // given length
    public BoxBug(int length) {
        this.steps = 1;
        this.length = length;
    }

    // default constructor
    public BoxBug() {
        this.steps = 1;
        this.length = 4;    // default, can be changed
    }

    // helper function, dictates movement
    private void rightTurn() {
        for(int i = 0; i < 2; i++) {    // loop twice, 45x2=90
            turn();                     // rotate 45 degrees clockwise
        }
    }

    // runs once per loop, dictates movement
    @Override
    public void act() {
        if(steps < length && canMove()) {   // conditions must be met before continuing
            move();         // move in target direction
            steps++;        // increment steps counter
        } else {
            rightTurn();    // make a right
            steps = 1;      // reset steps
        }
    }
}
