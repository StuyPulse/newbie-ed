// notice how you only import the Shooter class from the robot package because you only create objects of that class, not the AbstractRobot class
import robot.Shooter;

// notice how you import Car, Truck, and Vehicle from the vehicles package because you create objects of those classes
import vehicles.Car;
import vehicles.Truck;
import vehicles.Vehicle;

public class Lesson9 {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[5];
        vehicles[0] = new Car(1000, "Toyota", 5, "Camry");
        vehicles[1] = new Car(2000, "Honda", 5, "Civic");
        vehicles[2] = new Car(3000, "Ford", 5, "Focus");
        vehicles[3] = new Truck(4000, "Chevy", 2, "Bob");
        vehicles[4] = new Truck(5000, "Dodge", 2, "Joe");
        // a for-each loop, where you don't need to know the size of the array, and you don't need to use the index
        // (only use this when you don't need the index)
        for (Vehicle v : vehicles) {
            v.startEngine();
            v.stopEngine();
        }

        // Create an instance of the Shooter class
        Shooter shooter = new Shooter("TeamA", 123, 5.0, 45.0);
        // Access fields from the AbstractRobot (parent) class
        System.out.println("Team Name (AbstractRobot): " + shooter.getTeamName());
        System.out.println("Team Number (AbstractRobot): " + shooter.getTeamNumber());
        // Access fields from the Shooter (child) class
        System.out.println("Shooter Speed: " + shooter.getShooterSpeed());
        System.out.println("Hood Angle: " + shooter.getHoodAngle());
    }
}
