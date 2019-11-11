package by.htp.les04.main;

public class Main9 {

	/*
	 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно
	 * простыми.
	 */

	public static void main(String[] args) {
		int a = 6;
		int b = 9;
		int c = 13;
		
		System.out.println(simple(a, b, c));
	}

	public static int nod(int A, int B) {
		if (B == 0) {
			return A;
		} else {
			return nod(B, A % B);
		}
	}
	
	public static boolean simple(int a, int b, int c) {
		int nod1;
		int nod;
		
		nod1 = nod(a, b);
		nod = nod(nod1, c);
		
		return nod == 1;
	}
}
