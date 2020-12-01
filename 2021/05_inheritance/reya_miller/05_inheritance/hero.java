public class Hero {
    private int attack;
    private int currentHealth;
    private int maxHealth;
    private int currentResource;
    private int maxResource;
    private String resourceType;
    private String heroName;
    static int heroesMade;

    public Hero(String heroName, int maxHealth, int attack, String resourceType, int maxResource) {
        this.heroName;
        this.maxHealth;
        this.attack;
        this.resourceType;
        this.maxResource;
        this.heroesMade = heroesMade++;

        public String getHeroName() {
            return heroName;
        }
        public int getMaxHealth() {
            return maxHealth;
        }
        public int getAttack() {
            return attack;
        }
        public String getResourceType() {
            return resourceType;
        }

        public static void takeDamage(int n) {
            int n = maxHealth - currentHealth;
        }
        public static void attack() {
            return attack;
        }
        public static void useAbility(String str, int n) {
            System.out.println(heroName + " used " str + "!");
            return n;
        }

    }
    }
    public class Mage extends Hero {
        resourceType = "mana";
        maxResource = 100;
        
        public static void fireball(String str, int n) {
            super.useAbility();
            str = "fireball";
            n = 70;
            mana = mana - 75;
        }
        public static void recoverMana() {
            return resourceType;
        }
    }
    public class Berserker extends Hero {
        resourceType = "rage";
        maxResource = 50;

        public static void attack(int currentResource, int attack) {
            super.getAttack();
            if(currentResource >= 30) {
                return attack * 1.5;
            }
            else {
                return attack;
                currentResource = currentResource + 10;
            }
        }
        public static void burst(String str, int n) {
            super.useAbility();
            str = "burst";
            n = currentResource;
            currentResource = 0;
        }
        public static void heal() {
            currentHealth = currentHealth + currentResource;
            currentHealth =< maxHealth;
        }
    }
    public class Knight extends Hero {
        resourceType = "armor";
        maxResource = 15;

        public static void takeDamage(int n) {
            super.takeDamage();
            currentHealth = currentHealth - (n - currentResource);
            currentResource = 0;
        }
        public static void attack() {
            super.attack();
            currentResource = currentResource + 5;
            currentResource =< maxResource;
            return attack;
        }
        public static void charge(String str, int n) {
            super.useAbility();
            str = "charge";
            n = currentResource * 3;
            currentResource = 0;
        }
    }