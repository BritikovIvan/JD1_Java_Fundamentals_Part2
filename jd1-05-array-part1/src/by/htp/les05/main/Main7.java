package by.htp.les05.main;

public class Main7 {

	/*
	 * Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее
	 * члены, большие данного Z, этим числом. Подсчитать количество замен.
	 */

	public static void main(String[] args) {
		int[] a = { 1, 5, 7, 2, 23, 5 };
		int Z = 6;
		int num;
		
		print(a);
		num = fun(a, Z);
		System.out.println("num = " + num);
		print(a);
	}
	
	public static void print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Ar[" + i + "] = " + ar[i]);
		}
	}
	
	public static int fun(int[] a, int Z) {
		int num = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > Z) {
				a[i] = Z;
				num++;
			}
		}
		
		return num;
	}

}
