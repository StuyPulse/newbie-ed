public class Main {
    public static void main(String[] args) {
        Berserker b = new Berserker("Dylan", 100, 10, "Shield", 150);
        b.burst();
        System.out.println("Curr Resource " + b.getCurrResource());
        b.heal();
        System.out.println("Curr Resource " + b.getCurrResource());

        Knight k = new Knight("Sir Dylan", 100, 10, "Armor", 150);
        System.out.println("Curr Resource " + k.getCurrResource());
        k.charge();
        System.out.println("Curr Resource " + k.getCurrResource());
    }
}
