package by.htp.les04.main;

public class Main19 {

	/*
	 * Написать программу, определяющую сумму n - значных чисел, содержащих только
	 * нечетные цифры. Определить также, сколько четных цифр в найденной сумме. Для
	 * решения задачи использовать декомпозицию.
	 */

	public static void main(String[] args) {
		int n = 1;
		int sum;
		int num;

		sum = sum(n);
		num = num(sum);
		System.out.println("Sum = " + sum + "\nNum = " + num);
	}

	public static int sum(int n) {
		int sum = 0;
		int min = (int) Math.pow(10, n - 1);
		int per;
		boolean incr;

		for (int i = min; i < min * 10; i++) {
			per = i;
			incr = true;

			while (per > 0) {
				if (per % 2 == 0) {
					incr = false;
					break;
				}
				per /= 10;
			}

			if (incr) {
				sum += i;
			}
		}
		
		return sum;
	}
	
	public static int num(int sum) {
		int num = 0;
		
		while (sum > 0) {
			if (sum % 2 == 0) {
				num++;
			}
			sum /= 10;
		}
		
		return num;
	}
}
