package vehicles;
public class Car extends Vehicle {
    private String model;

    public Car(double weight, String manufacturer, int numOfSeats, String model) {
        super(weight, manufacturer, numOfSeats);
        this.model = model;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting" + this.model + "'s engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping" + this.model + "'s engine");
    }
    
}
