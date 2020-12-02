public class Hero {
    private int attack;
    private int health;
    private int maxHealth;
    private int resource;
    private int maxResource;
    private String resourceType;
    private String name;
    static int heroesMade = 0;

    public Hero(int attack, int maxHealth, int maxResource, String resourceType, String name) {
        this.name = name;
        this.attack = attack;
        this.maxHealth = health = maxHealth;
        this.maxResource = resource = maxResource;
        this.resourceType = resourceType;
        heroesMade++;
    }

    public int getAttack() {
        return attack;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getResource() {
        return resource;
    }

    public int getMaxResource() {
        return maxResource;
    }

    public String getResourceType() {
        return resourceType;
    }

    public String getName() {
        return name;
    }

    public void setAttack(int n) {
        attack = n;
    }

    public void setHealth(int n) {
        health = n;
        if(getHealth() > getMaxHealth())
            setHealth(getMaxHealth());
    }

    public void setMaxHealth(int n) {
        maxHealth = n;
    }

    public void setResource(int n) {
        resource = n;
        if(getResource() > getMaxResource())
            setResource(getMaxResource());
    }

    public void setMaxResource(int n) {
        maxResource = n;
    }

    public void setResourceType(String str) {
        resourceType = str;
    }

    public void setName(String str) {
        name = str;
    }

    public void takeDamage(int n) {
        setHealth(getHealth() - n);
    }

    public int useAbility(String str, int n) {
        System.out.println(getName() + " used " + str + "!");
        return n;
    }
}
