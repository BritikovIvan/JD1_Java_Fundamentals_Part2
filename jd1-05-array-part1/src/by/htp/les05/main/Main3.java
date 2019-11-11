package by.htp.les05.main;

public class Main3 {

	/*
	 * Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число
	 * встречается раньше - положительное или отрицательное.
	 */

	public static void main(String[] args) {
		int[] ar = {0, 1, 2, -2, 0, 5};
		boolean pos;
		
		pos = fun(ar);
		if(pos) {
			System.out.println("Positive.");
		} else {
			System.out.println("Negative.");
		}
	}
	
	public static boolean fun(int[] ar) {
		boolean answ = true;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > 0) {
				answ = true;
				break;
			} else if (ar[i] < 0) {
				answ = false;
				break;
			}
		}
		return answ;
	}

}
