public class Knight extends Hero {
    public Knight(String name, int maxHealth, int attack, String resourceType, int maxResource){
        super(name, maxHealth, attack, resourceType, maxResource);
        this.setResourceType("Armor");
        this.setmaxResource(15);
        this.setCurrResource(15);
    }
    
    @Override
    public void takeDamage(int n){
        if (n>this.getMaxResource()){
            this.takeDamage(n-this.getMaxResource());
        }
    }
    @Override
    public int getAttack(){
        if (this.getCurrResource()+5>this.getMaxResource()){
            this.setCurrResource(this.getMaxResource());
        }
        else {
            this.setCurrResource(this.getCurrResource()+5);

        }
        return this.getAttack();
    }
    public void charge(){
        useAbility("charge",3*getCurrResource());
        this.setCurrResource(0);
    }

}
