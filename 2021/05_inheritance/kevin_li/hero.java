public class Hero{
	private String name;
	private String resourceType;
	private int attack;
	private int currentHealth;
	private int currentResource;
	private int maxHealth;
	private int maxResource;
	static int heroesMade = 0;

public Hero(String name, int health, int attack, String resourceType,int resource) {
	this.name = name;
	this.resourceType = resourceType;
	maxHealth = currentHealth = health;
	maxResource = currentResource = resource;
	heroesMade++;
	}

public int getMaxHealth(){
	return maxHealth;
}
public int getCurrentHealth(){
	return currentHealth;
}
public int attack(){
	return attack;
}
public int getMaxResource(){
	return maxResource;
}
public int getCurrentResource(){
	return currentResource;
}
public String getName(){
	return name;
}
public String getResourceType(){
	return resourceType;
}

public void setMaxHealth(int arg){
	maxHealth = arg;
}
public void setCurrentHealth(int arg){
	currentHealth = arg;
}
}
