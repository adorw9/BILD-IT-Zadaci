package Zadaci_29_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Napisati metodu koja ispisuje n x n matricu koriste�i se sljede�im headerom:
 * public static void printMatrix(int n). Svaki element u matrici je ili 0 ili
 * 1, nasumi�no generisana. Napisati test program koji pita korisnika da unese
 * broj n te mu ispi�e n x n matricu u konzoli.
 */
public class z_5 {
	// metoda za print matrice
	public static void printMatrix(int n) {
		// pravimo matricu sa velicinom koju korisnik unese
		int[][] matrix = new int[n][n];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				// generi�emo nasumi�no brojeve 0 i 1 u matrici
				matrix[i][j] = (int) (Math.random() * 2);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// unosimo veli�inu matrice i ispisujemo rezultat
		System.out.print("Unesite veli�inu matrice: ");
		try {
			int velicina = ulaz.nextInt();

			printMatrix(velicina);

		} catch (InputMismatchException ex) {
			System.out.println("GRE�KA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

}
