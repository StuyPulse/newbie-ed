public class Car extends Vehicle{
    String hasHood;

    public Car(double weight, String manufacturer, int numOfSeats, String hasHood) {
        super(weight, manufacturer, numOfSeats);
        this.hasHood = hasHood;
    }

    @Override
    public void startEngine() {
        System.out.println("Super fast");
    }

    @Override
    public void stopEngine() {
        System.out.println("Super Fast");
    }
    
}
