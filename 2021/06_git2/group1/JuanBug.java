package group1; 

import info.gridworld.actor.Bug;


public class JuanBug extends Bug{
    // how many boxes we've moved so far and how much we can move
    int steps;
    int length;
    
    public JuanBug(int length) {
        this.steps = 0;
        this.length = length;
    }

    // JUAN(shaurya) SUPREMACY
    @Override
    public void act() {
        // j u a n 
        while (steps < length && canMove()) {
            // move lol
            move();
            // increase how many steps we've taken
            steps++;
        }

        System.out.println("Juan instantly wins lol");

    }
}