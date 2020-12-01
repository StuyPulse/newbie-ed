public class Knight extends Hero {

    public Knight(int attack, int maxHealth, String name) {
        super(attack, maxHealth, 15, "armor", name);
    }

    @Override
    public void takeDamage(int n) {
        setHealth(getHealth() - (n - getResource()));
        setResource(0);
    }

    @Override
    public int getAttack() {
        setResource(getResource() + 5);
        return super.getAttack();
    }

    public int charge() {
        int n = getResource();
        setResource(0);
        return useAbility("charge", 3 * n);
    }

}
