package by.htp.les05.main;

public class Main12 {

	/*
	 * Задана последовательность N вещественных чисел. Вычислить сумму чисел,
	 * порядковые номера которых являются простыми числами.
	 */

	public static void main(String[] args) {
		double[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		int sum;

		sum = sum(a);
		System.out.println("sum = " + sum);
	}

	public static int sum(double[] a) {
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			if (simple(i)) {
				sum += a[i];
			}
		}

		return sum;
	}

	public static boolean simple(int num) {
		boolean answ = false;

		if (num > 1) {
			answ = true;
			
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					answ = false;
					break;
				}
			}
			
		}

		return answ;
	}

}
