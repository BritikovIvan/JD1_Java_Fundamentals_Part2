package by.htp.les04.main;

public class Main15 {

	/*
	 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
	 * элементами которого являются числа, сумма цифр которых равна К и которые не
	 * большее N.
	 */

	public static void main(String[] args) {
		int K = 9;
		int N = 50;
		int[] A;
		
		A = array(K, N);
		print(A);
	}

	public static void print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("A[" + i + "] = " + ar[i]);
		}
	}
	
	public static int[] array(int k, int n) {
		int[] array;
		int length = 0;
		int sum;
		int perm;
		int j = 0;
		
		for (int i = 1; i <= n; i++) {
			sum = 0;
			perm = i;
			while (perm > 0) {
				sum += perm % 10;
				perm /= 10;
			}
			if (sum == k) {
				length++;
			}
		}
		
		array = new int[length];
		
		for (int i = 1; i <= n; i++) {
			sum = 0;
			perm = i;
			while (perm > 0) {
				sum += perm % 10;
				perm /= 10;
			}
			if (sum == k) {
				array[j++] = i;
			}
		}
		
		return array;
	}
}
