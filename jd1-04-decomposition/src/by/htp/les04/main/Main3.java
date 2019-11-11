package by.htp.les04.main;

public class Main3 {

	/*
	 * Написать метод(методы) для нахождения наибольшего общего делителя четырех
	 * натуральных чисел.
	 */

	public static void main(String[] args) {
		int a = 78;
		int b = 294;
		int c = 570;
		int d = 36;
		
		System.out.println("NOD = " + nod(a, b, c, d));
	}

	public static int nod(int a, int b, int c, int d) {
		int n1;
		int n2;
		
		n1 = nod(a, b);
		n2 = nod(n1, c); 
		return nod(n2, d);
	}
	
	public static int nod(int A, int B) {
		if (B == 0) {
			return A;
		} else {
			return nod(B, A % B);
		}
	}
}
