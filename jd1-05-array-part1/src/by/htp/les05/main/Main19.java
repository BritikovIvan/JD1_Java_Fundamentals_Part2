package by.htp.les05.main;

public class Main19 {

	/*
	 * В массиве целых чисел с количеством элементов n найти наиболее часто
	 * встречающееся число. Если таких чисел несколько, то определить наименьшее из
	 * них.
	 */

	public static void main(String[] args) {
		int[] a = { 1, 4, 2, 0, 1 };
		int num;
		
		num = fun(a);
		System.out.println("num = " + num);
	}
	
	public static void sort(int[] a) {
		int perm;
		
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					perm = a[i];
					a[i] = a[j];
					a[j] = perm;
				}
			}
		}
	}
	
	public static int fun(int[] a) {
		int num = 0;
		int l;
		int i;
		int perm;
		int len;
		int[] ar = a.clone();
		
		sort(ar);
		l = 0;
		i = 0;
		
		while (i < ar.length) {
			perm = ar[i];
			len = 0;
			
			while( i < ar.length && ar[i] == perm) {
				len++;
				i++;
			}
			
			if (len >= l) {
				l = len;
				num = perm;
			}
			
		}
		
		return num;
	}

}
