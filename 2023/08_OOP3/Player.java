public class Player {
    private int number;
    private double x;
    private double y;
    private double z;

    // Constructors
    public Player(int number, double x, double y) {
        this.number = number;
        this.x = x;
        this.y = y;
        this.z = 0; // default value of z because people are on the floor
    }

    public Player(int number, double x, double y, double z) {
        this.number = number;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    public void jump(double zDisp) {
        this.z += zDisp;
    }

    public boolean isNear(Ball ball) {
        // return true if distance between player and ball is less than 8 
        return Math.sqrt(Math.pow(this.x - ball.getX(), 2) + Math.pow(this.y - ball.getY(), 2) + Math.pow(this.z - ball.getZ(), 2)) < 8;
    }

    public void kick(Ball ball) {
        if (isNear(ball)) {
            ball.setXYZ(this.x, this.y, this.z + 5); // kicks the ball up from where the player is
        }
        else {
            System.out.println("Player " + this.number + " is not near the ball");
        }
    }
}
