public class Main {
	public static void main(String[] args) {
		//System.out.println(Solution.fibonacci(100));
		Solution sol = new Solution();
		for(int i = 1; i <= 100; i++) {
			System.out.println(sol.fibonacci(i));
		}
	}
}