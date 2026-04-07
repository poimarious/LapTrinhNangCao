public class Main {
	public static void main(String[] args) {
        Hero hero = new Hero();
        if(hero instanceof CanSwim) {
            hero.swim();
        }
        if(hero instanceof CanFight) {
            hero.fight();
        }
	}
 }
