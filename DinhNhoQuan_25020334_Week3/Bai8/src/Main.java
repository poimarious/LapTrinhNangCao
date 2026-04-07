import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Amount:");
		int amount = sc.nextInt();

		Robot[] robots = new Robot[amount];

		for(int i = 0; i < robots.length; i++) {
			String type = sc.next();
			if(type.equals("DR")) {
				robots[i] = new DroneRobot(sc.nextInt(), sc.next());
			} else if(type.equals("FR")) {
				robots[i] = new FishRobot(sc.nextInt(), sc.next());
			} else robots[i] = new AmphibiousRobot(sc.nextInt(), sc.next());
		}

		for(int i = 0; i < robots.length; i++) {
			System.out.println();
			robots[i].performMainTask();
			if(robots[i] instanceof Flyable) {
				((Flyable)robots[i]).fly();
			}
			if(robots[i] instanceof Swimmable) {
				((Swimmable) robots[i]).swim();
			}
			if(robots[i] instanceof GPS) {
				((GPS) robots[i]).getCoordinates();
			}
		}
	}
 }
