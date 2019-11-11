package by.htp.les04.main;

public class Main12 {

	/*
	 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы)
	 * вычисления его площади, если угол между сторонами длиной X и Y— прямой.
	 */

	public static void main(String[] args) {
		double X = 2.6;
		double Y = 3;
		double Z = 3.6;
		double T = 1.6;
		
		System.out.println("Area = " + area(X, Y, Z, T));
	}

	public static double area(double X, double Y, double Z, double T) {
		double area = 0;
		double hyp;
		double p;

		hyp = Math.sqrt(X * X + Y * Y);
		p = (Z + T + hyp) / 2.;
		area += 0.5 * X * Y + Math.sqrt(p * (p - Z) * (p - T) * (p - hyp));

		return area;
	}

}
