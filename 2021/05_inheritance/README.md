# Exercise for Inheritance
Slides: https://docs.google.com/presentation/d/12hOHTCozxR50GR-TB2lv7IknopCpWzUnPOd5ZjeXWnU/edit?usp=sharing

Recording: https://drive.google.com/file/d/155qx4K6wS-7QVjgAgrNs8v7F_kJkKmFY/view?usp=sharing

1. Create a folder in this directory (name is as first_last) and then cd into it
2. Create a Hero class
	1. It should have private fields that store the hero's attack, health, and resource stats
		- Also add a field to contain resource type and a field to hold the name of the hero
		- Keep in mind that there is a difference between current and max health (same for resources)
	2. Add a static field that contains how many heroes have been made (default value is 0)
	3. It should have a constructor that takes in name, max health, attack, resource type, and max resource and increment heroesMade
	4. It should have setters and getters for those fields
	5. It should have a method called `takeDamage(int n)` where n is the amount of health lost
	6. It should have a method called `useAbility(String str, int n)` that prints out that the hero used the ability str and returns n
		- Ex: the hero is called "Sam" and you call useAbility("heal"), it should print out "Sam used heal!"
3. Create a Mage class that extends the Hero class
	1. The Mage class's resource type is "mana" and the max amount is 100
	2. It should have a constructor that takes in all the missing parameters for the super constructor
	3. It should have a method called `fireball()` that uses `useAbility()`, where `str` is "fireball" and `n` is 70, then decrease the mana by 75
	4. It should have a new method called `recoverMana()` that recovers all of the mana that the Mage has used
4. Create a Berserker class that extends the Hero class
	1. The Berserker class's resource type is "rage" and the max amount is 50
	2. It should have a constructor that takes in all the missing parameters for the super constructor
	3. It should override the `getAttack() method` where if rage >= 30, then it returns 2x the attack, and if it doesn't it returns attack and increases rage by 10
	4. It should have a method called `burst()` that uses `useAbility()`, where `str` is "burst" and `n` is the amount of rage the Berserker has, then set rage to 0
	5. It should have a method called `heal()` that takes rage and converts it to health (all of the rage is consumed and the Berserker regains that amount of health up to a cap set by max health)
5. Create a Knight class that extends the Hero class
	1. The Knight class's resource type is "armor" and the max amount is 15
	2. It should have a constructor that takes in all the missing parameters for the super constructor
	3. It should override the `takeDamage(int n)` method where it subtracts n - armor from health and set armor to 0
	4. It should override the `getAttack() method` where it gains increases armor by 5 (up to a cap set by max armor) and returns attack
	5. It should have a method called `charge()` that uses `useAbility()`, where `str` is "charge" and `n` is the 3x the amount of armor the Knight has, then set armor to 0
