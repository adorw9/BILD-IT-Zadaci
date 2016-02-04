package Zadaci_03_02_2016;

import java.util.Arrays;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Compute the weekly hours for each employee) Suppose the weekly hours for all
 * employees are stored in a two-dimensional array. Each row records an
 * employee’s seven-day work hours with seven columns. For example, the
 * following array stores the work hours for eight employees. Write a program
 * that displays employees and their total hours in decreasing order of the
 * total hours.
 */
public class z_1 {
	// metoda za ukupne sate
	public static int totalHours(int[][] time, int rowIndex) {
		int total = 0;
		int i = 0;
		for (int column = 0; column < time[i].length; column++) {
			total += time[rowIndex][column];

		}
		return total;

	}

	public static void main(String[] args) {
		// postavljamo sate u matricu
		int[][] matrix = { { 1, 2, 1, 1, 5, 1, 4 }, { 2, 6, 6, 3, 1, 9, 6 },
				{ 4, 8, 6, 1, 3, 9, 4 }, { 4, 8, 6, 2, 4, 3, 3 },
				{ 5, 9, 6, 7, 8, 9, 8 }, { 8, 4, 6, 8, 8, 5, 2 },
				{ 9, 2, 6, 9, 3, 6, 2 }, { 7, 3, 6, 1, 4, 7, 1 } };
		// ispis matrice
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(matrix[i][j] + " ");

			}
			System.out.println("-Radnik " + i);
		}
		System.out.println();
		// trazimo sumu sati za svakog radnika
		int[] totalHours = new int[8];
		for (int i = 0; i < 8; i++) {
			int sum = 0;
			for (int j = 0; j < 7; j++) {
				sum += matrix[i][j];
				totalHours[i] = sum;
			}

		}
		// sortiramo radnike i ispisujemo rezultat
		java.util.Arrays.sort(totalHours);
		int[] sorted = new int[totalHours.length];
		for (int i = 0; i < totalHours.length; i++) {
			sorted[i] = totalHours[i];
		}
		Arrays.sort(sorted);
		for (int i = 7; i > -1; i--) {
			System.out.println(sorted[i]);
		}
	}

}
