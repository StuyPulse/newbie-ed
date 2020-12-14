package group1;

import info.gridworld.actor.Bug;

public class SammyBug extends Bug {

    int iter = 0;
    public SammyBug() {

    }

    @Override
    public void act() {
        if(canMove()) {
            move();
            turn(); turn();
        } else {
            move();
        }
    }

}