package by.htp.les05.main;

public class Main9 {

	/*
	 * Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и
	 * наименьший элементы.
	 */

	public static void main(String[] args) {
		double[] a = { -1, -4, 0, 8, -3, 9 };
		
		fun(a);
		print(a);
	}
	
	public static void print(double[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Ar[" + i + "] = " + ar[i]);
		}
	}
	
	public static void fun(double[] a) {
		double max = a[0];
		int maxind = 0;
		double min = a[0];
		int minind = 0;
		double perm;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
				minind = i;
			} else if (a[i] > max) {
				max = a[i];
				maxind = i;
			}
		}
		
		perm = a[minind];
		a[minind] = a[maxind];
		a[maxind] = perm;
	}

}
