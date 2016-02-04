package Zadaci_03_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Algebra: multiply two matrices) Write a method to multiply two matrices. The
 * header of the method is: public static double[][] multiplyMatrix(double[][]
 * a, double[][] b) To multiply matrix a by matrix b, the number of columns in a
 * must be the same as the number of rows in b, and the two matrices must have
 * elements of the same or compatible types. Let c be the result of the
 * multiplication. Assume the column size of matrix a is n.
 */
public class z_2 {

	// metoda za treæu matricu
	public static double[][] množi(double[][] a, double[][] b) {

		int m1R = a.length;
		int m1C = a[0].length;
		int m2C = b[0].length;

		double[][] rezultat = new double[m1R][m2C];
		for (int i = 0; i < m1R; i++)
			for (int j = 0; j < m2C; j++)
				for (int k = 0; k < m1C; k++) {
					rezultat[i][j] += a[i][k] * b[k][j];
				}

		printMatrix(rezultat);
		return rezultat;
	}

	// metoda za ispis marice
	public static void printMatrix(double[][] matrix) {
		int a = matrix.length;
		int b = matrix[0].length;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// pravimo matrice
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];

		try {
			// unos prve matrice
			System.out.println("Unesite elemente prve matrice:");
			for (int a = 0; a < matrix1.length; a++) {
				for (int b = 0; b < matrix1.length; b++) {
					matrix1[a][b] = ulaz.nextDouble();
				}
			}
			// unos druge matrice
			System.out.println("Unesite elemente druge matrice:");
			for (int a = 0; a < matrix2.length; a++) {
				for (int b = 0; b < matrix2.length; b++) {
					matrix2[a][b] = ulaz.nextDouble();
				}
			}
			System.out.println();

			množi(matrix1, matrix2);
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

}
