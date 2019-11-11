package by.htp.les04.main;

public class Main6 {

	/*
	 * Вычислить площадь правильного шестиугольника со стороной а, используя метод
	 * вычисления площади треугольника.
	 */

	public static void main(String[] args) {
		double a = 3;
		
		System.out.println("S = " + area(a));
	}

	public static double area(double a, double h) {
		return 0.5 * a * h; 
	}
	
	public static double area(double a) {
		double h;
		h = a * Math.sqrt(3) / 2;
		return 6 * area(a, h);
	}
}
