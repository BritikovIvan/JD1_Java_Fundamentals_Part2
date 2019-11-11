package by.htp.les05.main;

public class Main15 {

	/*
	 * Дана последовательность действительных чисел. Указать те ее
	 * элементы, которые принадлежат отрезку [с, d].
	 */

	public static void main(String[] args) {
		int[] a = { 1, 4, 8, -2, 34, 81, 2 };
		int c = -10;
		int d = 5;
		int[] ar;
		
		ar = fun(a, c, d);
		print(ar);
	}
	
	public static void print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Ar[" + i + "] = " + ar[i]);
		}
	}
	
	public static int[] fun(int[] a, int c, int d) {
		int[] ar;
		int length = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= c && a[i] <= d) {
				length++;
			}
		}
		
		ar = new int[length];
		length = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= c && a[i] <= d) {
				ar[length++] = a[i];
			}
		}
		
		return ar;
	}

}
