package by.htp.les05.main;

public class Main18 {

	/*
	 * «Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в рад
	 * ячеек, в которые надо вставить игральные кубики. Но дверь открывается только
	 * в том случае, когда в любых трех соседних ячейках сумма точек на передних
	 * гранях кубиков равна 10. (Игральный кубик имеет на каждой грани от 1 до 6
	 * точек). Напишите программу, которая разгадывает код замка при условии, что
	 * два кубика уже вставлены в ячейки.
	 */

	public static void main(String[] args) {
		int[] ar;
		int a = 6;
		int b = 3;

		ar = key(a, b);
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

	public static int[] key(int a, int b) {
		int[] ar = new int[10];

		ar[0] = a;
		ar[1] = b;
		if (a + b >= 10) {
			System.out.println("The key does not exist.");
			return null;
		} else {
			for (int i = 2; i < 10; i++) {
				ar[i] = 10 - ar[i - 1] - ar[i - 2];
			}
		}
		return ar;
	}

}
