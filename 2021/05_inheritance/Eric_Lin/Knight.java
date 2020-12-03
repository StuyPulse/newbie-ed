public class Kinght extends Hero{
    public Knight(String name, int atk, int maxHP){
        super(name, currentHP, maxHP, atk, "armor", currentResource, 15);
    }
    @override
    public int takeDamage(int n){
        setCurrentHP(getCurrentHP(n - getCurrentResource()));
        setCurrentResource(0);
    }
    @override
    public int getAtk(){
        setCurrentResource(getCurrentResource()+ 5 );
        return super.getAtk();
    }
    public charge(){
        return useAbility("charge", 3 * currentResource);
        setCurrentResource(0);
    }
}