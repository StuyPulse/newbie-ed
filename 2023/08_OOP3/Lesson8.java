public class Lesson8 {
    public static void main(String[] args) {

    // Test Account class
    Account a1 = new Account("A101", "Elon", 1000000);
    Account a2 = new Account("A102", "Freshman"); // default balance 
    // Test Getters and display info
    System.out.println("ID: " + a1.getID());
    System.out.println("Name: " + a1.getName());
    System.out.println("Balance: " + a1.getBalance());
    System.out.println("ID: " + a2.getID());
    System.out.println("Name: " + a2.getName());
    System.out.println("Balance: " + a2.getBalance());
    // Test credit() and debit()
    a1.credit(100);
    System.out.println("Balance: " + a1.getBalance());
    a1.debit(50);
    System.out.println("Balance: " + a1.getBalance());
    a2.debit(500);  // debit() error because balance < amount
    System.out.println("Balance: " + a1.getBalance()); // balance unchanged
    // Test transferTo()
    a2.transferTo(a1, 100); 
    System.out.println("Balance: " + a1.getBalance());
    System.out.println("Balance: " + a2.getBalance());
    a2.transferTo(a1, 1000000); // transferTo() error because balance < amount
    System.out.println("Balance: " + a1.getBalance());
    System.out.println("Balance: " + a2.getBalance());

    // Test Ball and Player classes
    Ball b1 = new Ball(0, 0, 0);
    Ball b2 = new Ball(10, 10, 10);
    Player p1 = new Player(1, 0, 0);
    Player p3 = new Player(3, 10, 10, 10);
    // Test setXYZ() and getters
    b1.setXYZ(1, 1, 1);
    System.out.println("X: " + b1.getX());
    System.out.println("Y: " + b1.getY());
    System.out.println("Z: " + b1.getZ());
    // Test isNear()
    System.out.println("Is p1 near b1? " + p1.isNear(b1)); // true because z = 0
    System.out.println("Is p3 near b1? " + p3.isNear(b1)); // false because z = 10
    // Test kick()
    p1.kick(b1);
    System.out.println("X: " + b1.getX());
    System.out.println("Y: " + b1.getY());
    System.out.println("Z: " + b1.getZ());
    }
}



