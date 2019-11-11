package by.htp.les04.main;

import java.util.Random;

public class Main7 {

	/*
	 * На плоскости заданы своими координатами n точек. Написать метод(методы),
	 * определяющие, между какими из пар точек самое большое расстояние. Указание.
	 * Координаты точек занести в массив.
	 */

	public static void main(String[] args) {
		int n = 5;
		int[][] coord = new int[n][2];
		int[][] coord1 = new int[2][2];

		coord = randInit(coord);
		print(coord);
		coord1 = maxlen(coord);

		System.out.println("The largest distance between point (" + coord1[0][0] + "," + coord1[0][1] + ") and ("
				+ coord1[1][0] + "," + coord1[1][1] + ").");

	}

	public static int[][] randInit(int[][] coord) {
		Random rand = new Random();

		for (int i = 0; i < coord.length; i++) {
			for (int j = 0; j < 2; j++) {
				coord[i][j] = rand.nextInt(10);
			}
		}

		return coord;
	}

	public static void print(int[][] coord) {
		for (int i = 0; i < coord.length; i++) {
			System.out.println("x = " + coord[i][0] + "\ty = " + coord[i][1]);
		}
	}

	public static int[][] maxlen(int[][] coord) {
		int[][] coord1 = new int[2][2];
		double maxlen = 0;
		double len;
		double l1;
		double l2;

		for (int i = 0; i < coord.length - 1; i++) {
			for (int j = i + 1; j < coord.length; j++) {
				l1 = Math.pow(coord[i][0] - coord[j][0], 2);
				l2 = Math.pow(coord[i][1] - coord[j][1], 2);
				len = Math.sqrt(l1 + l2);
				if (maxlen < len) {
					coord1[0] = coord[i];
					coord1[1] = coord[j];
					maxlen = len;
				}
			}
		}

		return coord1;
	}
}
