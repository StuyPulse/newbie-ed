public class Hero {
    private int attack;
    private int currentHealth;
    private int maxHealth;
    private int resource;
    private int maxResource;
    private String resourceType;
    private String heroName;
    static int heroesMade = 0;

public Hero(String heroName, int maxHealth, int attack, int maxResource, String resourceType) {
    this.heroName = heroName;
    this.maxHealth = maxHealth;
    this.attack = attack;
    this.maxResource = maxResource;
    this.resourceType = resourceType;
    heroesMade++;
}

public String getHeroName() {
    return heroName;
}

public int getCurrentHealth() {
    return currentHealth;
}

public int getMaxHealth() {
    return maxHealth;
}

public int getAttack() {
    return attack;
}

public int getMaxResource() {
    return maxResource;
}

public String getResourceType() {
    return resourceType;
}

public void setHeroName(String str) {
    heroName = str;
}

public void setMaxHealth(int n) {
    maxHealth = n;
}

public void setCurrentHealth(int n) {
    currentHealth = n;
    if (currentHealth > maxHealth) {
        setCurrentHealth(maxHealth);
    }
}

public void setAttack(int n) {
    attack = n;
}

public void setMaxResource(int n) {
    maxResource = n;
}

public void setResourceType(String str) {
    resourceType = str;
}

public void takeDamage(int n) {
    setCurrentHealth(getCurrentHealth() - n);
}

public int useAbility(String str, int n) {
    System.out.println(getHeroName() + "used" + str + "!");
    return n;
}
}