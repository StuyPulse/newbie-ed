public class Hero {
    private int attack; 
    private int maxHealth;
    private int currHealth;
    private int maxResource;
    private int currResource;
    public String name;
    private String resourceType;
    private static int numHeroesMade=0;
    
    public Hero(String name, int maxHealth, int attack, String resourceType, int maxResource ) {
        this.attack=attack;
        this.maxHealth=maxHealth;
        this.maxResource=maxResource;
        this.name=name;
        this.resourceType=resourceType;
        numHeroesMade++;
    }
    public void setAttack(int attack){
        this.attack=attack;
    }
    public int getAttack(){
        return this.attack;
    }
    public void setMaxHealth(int maxHealth){
        this.maxHealth=maxHealth;
    }
    public int getmaxHealth(){
        return this.maxHealth;
    }
    public void setmaxResource(int maxResource){
        this.maxResource=maxResource;
    }
    public int getMaxResource(){
        return this.maxResource;
    }
    public void setCurrResource(int currResource){
        this.currResource=currResource;
    }
    public int getCurrResource(){
        return this.currResource;
    }
    public void setName(String name){
            this.name=name;
    }
    public String getName(){
            return this.name;
    }
    public void setResourceType(String resourceType){
        this.resourceType=resourceType;
    }
    public String getResourceType(){
            return this.resourceType;
    }
    public void takeDamage(int n){
        this.currHealth=this.currHealth-n;
    }
    public int useAbility(String str, int n){
        System.out.println(this.name + " used " + str);
        return n;
    }
}   

