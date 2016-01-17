package Zadaci_16_01_206;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati metodu koja ispisuje n x n matricu korsiteæi sljedeæi header: public
 * static void printMatrix(int n) Svaki element u matrici je ili 0 ili 1,
 * generisan nasumièno. Napisati test program koji pita korisnika da unese n te
 * ispisuje n x n matricu.
 */
public class z_4 {

	public static void printMatrix(int n) {
		// definišemo matricu n x n
		int[][] matrix = new int[n][n];
		for (int a = 0; a < matrix.length; a++) {
			for (int b = 0; b < matrix.length; b++) {
				// matrica se ispisuje samo sa nulama i jedinicama
				matrix[a][b] = (int) (Math.random() * 2);

				System.out.print(matrix[a][b] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite matricu");
		try {
			// kornsik upisuje koliko matricu želi i pozivamo metodu za ispis
			// matrice
			int n = ulaz.nextInt();
			printMatrix(n);

		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}
}
