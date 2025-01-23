public class Truck extends Vehicle{
    String driverName;

    public Truck(double weight, String manufacturer, int numOfSeats, String driverName) {
        super(weight, manufacturer, numOfSeats);
        this.driverName = driverName;
    }

    @Override
    public void startEngine() {
        System.out.println("start engine...");
    }

    @Override
    public void stopEngine() {
        System.out.println("stop engine...");
    }
    
}
