package group3;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class BoxBugSpiral extends Bug{
    int CurrentSideLength = 4;
    int steps;

    public void SpiralBugRgitunner() {
        if (steps > CurrentSideLength && canMove()){
            move();
            steps ++;
        }
        else {
            setDirection(getDirection()) + Location.Right);
            steps = 0;
            CurrentSideLength ++;
        }
    }
}