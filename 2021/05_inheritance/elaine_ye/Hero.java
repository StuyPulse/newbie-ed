  public class Hero {
    private String name;
    private int attack;
    private int maxHealth;
    private int currentHealth;
    private int maxResource;
    private int currentResource;
    private String resourceType;
    private static int heroesMade = 0;

    public Hero(String name, int attack, int health, int resource, String resourceType) {
        this.name = name;
	this.attack = attack;
	maxHealth = currentHealth = health;
	maxResource = currentResource = resource;
	this.resourceType = resourceType;
	heroesMade++;
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
	return currentResource;
   }

   public String getResourceType() {
	return resourceType;
   }

   public void setName(String str) {
	name = str;
   }

   public void setAttack(int n) {
	attack = n;
   }

   public void setMaxHealth(int n) {
	maxHealth = n;
   }

   public void setCurrentHealth(int n) {
	currentHealth = n;
	if(getCurrentHealth() > getMaxHealth())
		setCurrentHealth(getMaxHealth());
   }

   public void setMaxResource(int n) {
	maxResource = n;
   }

   public void setCurrentResource(int n) {
	currentResource = n;
	if(getCurrentResource() > getMaxResource())
		setCurrentResource(getMaxResource());
   }

   public void setResourceType(String str) {
	resourceType = str;
   }

   public void takeDamage(int n) {
	setCurrentHealth(getCurrentHealth() - n);
   }

   public int useAbility(String str, int n) {
	System.out.println(getName() + " used " + str + "!");
	return n;
   }

   }
