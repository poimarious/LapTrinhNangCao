public class Main {

	public static void swap(NumberWrapper A, NumberWrapper B) {
		NumberWrapper tmp = A;
		A = B;
		B = tmp;		
	}

	public static void main(String[] args) {
		NumberWrapper n1 = new NumberWrapper(5);	
		NumberWrapper n2 = new NumberWrapper(10);
		swap(n1, n2);
		n1.getValue();
		n2.getValue();
	}
}