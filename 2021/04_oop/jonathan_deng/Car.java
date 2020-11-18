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
    color="colourless";
  }


  public void explode() {
    for (int i=5;i > 0;i--){
      System.out.println(i);
}
	System.out.println("haha car go boom");
  }
public boolean willExplode(){
	return(mileage>=MAX_MILEAGE);
}
  public void repair() {
    System.out.println("Repaired!");
  }
public String toString() {
    return "This car is a " + color + " " + model;
  }
  public void drive(){
   if(willExplode())
   explode();
   else{
	System.out.println("vroom");
         mileage++;  
           
}
  
}
}
