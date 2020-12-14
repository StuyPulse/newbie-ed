public class Berserker extends Hero {
    public Berserker(String name, int maxHealth, int attack, String resourceType, int maxResource){
        super(name, maxHealth, attack, resourceType, maxResource);
        this.setmaxResource(50);
        this.setResourceType("Rage");
    }

    @Override
    public int getAttack(){
        if (this.getMaxResource()>=30){
         return 2*this.getAttack();  
        }
        else {
            this.setCurrResource(this.getCurrResource()+10);
            return this.getAttack();
        }
    }
    public void burst() {
        useAbility("burst",0);
    }
    public void heal() {
        this.setCurrResource(this.getMaxResource());
    }
}

