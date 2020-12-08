package derekLi; 

import info.gridworld.actor.Bug;

public class BoxBug extends Bug {
    int steps; 
    int length;

    public BoxBug(int length) {
        this.steps = 0; 
        this.length = length; 
    }

    public BoxBug() {
        this.steps = 0; 
        this.length = 4;
    }
    private void halfTurn() {
        for(int i = 0; i < 2; i++) {
            turn(); 
        }
    }

    @Override
    public void act() {
        if(steps < length && canMove()) {
            move(); 
            steps++; 
        }
        else {
            halfTurn(); 
            steps = 1; 
        }
    }
}