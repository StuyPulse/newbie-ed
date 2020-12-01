public class Mage extends Hero {

    public Mage(int attack, int maxHealth, String name) {
        super(attack, maxHealth, 100, "mana", name);
    }

    public int fireball() {
        setResource(getMaxResource() - 75);
        return useAbility("fireball", 70);
    }

    public void recoverMana() {
        setResource(getMaxResource());
    }
}
