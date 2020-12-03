   public class  Knight extends Hero {

	public Knight(String name,int attack, int maxHealth) { 
	   super(name, attack, maxHealth, 15, "armor");
	}

	@Override
	public void takeDamage(int n) {
	   setCurrentHealth(getCurrentHealth() - (n - getCurrentResource()));
	   setCurrentResource(0);
	}

	@Override
	public int getAttack() {
	   setCurrentResource(getCurrentResource() + 5);
	   return super.getAttack(); 
	}

	public int charge() {
	   int n = getCurrentResource();
	   setCurrentResource(0);
	   return useAbility("charge", 3 * n);
	}
   }
