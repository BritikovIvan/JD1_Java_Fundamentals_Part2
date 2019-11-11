package by.htp.les04.main;

import java.util.Random;

public class Main8 {

	/*
	 * Составить программу, которая в массиве A[N] находит второе по величине число
	 * (вывести на печать число, которое меньше максимального элемента массива, но
	 * больше всех других элементов).
	 */

	public static void main(String[] args) {
		int N = 5;
		int[] A = new int[N];
		int num;

		randInit(A);
		print(A);
		num = max2(A);
		System.out.println("Num = " + num);
	}

	public static void randInit(int[] ar) {
		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(50);
		}
	}

	public static void print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("A[" + i + "] = " + ar[i]);
		}
	}
	
	public static int max2(int[] ar) {
		int per;
		
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if(ar[i] < ar[j]) {
					per = ar[i];
					ar[i] = ar[j];
					ar[j] = per;
				}
			}
		}
		
		return ar[1];
	}
}
