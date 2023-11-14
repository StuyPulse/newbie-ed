package vehicles;
public class Truck extends Vehicle{
    private String driverName;

    public Truck(double weight, String manufacturer, int numOfSeats, String driverName) {
        super(weight, manufacturer, numOfSeats);
        this.driverName = driverName;
    }

    @Override
    public void startEngine() {
        System.out.println(this.driverName + " is starting the engine");
        
    }

    @Override
    public void stopEngine() {
        System.out.println(this.driverName + " is stopping the engine");
        
    }
}
