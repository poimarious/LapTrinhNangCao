public class Solution {
	public int reverse(int n){
		int x = Math.abs(n);
		long ans = 0;
		while(x > 0) {
			ans = ans * 10 + x % 10;
			x /= 10;
		}
		if(n < 0) {
			return (int)-ans;
		}
		if(Math.abs(ans) > Integer.MAX_VALUE) {
			return 0;
		}
		return (int)ans;
	}
	public boolean isPalindrome(int n) {
		if(n < 0) return false;
		int x = reverse(n);
		return (n == x);
	}
}