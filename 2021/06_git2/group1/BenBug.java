package group1; 

import info.gridworld.actor.Bug;

public class BenBug extends Bug {
    int steps; // a counter for how many steps we have taken 
    int length; // how far the bug will move 

    public BenBug(int length) {
        this.steps = 0; 
        this.length = length; 
    }

    public BenBug() {
        this.steps = 0; 
        this.length = 4; // 4 is the default
    }

    // this is a helper funtion 
    // it was not in the original Bug class
    private void halfTurn() {
        for(int i = 0; i < 4; i++) {
            turn(); 
        }
    }

    // this method will run once every loop 
    @Override
    public void act() {
        turn();
        if (steps < length) {
            if (canMove()) {
                move();
                steps++;
            } else {
                // turn and reset if cannot move
                turn();
                steps = 0;
            }
        } else {
            // half turn around and reset step counter if reached 4 steps
            halfTurn();
            steps = 0;
        }
    }
}