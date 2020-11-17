# Exercise
Edit the Car class to contain the requirements below (copy and paste the code into Car.java in your own folder (named as first_last) in this directory)
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
1. Add a new int field called mileage that is set to 0
2. Add a field called `private static final int MAX_MILEAGE = 20;`
3. Create a new constructor where it only takes in the model of a car and sets color to "colorless"
4. Add a method called `willExplode()` which returns whether or not a car will explode (if mileage is greater or equal to max mileage)
5. Edit the method repair() to set the mileage back to 0
6. Add a new private method called `explode()` that will count down from 5 and once it reaches 0, print out `haha car go boom`
7. Add a method called `drive()` that if it will explode, then run explode(), and it not, print out vroom and increment the mileage by 1;
