package by.htp.les05.main;

public class Main17 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 1, 7, 3};
		int[] ar;
		
		ar = fun(a);
		print(ar);
	}
	
	public static void print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Ar[" + i + "] = " + ar[i]);
		}
	}
	
	public static int[] fun(int[] a) {
		int[] ar;
		int min;
		int length;
		int j;
		
		min = min(a);
		length = a.length;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == min) {
				length--;
			}
		}
		
		ar = new int[length];
		j = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != min) {
				ar[j++] = a[i];
			}
		}
		
		return ar;
	}
	
	public static int min(int[] a) {
		int min = a[0];
		
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		
		return min;
	}

}
