package by.htp.les05.main;

public class Main14 {

	public static void main(String[] args) {
		int[] A = { 12, 3, 10, -2};
		int sum;
		
		sum = max(A) + min(A);
		System.out.println("sum = " + sum);
	}
	
	public static int max(int[] A) {
		int max = A[1];
		
		for (int i = 3; i < A.length; i+= 2) {
			if (A[i] > max) {
				max = A[i];
			}
		}
		
		return max;
	}
	
	public static int min(int[] A) {
		int min = A[0];
		
		for (int i = 2; i < A.length; i+= 2) {
			if (A[i] < min) {
				min = A[i];
			}
		}
		
		return min;
	}

}
