  public class Hero {
    private String name;
    private int attack;
    private int maxHealth;
    private int currentHealth;
    private int maxResource;
    private int currentResource;
    private String resourceType
    static int heroesMade = 0;

    public Hero(String name, int attack, int health, int resource, String resourceType) {
        this.name = name;
	this.attack = attack;
	maxHealth = currentHealth = health;
	maxResource = currentResource = resource;
	this.resourceType;
	heroesMade++
    }

   public String getName(){
	return name;
   }

   public int getAttack() {
	return attack;
   }

   public int getMaxHealth() {
	return maxHealth;
   }

   public int getCurrentHealth() {
	return currentHealth;
   }

   public int getMaxResource() {
	return maxResource;
   }

   public int getCurrentResource() {
	return currentresource;
   }

   public String getResourceType() {
	return resourceType;
   }

   public void setName(String str) {
	name = str;

   public void setAttack(int n) {
	attack = n;
   }

   public void setMaxHealth(int n) {
	maxHealth = n;
   }

   public void setCurrentHealth(int n) {
	currentHealth = n;

   public void setMaxResource(int n) {
	maxResource = n;
   }

   public void setCurrentResource(int n) {
	currentResource = n;
   }

   public void setResourceType(String str) {
	resourceType = str;
   }
   public void takeDamage(int n) {
	healthLost = n; 
   }

   public void attack() {
	return attack
   }

   public void useAbility(String str, int n)
	
