public class Account {
    private String id;
    private String name;
    private int balance;

    // Constructors 
    public Account (String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }
    public Account (String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    // Getters 
    public String getID() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public int getBalance() {
        return this.balance;
    }

    // Methods
    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }
    public int debit(int amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }
    public int transferTo(Account another, int amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }
}