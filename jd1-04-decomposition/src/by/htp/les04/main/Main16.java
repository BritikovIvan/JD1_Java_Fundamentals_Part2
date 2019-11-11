package by.htp.les04.main;

public class Main16 {

	/*
	 * Два простых числа называются «близнецами», если они отличаются друг от друга
	 * на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка
	 * [n,2n], где n - заданное натуральное число больше 2. Для решения задачи
	 * использовать декомпозицию.
	 */

	public static void main(String[] args) {
		int n = 90;
		int[][] ar;

		ar = array(n);
		print(ar);
	}

	public static void print(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Twins: " + ar[i][0] + " and " + ar[i][1]);
		}
	}

	public static int[][] array(int n) {
		int[][] ar;
		int prev = 0;
		int div;
		int length = 0;
		int ind = 0;

		for (int i = n; i <= 2 * n; i++) {
			div = 1;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					div = j;
				}
			}
			if (div == 1 && prev + 2 == i) {
				length++;
				prev = i;
			} else if (div == 1){
				prev = i;
			}
		}

		ar = new int[length][2];
		prev = 0;

		for (int i = n; i <= 2 * n; i++) {
			div = 1;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					div = j;
				}
			}
			if (div == 1 && prev + 2 == i) {
				ar[ind][0] = prev;
				ar[ind++][1] = i;
				prev = i;
			} else if (div == 1) {
				prev = i;
			}
		}

		return ar;
	}

}
