package by.htp.les04.main;

public class Main18 {

	/*
	 * Найти все натуральные n-значные числа, цифры в которых образуют строго
	 * возрастающую последовательность (например, 1234, 5789). Для решения задачи
	 * использовать декомпозицию.
	 */

	public static void main(String[] args) {
		int n = 4;
		int[] ar;
		ar = array(n);
		print(ar);
	}

	public static void print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("A[" + i + "] = " + ar[i]);
		}
	}
	
	public static int[] array(int n) {
		int[] ar;
		int min = (int) Math.pow(10, n - 1);
		int length = 0;
		int prev;
		int per;
		boolean incr;
		int ind;
		
		for (int i = min; i < min * 10; i++) {
			per = i;
			incr = true;
			prev = 10;
			
			while (per > 0) {
				if (per % 10 >= prev) {
					incr = false;
					break;
				}
				prev = per % 10;
				per /= 10;
			}
			
			if (incr) {
				length++;
			}
		}
		
		ar = new int[length];
		ind = 0;
		
		for (int i = min; i < min * 10; i++) {
			per = i;
			incr = true;
			prev = 10;
			
			while (per > 0) {
				if (per % 10 >= prev) {
					incr = false;
					break;
				}
				prev = per % 10;
				per /= 10;
			}
			
			if (incr) {
				ar[ind++] = i;
			}
		}

		return ar;
	}
}
