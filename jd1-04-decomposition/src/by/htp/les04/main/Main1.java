package by.htp.les04.main;

public class Main1 {

	/*
	 * Треугольник задан координатами своих вершин. Написать метод для вычисления
	 * его площади.
	 */

	public static void main(String[] args) {
		double x1 = 3;
		double x2 = 7;
		double x3 = 0;
		double y1 = 2;
		double y2 = 5;
		double y3 = 0;
		double S;
		
		S = area(x1, y1, x2, y2, x3, y3);
				
		System.out.println("S = " + S);
	}

	public static double area(double x1, double y1, double x2, double y2, double x3, double y3) {
		double S;

		S = Math.abs(0.5 * ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)));

		return S;
	}
}
