package by.htp.les04.main;

public class Main17 {

	/*
	 * Натуральное число, в записи которого n цифр, называется числом Армстронга,
	 * если сумма его цифр, возведенная в степень n, равна самому числу. Найти все
	 * числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
	 */

	public static void main(String[] args) {
		int k = 900;
		int[] ar;
		
		ar = armstrong(k);
		print(ar);
	}

	public static void print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("A[" + i + "] = " + ar[i]);
		}
	}
	
	public static int[] armstrong(int k) {
		int[] ar;
		int length = 0;
		int sum;
		int n;
		int per;
		int ind;
		
		for (int i = 1; i <= k; i++) {
			sum = 0;
			n = 0;
			per = i;
			
			while (per > 0) {
				sum += per % 10;
				per /= 10;
				n++;
			}
			
			if (Math.pow(sum, n) == i) {
				length++;
			}
		}
		
		ar = new int[length];
		ind = 0;
		
		for (int i = 1; i <= k; i++) {
			sum = 0;
			n = 0;
			per = i;
			
			while (per > 0) {
				sum += per % 10;
				per /= 10;
				n++;
			}
			
			if (Math.pow(sum, n) == i) {
				ar[ind++] = i;
			}
		}
		
		return ar;
	}
}
