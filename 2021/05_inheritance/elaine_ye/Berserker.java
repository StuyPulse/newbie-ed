   public class Berserker extends Hero {

	public Berserker(String name, int attack, int maxHealth) {
	   super(name, attack, maxHealth, 50, "rage");
	}

	@Override
	public int getAttack() {
	   if(getCurrentResource() >= 30)
	      return 2 * super.getAttack();
	   else {
	      setCurrentResource(getCurrentResource() + 10);
	      return super.getAttack();
	   }
	}

	public int burst() {
	   int n = getCurrentResource();
	   setCurrentResource(0);
	   return useAbility("burst", n);
	}

	public void heal() {
	   int n = getCurrentResource();
	   setCurrentHealth(getCurrentHealth() + n);
	}
   }
