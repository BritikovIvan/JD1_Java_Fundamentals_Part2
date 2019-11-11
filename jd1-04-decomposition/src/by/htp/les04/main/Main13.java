package by.htp.les04.main;

public class Main13 {

	/*
	 * Дано натуральное число N. Написать метод(методы) для формирования массива,
	 * элементами которого являются цифры числа N.
	 */

	public static void main(String[] args) {
		int N = 123456789;
		int[] ar;
		
		ar = array(N);
		print(ar);
	}

	public static void print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("A[" + i + "] = " + ar[i]);
		}
	}
	
	public static int[] array(int N) {
		int[] ar;
		int per = N;
		int len = 0;
		
		while (per > 0) {
			per = per / 10;
			len++;
		}
		
		ar = new int[len];
		
		for (int i = ar.length - 1; i >= 0; i--) {
			ar[i] = N % 10;
			N = N / 10;
		}
		
		return ar;
	}
}
