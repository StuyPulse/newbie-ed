public class Mage extends Hero{
    public Mage(String name, int atk, int maxHP){
        super(name, currentHP, maxHP, atk, "mana", currentResource, 100);
    }
    public fireball(){
        return useAbility("fireball", 70);
        setCurrentResource(getCurrentResource()-75);
    }
    public recoverMana(){
        setCurrentResource(getMaxResource());
    }
}
