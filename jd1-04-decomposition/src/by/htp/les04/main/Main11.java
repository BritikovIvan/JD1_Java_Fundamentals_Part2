package by.htp.les04.main;

public class Main11 {

	/*
	 * Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] +
	 * D[5]; D[4] +D[5] +D[6]. Пояснение. Составить метод(методы) для вычисления
	 * суммы трех последовательно расположенных элементов массива с номерами от k до
	 * m.
	 */

	public static void main(String[] args) {
		int[] D = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.println("D[1] + D[2] + D[3] = " + sum(D, 1));
		System.out.println("D[3] + D[4] + D[5] = " + sum(D, 3));
		System.out.println("D[4] + D[5] + D[6] = " + sum(D, 4));
	}

	public static int sum(int[] ar, int k) {
		int sum = 0;
		
		for (int i = 0; i < 3; i++) {
			sum += ar[k + i];
		}
		
		return sum;
	}
}
