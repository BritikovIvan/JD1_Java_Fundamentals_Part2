package by.htp.les05.main;

public class Main13 {

	/*
	 * Определить количество элементов последовательности натуральных чисел, кратных
	 * числу М и заключенных в промежутке от L до N.
	 */

	public static void main(String[] args) {
		int[] a = { 1, 5, 7, 4, -5, 2, 400};
		int M = 5;
		int L = -2;
		int N = 40;
		int num;
		
		num = num(a, M, L, N);
		System.out.println("num = " + num);
	}
	
	public static int num(int[]a, int M, int L, int N) {
		int num = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= L && a[i] <= N && a[i] % M == 0) {
				num++;
			}
		}
		
		return num;
	}

}
