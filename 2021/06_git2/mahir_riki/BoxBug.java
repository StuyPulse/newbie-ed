package mahir_riki;

import javax.swing.Box;

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

    public void quarterTurn() {
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
            quarterTurn();
            steps = 0;
        }
    }
    
}
