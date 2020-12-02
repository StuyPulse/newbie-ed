

public class Mage extends Hero {

    public Mage(String name, int attack, int maxHealth) {
        super(name, attack, maxHealth, 100, "mana");
    }

    public int fireball() {
        setCurrentResource(getMaxResource() - 75);
        return useAbility("fireball", 70);
    }

    public void recoverMana() {
        setCurrentResource(getMaxResource());
    }
}
