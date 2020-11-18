public class Car {
  private String model;
  private String color;
  private int mileage = 0;
  private static final int MAX_MILEAGE = 20;

  public Car(String model, String color) {
    this.model = model;
    this.color = color;
  }

  public Car(String model) {
    this.model = model;
    this.color = "colorless";
  }

  public boolean willExplode() {
    return mileage >= MAX_MILEAGE;
  }

  public void repair() {
    mileage = 0; 
    System.out.println("Repaired!");
  }

  private void explode() {
    System.out.println("5");
    System.out.println("4");
    System.out.println("3");
    System.out.println("2");
    System.out.println("1");
    System.out.println("0");
    System.out.println("haha car go boom boom");
  }
  public void drive() {
    if (willExplode()) {
      explode();
    } else {
      System.out.println("vroom");
      mileage++;
    }
  }

  public String toString() {
    return "This car is a " + color + " " + model;
  }
}
