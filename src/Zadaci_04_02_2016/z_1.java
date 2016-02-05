package Zadaci_04_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Row sorting) Implement the following method to sort the rows in a
 * twodimensional array. A new array is returned and the original array is
 * intact. public static double[][] sortRows(double[][] m) Write a test program
 * that prompts the user to enter a 3 * 3 matrix of double values and displays a
 * new row-sorted matrix.
 */
public class z_1 {

	// metoda za sortiranje redova
	public static double[][] sortRows(double[][] m) {

		double[][] rezultat = new double[m.length][m[0].length];

		// kopiramo matricu m u rezultat
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[0].length; j++)
				rezultat[i][j] = m[i][j];

		double temp = 0;
		// sortiramo redove matrice
		for (int i = 0; i < rezultat.length; i++) {
			for (int j = 0; j < rezultat[i].length; j++) {
				for (int k = j; k < rezultat[i].length; k++) {
					if (rezultat[i][j] > rezultat[i][k]) {
						temp = rezultat[i][j];
						rezultat[i][j] = rezultat[i][k];
						rezultat[i][k] = temp;
					}
				}
				// ispisujemo sortiranu matricu
				System.out.print(rezultat[i][j] + " ");
			}
			System.out.println();
		}

		return rezultat;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// kreiramo matricu npr. 3x3
		double matrix[][] = new double[3][3];
		try {
			// unos podataka od korisnika
			System.out.println("Unesite elemente matrice: ");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {

					matrix[i][j] = ulaz.nextDouble();
				}
			}

			// ispis unesene matrice
			System.out.println("Matrica koje ste unijeli:");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(matrix[i][j] + "  ");
				}
				System.out.println();
			}
			System.out.println();
			// pozivamo metodu
			System.out.println("Sortirana matrica: ");
			sortRows(matrix);
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

}
