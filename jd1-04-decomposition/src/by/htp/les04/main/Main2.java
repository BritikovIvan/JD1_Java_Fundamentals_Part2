package by.htp.les04.main;

public class Main2 {

	/*
	 * Написать метод(методы) для нахождения наибольшего общего делителя и
	 * наименьшего общего кратного двух натуральных чисел
	 */

	public static void main(String[] args) {
		int A = 18;
		int B = 60;
		
		System.out.println("NOD = " + nod(A, B));
		System.out.println("NOK = " + nok(A, B));
	}

	public static int nod(int A, int B) {
		if (B == 0) {
			return A;
		} else {
			return nod(B, A % B);
		}
	}
	
	public static int nok(int A, int B) {
		return A * B / nod(A, B);
	}
}
