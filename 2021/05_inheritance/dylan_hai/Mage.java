public class Mage extends Hero {
    
    

    public Mage(String name, int maxHealth, int attack, String resourceType, int maxResource){
        super(name, maxHealth, attack, resourceType, maxResource);
        this.setMaxHealth(100);
        this.setResourceType("Mana");
    }

    public void fireball() {
        useAbility("fireball", 70);
        this.setCurrResource(this.getCurrResource()-75);
    }

}