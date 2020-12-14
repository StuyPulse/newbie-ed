package group1;

import info.gridworld.actor.Bug;

import java.awt.Color;

public class MommyMilkers extends Bug {
    
    private float hDegrees;

    public MommyMilkers() {
        hDegrees = 0.0f;
    }

    @Override
    public void act() {
        setColor(Color.getHSBColor(hDegrees / 360.0f, 1.0f, 1.0f));

        if (!canMove())
            turn();
        else
            turn();

        hDegrees += 1.0f;
    }

}
