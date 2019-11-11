package by.htp.les05.main;

public class Main8 {

	/*
	 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько
	 * в нем отрицательных, положительных и нулевых элементов.
	 */

	public static void main(String[] args) {
		double[] ar = { 1, 1.5, -4, 0, 0, 3 };
		int[] ar1;
		
		ar1 = fun(ar);
		System.out.println("Negative - " + ar1[0] + " Zero - " + ar1[1] + " Positive - " + ar1[2]);
	}
	
	public static int[] fun(double[] ar) {
		int[] ar1 = { 0, 0, 0};
		
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < 0) {
				ar1[0]++;
			} else if(ar[i] == 0) {
				ar1[1]++;
			} else {
				ar1[2]++;
			}
		}
		
		return ar1;
	}

}
