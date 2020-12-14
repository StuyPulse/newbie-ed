public class Hero{
    private int atk;
    private int currentHP;
    private int maxHP;
    private int currentResource;
    private int maxResource;
    private String resourceType;
    private String name;

    static int heroesMade = 0;
    public Hero(String name, int currentHP, int maxHP, int atk, String resourceType, int currentResource, int maxResource){
      this.name = name;
      this.currentHP = currentHP;
      this.maxHP = maxHP;
      this.atk = atk;
      this.resourceType = resourceType;
      this.currentResource = currentResource;
      this.maxResource = maxResource; 
      heroesMade++;
    }
    public String getName(){
      return name;
    }
    public int getCurrentHP(){
      return currentHP;
    }
    public int getMaxHP(){
      return maxHP;
    }
    public int getAtk(){
      return atk;
    }
    public String getResourceType(){
      return resourceType;
    }
    public int getCurrentResource(){
      return currentResource;
    }
    public int getMaxResource(){
      return maxResource;
    }
    public int takeDamage(int n){
      return setCurrentHP(getCurrentHP() - n);
    }

    public void setCurrentHP(int n){
       currentHP = n;
       if (getCurrentHP() > getMaxHP())
        setCurrentHP(getMaxHP());

    }
    public void setMaxHP(int n){
       maxHP = n;
    }
    public void setAtk(int n){
       atk = n;
    }
    public void setResourceType(String str){
       resourceType = str;
    }
    public void setCurrentResource(int n){
      currentResource = n;
      if (getCurrentResource() > getMaxResource())
       setCurrentResource(getMaxResource());
    }
    public void setMaxResource(int n){
       maxResource = n;
    }

    public void setName(String s){
      name = s;
    }
    public String useAbility(String str, int n){
       return System.out.println(getName() + "used" + str);
    }



}