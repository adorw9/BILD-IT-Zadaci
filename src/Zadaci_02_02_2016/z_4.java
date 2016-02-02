package Zadaci_02_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Sum elements column by column) Write a method that returns the sum of all
 * the elements in a specified column in a matrix using the following header:
 * public static double sumColumn(double[][] m, int columnIndex) Write a test
 * program that reads a 3-by-4 matrix and displays the sum of each column.
 */
public class z_4 {
	// metoda za sabiranje kolona matrice
	public static double sumColumn(double[][] m, int columnIndex) {

		double zbir = 0;
		for (int i = 0; i < m.length; i++) {
			zbir += m[i][columnIndex];
		}
		return zbir;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			// unos od korisnika
			System.out.println("Unesite brojeve:");
			double[][] matrix = new double[3][4];
			for (int x = 0; x < matrix.length; x++) {
				for (int y = 0; y < matrix.length; y++) {
					matrix[x][y] = ulaz.nextDouble();
				}
			}
			// ispis matrice
			System.out.println("Matrica:");
			for (int x = 0; x < matrix.length; x++) {
				for (int y = 0; y < matrix.length; y++) {
					System.out.print(matrix[x][y] + " ");
				}
				System.out.println();
			}
			// ispis zbira kolona matrice
			for (int i = 0; i < matrix.length; i++) {
				System.out.println("Zbir elemenata " + (i + 1) + " kolone je "
						+ sumColumn(matrix, i));
			}
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

}
