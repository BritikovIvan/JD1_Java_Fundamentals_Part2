package by.htp.les05.main;

public class Main10 {

	/*
	 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для
	 * которых аi > i.
	 */

	public static void main(String[] args) {
		int[] a = { 1, 7, 0, 2, 7, 4, 9 };
		
		print(a);
	}

	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] > i) {
				System.out.println("A[" + i + "] = " + a[i]);
			}
		}
	}
	
}
