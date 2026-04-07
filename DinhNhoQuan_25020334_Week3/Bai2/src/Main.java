public class Main {
	public static void main(String[] args) {
		Animal[] zoo = new Animal[4];
		zoo[0] = new Dog();
		zoo[1] = new Cat();
		zoo[2] = new Duck();
		zoo[3] = new Dog();
		for(Animal a : zoo) {
			a.makeSound();
		}
	}
 }
 /*
 Lý do con vịt kêu "Animal sound" là vì lớp Duck không ghi đè makeSound(), nên lớp Duck sẽ sử dụng hàm makeSound
 của lớp cha Animal.
 */
