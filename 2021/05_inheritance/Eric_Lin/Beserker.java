public class Beserker extends Hero{
    public Berserker(String name, int atk, int maxHP){
        super(name, currentHP, maxHP, atk, "rage", currentResource, 50);
    }
    @override
    public int getAtk(){
        if(getCurrentResource >= 30)
            return 2 * super.getAtk();
        else 
            setCurrentResource(10 + getCurrentResource());
            return super.getAtk();
    }
    public burst(int n){
        setCurrentResource(0);
        int n = getCurrentResource();
        return useAbility("burst", 0);
    }
    public heal(){
        setCurrentHP(getCurrentResource() + getCurrentHP());
        setCurrentResource(0);
        return useAbility("heal", 0);
    }


    
}