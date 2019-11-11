package by.htp.les05.main;

public class Main11 {

	/*
	 * Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток
	 * от деления на М равен L (0 < L < М-1).
	 */

	public static void main(String[] args) {
		int[] a = { 1, 2, 13, 11, 20 };
		int M = 9;
		int L = 2;
		int[] a1;
		
		a1 = fun(a, M, L);
		print(a1);
	}
	
	public static int[] fun(int[] a, int M, int L) {
		int[] a1;
		int length = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % M == L) {
				length++;
			}
		}
		
		a1 = new int[length];
		length = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % M == L) {
				a1[length++] = a[i];
			}
		}
		
		return a1;
	}
	
	public static void print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Ar[" + i + "] = " + ar[i]);
		}
	}

}
