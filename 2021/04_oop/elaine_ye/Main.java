public class Main {
  public static void main(String[] args) {
    Car shinyCar = new Car("Toyota");
    System.out.println(shinyCar);

    for (int i = 0; i < 21; i++) {
      shinyCar.drive();
    }

      shinyCar.repair();
      for (int i = 0; i < 21; i++) {
        shinyCar.drive();
      }
  }
}


