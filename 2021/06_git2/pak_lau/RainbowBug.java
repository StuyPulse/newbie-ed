
package pak_lau;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

import java.awt.Color;

public class RainbowBug extends Bug {
    
    private float h;

    public RainbowBug() {
    }

    private Color getNewColor() {
        return Color.getHSBColor(h++, 1.0f, 1.0f);
    }

    public void act() {
        setColor(getNewColor());
    }

}
