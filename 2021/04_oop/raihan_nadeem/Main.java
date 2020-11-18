public class Main {
	public static void main (String[] args) {
	Car myCar = new Car("Tesla");
	System.out.println(myCar);
	for(int i = 0; i < 21; i++){
          myCar.drive();
    }
	myCar.repair();
	 for(int i = 0; i < 21; i++){
          myCar.drive();
   }
  }
}
