package group1;

import info.gridworld.actor.Bug;

public class YasuoBug extends Bug {
    int steps;  
    int length; 

    public YasuoBug(int length) {
        this.steps = 0; 
        this.length = length; 
    }

    public YasuoBug() {
        this.steps = 0; 
        this.length = 4; 
    }

    private void halfTurn() {
        for(int i = 0; i < 4; i++) {
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
            steps = 0; 
        }
    }
}