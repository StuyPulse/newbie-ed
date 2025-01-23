public class Lesson7 {
    public static void main(String[] args) {
        Car car1 = new Car(1, "nissan", 2, "altima");
        Car car2 = new Car(2, "Honda", 4, "Recent");
        Truck truck1 = new Truck(1, "monster", 4, "Richie");
        Truck truck2 = new Truck(7, "Tesla", 1, "Fatou");

        Vehicle[] garage = {car1, car2, truck1, truck2};
        int[] arr = {1,2,3,4};

        for (int i = 0; i < garage.length; i++) {
            garage[i].startEngine();
        }

        for (int i = 0; i < garage.length; i++) {
            garage[i].stopEngine();
        }
        
    }     
}
