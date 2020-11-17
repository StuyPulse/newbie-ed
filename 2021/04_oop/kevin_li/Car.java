public class Car {
  private String model;
  private String color;
  private int mileage = 0;
  private static final int MAX_MILEAGE = 20;
  private int x = 5;
  public Car(String model, String color) {
    this.model = model;
    this.color = color;
    this.mileage = 0;
  }
  public Car(String model) {
    this.color = model;
    color = "colorless";
  }
  public boolean willExplode() {
  if (mileage >= MAX_MILEAGE)
     return true;
  return false;
  }
  public void repair() {
    mileage = 0;
    System.out.println("Repaired!");
  }
  private void explode() {
while (x > 0) {
System.out.println(x--);
}
if (x == 0)
System.out.println("haha car go boom");
}
  public void drive() {
    if (willExplode())
       explode();
    else System.out.println("vroom");
         mileage++;
}
  public String toString() {
    return "This car is a " + color + " " + model;
  }
}
