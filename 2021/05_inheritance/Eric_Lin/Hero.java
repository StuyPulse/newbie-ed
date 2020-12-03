public class Hero{
    private int atk;
    private int currentHP;
    private int maxHP;
    private int currentResource;
    private int maxResource;
    private String resourceType;
    private String name;

    static int heroesMade = 0;
    public herostats(String name, int currentHP, int maxHP, int atk, String resourceType, int currentResource, int maxResource){
      this.name = name;
      this.currentHP = currentHP;
      this.maxHP = maxHP;
      this.atk = atk;
      this.resourceType = resourceType;
      this.currentResource = currentResource;
      this.maxResource = maxResource; 
      heroesmade ++;
    }
    public String getName(){
      return name;
    }
    public int getCurrentHP(){
      return currentHP;
    }
    public int getMaxHP(){
      return naxHP;
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
    public String getName(){
      return name;
    }
    public int takeDamage(int n){
      setCurrentHP(getCurrentHP() - n);
    }

    public int setCurrentHP(int n){
      currentHP = n;
    }
    public int setMaxHP(int n){
      maxHP = n;
    }
    public int setAtk(int n){
      atk = n;
    }
    public int setResourceType(int str){
      resourceType = str;
    }
    public int setCurrentResource(int n){
      currentResource = n;
    }
    public int setMaxResource(int n){
      maxResource = n;
    }

    public int setName(String s){
      name = s;
    }
    public String useAbility(String str, int n){
      System.out.println(setName() + "used" + str);
    }



}