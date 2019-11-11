package by.htp.les05.main;

public class Main6 {

	/*
	 * Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину
	 * числовой оси, содержащую все эти числа.
	 */

	public static void main(String[] args) {
		int[] a = { 1, -1, 4, 6, 3, 9};
		int len;
		
		len = len(a);
		System.out.println("len = " + len);
	}

	public static int len(int[] a) {
		int len;
		int min = a[0];
		int max = a[0];
		
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}else if (a[i] > max) {
				max = a[i];
			}
		}
		
		len = max - min;
		if (len < 1) {
			len = 1;
		}
		
		return len;
	}
}
