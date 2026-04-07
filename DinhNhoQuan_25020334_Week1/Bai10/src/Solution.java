public class Solution {

	public int secondLargest(int[] arr) {
		if(arr.length <= 1) return -1;
		int mx = 0;
		for(int i = 0; i < arr.length; i++) {
			if(mx < arr[i]) mx = arr[i];
		}
		int ans = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > ans && arr[i] < mx) ans = arr[i];
		}
		return ans;
	}
}