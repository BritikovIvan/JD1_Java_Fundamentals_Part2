package by.htp.les04.main;

public class Main10 {

	/*
	 * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел
	 * от 1 до 9.
	 */

	public static void main(String[] args) {
		int sum = 0;

		sum = fac();
		System.out.println("Sum = " + sum);
	}

	public static int fac() {
		int fac = 0;
		int per;

		for (int i = 1; i < 10; i += 2) {
			per = 1;
			for (int j = 1; j <= i; j++) {
				per *= j;
			}
			fac += per;
		}

		return fac;
	}
}
