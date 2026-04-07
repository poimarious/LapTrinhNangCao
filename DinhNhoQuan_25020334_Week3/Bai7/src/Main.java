import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Room room;
		if(sc.next().equals("S")) {
			room = new StandardRoom(sc.nextInt());
		} else room = new VipRoom(sc.nextInt());
		System.out.println(room.calPrice());
	}
 }
