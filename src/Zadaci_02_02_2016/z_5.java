package Zadaci_02_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Algebra: add two matrices) Write a method to add two matrices. The header of
 * the method is as follows: public static double[][] addMatrix(double[][] a,
 * double[][] b) In order to be added, the two matrices must have the same
 * dimensions and the same or compatible types of elements. Let c be the
 * resulting matrix. Each element cij is aij + bij. For example, for two 3 * 3
 * matrices a and b, c is Write a test program that prompts the user to enter
 * two 3 * 3 matrices and displays their sum.
 */
public class z_5 {
	// metoda za treæu matricu
	public static double[][] addMatrix(double[][] a, double[][] b) {

		double[][] c = new double[3][3];
		double zbir = 0;
		for (int x = 0; x < c.length; x++) {
			for (int y = 0; y < c.length; y++) {
				// treæu matricu dobijamo sabiranjem dvije matrice koje korisnik
				// unese
				zbir = a[x][y] + b[x][y];
				c[x][y] = zbir;
				zbir = 0;
			}
		}
		return c;
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

			// pozivanje metode i ispis treæe matrice
			System.out.println("Treæa matrica(zbir unesenih matrica):");
			for (int i = 0; i < matrix2.length; i++) {
				for (int j = 0; j < matrix2.length; j++) {
					System.out.print(addMatrix(matrix1, matrix2)[i][j] + " ");
				}
				System.out.println();
			}
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

}
