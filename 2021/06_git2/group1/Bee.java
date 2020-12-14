package group1;

import info.gridworld.actor.Bug;

public class Bee extends Bug {

    public Bee() {

    }

    @Override
    public void act() {
        while (!canMove()) {
            turn();
        }
        move();
    }
}