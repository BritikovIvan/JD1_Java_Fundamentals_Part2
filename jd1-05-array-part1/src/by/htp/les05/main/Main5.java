package by.htp.les05.main;

public class Main5 {

	/*
	 * Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из
	 * четных чисел этой последовательности. Если таких чисел нет, то вывести
	 * сообщение об этом факте.
	 */

	public static void main(String[] args) {
		int[] a = { 1, 3, 6, 7, 8 };
		int[] ar;

		ar = even(a);
		if (ar != null) {
			print(ar);
		}

	}

	public static int[] even(int[] a) {
		int[] ar = null;
		int length = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				length++;
			}
		}

		if (length == 0) {
			System.out.println("There are no even numbers in the array.");
		} else {
			ar = new int[length];
			length = 0;

			for (int i = 0; i < a.length; i++) {
				if (a[i] % 2 == 0) {
					ar[length++] = a[i];
				}
			}
		}

		return ar;
	}

	public static void print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Ar[" + i + "] = " + ar[i]);
		}
	}
}
