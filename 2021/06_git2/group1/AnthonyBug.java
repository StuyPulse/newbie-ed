package group1;

import info.gridworld.actor.Bug;

public class AnthonyBug extends Bug {
    int steps;
    int length;

    public AnthonyBug() {
        this.steps = 0; 
        this.length = 4;
    }

    @Override
    public void act() {
        if(steps < length && canMove()) {
            move(); 
        }
    }
}
