package by.htp.les05.main;

public class Main16 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 6, 2};
		int max;
		
		max = max(a);
		System.out.println("max = " + max);
	}
	
	public static int max(int[] a) {
		int max = a[0] + a[a.length - 1];
		int perm;
		
		for (int i = 1; i < a.length / 2; i++) {
			perm = a[i] + a[a.length - i - 1]; 
			if (perm > max) {
				max = perm;
			}
		}
		
		return max;
	}

}
