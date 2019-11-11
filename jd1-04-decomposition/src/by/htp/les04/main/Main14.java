package by.htp.les04.main;

public class Main14 {

	/*
	 * Написать метод(методы), определяющий, в каком из данных двух чисел больше
	 * цифр.
	 */

	public static void main(String[] args) {
		int a = 12345;
		int b = 1232;
		
		System.out.println("Maxnum - " + maxNum(a, b));
	}

	public static int maxNum(int a, int b) {
		int perm1 = a;
		int perm2 = b;
		
		while (true) {
			if (perm1 % 10 == 0) {
				return b;
			} else if (perm2 % 10 == 0) {
				return a;
			}
			perm1 /= 10;
			perm2 /= 10;
		}
	}
}
