public class Main {
	public static void main(String[] args) {
		// Upcasting
		Animal a = new Dog();
		// Downcasting (Rủi ro)
		// Cat c=  (Cat) a;
		// c.makeSound();
		System.out.println("Before fixing:");
		try {
			Cat c= (Cat)a;
			c.makeSound();
		} catch(java.lang.ClassCastException e) {
			System.out.println(e);
		}

		System.out.println("After fixing:");
		if(a instanceof Cat) {
			Cat c = (Cat) a;
			c.makeSound();
		} else System.out.println("It's is not a cat!");
	}
 }
 /*
Biên dịch không lỗi.

Chạy chương trình lỗi:
Exception in thread "main" java.lang.ClassCastException: 
	class Dog cannot be cast to class Cat (Dog and Cat are in unnamed module of loader 'app') 
	at Main.main(Main.java:15)
*/

