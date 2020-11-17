public class Test {

    public static void main(String[] args) {

        Car car = new Car("tesla");
        for (int i = 0; i <= 20; i++) {
            car.drive();
        }
        car.repair();
        System.out.println(car.willExplode());
    }


}
