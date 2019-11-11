package by.htp.les04.main;

public class Main4 {

	/*
	 * Написать метод(методы) для нахождения наименьшего общего кратного трех
	 * натуральных чисел.
	 */

	public static void main(String[] args) {
		int a = 140;
		int b = 9;
		int c = 54;

		System.out.println("NOK = " + nok(a, b, c));
	}

	public static int nok(int a, int b, int c) {
		int k = nok(a, b);
		return nok(k, c);
	}

	public static int nok(int a, int b) {
		int a1;
		int b1;
		int p;
		a1 = a;
		b1 = b;

		while (b1 != 0) {
			p = a1;
			a1 = b1;
			b1 = p % b1;
		}

		return a * b / a1;
	}
}
