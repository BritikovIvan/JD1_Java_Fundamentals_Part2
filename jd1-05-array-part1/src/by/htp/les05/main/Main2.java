package by.htp.les05.main;

public class Main2 {

	/*
	 * В целочисленной последовательности есть нулевые элементы. Создать массив из
	 * номеров этих элементов.
	 */

	public static void main(String[] args) {
		int[] ar1 = { 1, 2, 0, 4, 0, 9, 7, 0 };
		int[] ar2;
		
		ar2 = num(ar1);
		print(ar2);
	}
	
	public static void print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Ar[" + i + "] = " + ar[i]);
		}
	}
	
	public static int[] num(int[] ar) {
		int[] ar1;
		int length = 0;
		
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 0) {
				length++;
			}
		}
		
		ar1 = new int[length];
		length = 0;
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i] == 0) {
				ar1[length++] = i;
			}
		}
		
		return ar1;
	}

}
