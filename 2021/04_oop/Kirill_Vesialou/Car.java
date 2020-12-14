public class Car {
  private String model;
  private String color;
  private int mileage = 0 
  private static final int MAX_MILEAGE = 20;

  public Car(String model, String color) {
    this.model = model;
    this.color = "colorless";
  }

  public void repair() {
    int mileage = 0
    System.out.println("Repaired!");
  }

  public String toString() {
    return "This car is a " + color + " " + model;
  }


  public boolean willExplode() {
    if (mileage>=MAX_MILEAGE) {
      return true;
    } 
    else {
      return false;
    }
  }

  public void explode() {
    for(i = 5, i > 0, i--); {
      System.out.println(i);
    }
    if (i=0) {
      System.out.println("haha car go boom");
    }
  }

  public void drive () {
    if (willExplode())
      explode();
    } 
    else {
      System.out.println("vroom");
      mileage++;
    }
  }
}