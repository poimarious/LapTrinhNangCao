import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
    
        Warehouse<Food > foods = new Warehouse<>("Kho Thuc pham");
        Warehouse<Electronic > electronics = new Warehouse<>("Kho Dien tu");

        for(int i = 0; i < n; i++) {
            String type = sc.next();
            if(type.equals("F")) foods.addProduct(new Food(sc.next(), sc.next(), sc.next()));
            else electronics.addProduct(new Electronic(sc.next(), sc.next(), sc.nextInt()));
        }
        foods.show();
        electronics.show();
    }
 }
