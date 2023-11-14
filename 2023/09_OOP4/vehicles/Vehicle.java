package vehicles;
public abstract class Vehicle {
    double weight;
    String manufacturer;
    int numOfSeats;

    public Vehicle(double weight, String manufacturer, int numOfSeats) {
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.numOfSeats = numOfSeats;
    }

    public abstract void startEngine(); 
    public abstract void stopEngine();
}
