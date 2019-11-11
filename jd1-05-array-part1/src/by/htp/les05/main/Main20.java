package by.htp.les05.main;

public class Main20 {

	/*
	 * Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из
	 * него каждый второй элемент (освободившиеся элементы заполнить нулями).
	 * Примечание. Дополнительный массив не использовать.
	 */

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5 };
		
		fun(ar);
		print(ar);
	}
	
	public static void print(int[] ar) {
		if (ar != null) {
			for (int i = 0; i < ar.length; i++) {
				System.out.println("Ar[" + i + "] = " + ar[i]);
			}
		} else {
			System.out.println("Empty");
		}
	}
	
	public static void fun(int[] ar) {
		int i;
		for (i = 1; i < (ar.length / 2 + ar.length % 2); i++) {
			ar[i] = ar[2 * i];
		}
		while(i < ar.length) {
			ar[i] = 0;
			i++;
		}
	}

}
