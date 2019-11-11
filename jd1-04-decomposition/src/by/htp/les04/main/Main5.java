package by.htp.les04.main;

public class Main5 {

	/*
	 * Написать метод(методы) для нахождения суммы большего и меньшего из трех
	 * чисел.
	 */

	public static void main(String[] args) {
		int a = 1;
		int b = 5;
		int c = 9;
		
		System.out.println("Sum = " + sum(a, b, c));
	}

	public static int min(int a, int b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}
	}

	public static int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static int sum(int a, int b, int c) {
		return min(min(a, b), c) + max(max(a, b), c);
	}
}
