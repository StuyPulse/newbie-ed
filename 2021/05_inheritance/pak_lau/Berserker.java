public class Berserker extends Hero {

    public Berserker(int attack, int maxHealth, String name) {
        super(attack, maxHealth, 50, "rage", name);
    }

    @Override
    public int getAttack() {
        if(getResource() >= 30)
            return 2 * super.getAttack();
        else {
            setResource(getResource() + 10);
            return super.getAttack();
        }
    }

    public int burst() {
        int n = getResource();
        setResource(0);
        return useAbility("burst", n);
    }

    public void heal() {
        int n = getResource();
        setResource(0);
        setHealth(getHealth() + n);
    }

}
