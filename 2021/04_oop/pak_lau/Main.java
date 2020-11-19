public class Main {

    public static void main(String[] args) {
        // hMDT stands for handMeDownToyota
        Car hMDT = new Car("Tesla", "fold");

        System.out.println("Car: " + hMDT);

        // Task on hand:
        // Check if the chair is driving too much
        // If it is not, continue driving it
        // Otherwise destroy it

        // boolean ab = hMDT.willExplode();

        while (!hMDT.willExplode()) {
            hMDT.drive();
        }

        System.out.println("Whew that was close. Almost exploded.");
        hMDT.drive();
    }
}

