public class Solution {
	public int gcd(int a, int b) {
		if(b > a) {
			int x = a;
			a = b;
			b = x;
		}
		int ans = 1;
		while(a % b > 0) {
			int x = b;
			b = a % b;
			a = x;
		}
		return b;
	}
}