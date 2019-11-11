package by.htp.les05.main;

public class Main1 {

	/*
	 * В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые
	 * кратны данному К.
	 */

	public static void main(String[] args) {
		int[] A = {5, 10, 12, 4, 9};
		int sum;
		int K = 3;
		
		sum = sum(A, K);
		System.out.println("Sum = " + sum);
	}
	
	public static int sum(int[] A, int K) {
		int sum = 0;
		
		for(int i = 0; i < A.length; i++) {
			if (A[i] % K == 0) {
				sum += A[i];
			}
		}
		
		return sum;
	}

}
