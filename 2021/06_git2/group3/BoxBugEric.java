package group3;
public class BoxBugEric extends Bug{
    int steps;
    int length;
    public BoxBugEric(int length){
        this.length =  length;
        this.steps = step;
    }
    public BoxBugEric(){
        this.length = 4; //default
        this.steps = 0;
    }
    public void turn(){
        if (steps < length && canMove());
            move ();
            steps ++;
        else {
            turn();
            steps = 0;
        }
            
    }
}
