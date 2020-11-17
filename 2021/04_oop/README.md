# Exercise
1. Edit the Car class
```
public class Car {
  private String model;
  private String color;

  public Car(String model, String color) {
    this.model = model;
    this.color = color;
  }

  public void repair() {
    System.out.println("Repaired!");
  }

  public String toString() {
    return "This car is a " + color + " " + model;
  }
}
```
