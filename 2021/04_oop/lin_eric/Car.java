public class Car {
  private String model;
  private String color;
  private int milage;
  private static final int MAX_MILAGE = 20;

  public Car(String model, String color) {
    this.model = model;
    this.color = color;
  }
  public Car(String model){
  this.model = model;
  color = "colorless";
}

  public void repair() {
  milage = 0;
  System.out.println("Repaired!");
 }
 public boolean willExplode() {
 if(milage >= MAX_MILAGE){
  return true;}
  return false;
}
 public void explode() {
 for(int explodeOrNot = 5; explodeOrNot >=0; explodeOrNot --){System.out.println(explodeOrNot);
 if(explodeOrNot == 0){
 System.out.println("haha car go boom");  
}}}
  public String toString() {
    return "This car is a " + color + " " + model;
  }
 public void drive(){
 if( willExplode() == true) 
 {explode();}
 else{
 System.out.println("vroom");
 milage++;
}}}
