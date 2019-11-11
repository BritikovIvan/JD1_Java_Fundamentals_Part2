package by.htp.les05.main;

public class Main4 {

	/*
	 * Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет
	 * ли она возрастающей.
	 */

	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 7, 9, 4 };
		
		System.out.println(increase(a));
	}
	
	public static boolean increase(int[] a) {
		boolean answ = true;
		
		for (int i = a.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (a[i] < a[j]) {
					answ = false;
					break;
				}
			}
		}
		
		return answ;
	}

}
