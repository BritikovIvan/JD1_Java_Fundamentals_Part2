package by.htp.les04.main;

public class Main20 {

	/*
	 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его
	 * цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль? Для
	 * решения задачи использовать декомпозицию.
	 */

	public static void main(String[] args) {
		int n = 78;
		
		System.out.println("Number of actions = " + fun(n));
	}
	
	public static int fun1(int n) {
		int perm = n;
		int sum = 0;
		
		while (perm > 0) {
			sum += perm % 10;
			perm /= 10;
		}
		
		return n - sum;
	}
	
	public static int fun(int n) {
		int num = 0;
		
		while (n != 0) {
			n = fun1(n);
			num++;
		}
		
		return num;
	}

}
