package group3;

import info.gridworld.actor.Bug;

public class BoxBugKevin extends Bug {
    int steps; // a counter for how many steps we have taken
    int length; // how far the bug will move

    public BoxBugKevin(int length) {
        this.steps = 0;
        this.length = length;
    }

    public BoxBugKevin() {
        this.steps = 0;
        this.length = 4; // 4 is the default
    }

    // this is a helper funtion
    // it was not in the original Bug class
    private void quarterTurn() {
        for(int i = 0; i < 2; i++) {
            turn();
        }
    }

    // this method will run once every loop
    @Override
    public void act() {
        if(steps < length && canMove()) {
            // move and increment steps
            move();
            steps++;
        }
        else {
            // turn around and set counter to 0
            quarterTurn(); 
            steps = 0;
        }
    }
}
