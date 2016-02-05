package Zadaci_04_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly
 * identical if their corresponding elements are equal. Write a method that
 * returns true if m1 and m2 are strictly identical, using the following header:
 * public static boolean equals(int[][] m1, int[][] m2) Write a test program
 * that prompts the user to enter two 3 * 3 arrays of integers and displays
 * whether the two are strictly identical
 */
public class z_2 {
	// metoda za provjeru da li matrice identiène
	public static boolean equals(int[][] m1, int[][] m2) {
		if (m1.length != m2.length && m1[0].length != m2[0].length) {
			return false;
		}
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++) {
				if (m1[i][j] != m2[i][j])
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		int[][] matrix1 = new int[3][3];
		int[][] matrix2 = new int[3][3];
		try {
			// unos podataka od korisnika
			System.out.println("Unesite elemente prve matrice:");
			for (int a = 0; a < matrix1.length; a++) {
				for (int b = 0; b < matrix1.length; b++) {
					matrix1[a][b] = ulaz.nextInt();
				}
			}
			System.out.println();
			System.out.println("Unesite elemente druge matrice:");
			for (int a = 0; a < matrix2.length; a++) {
				for (int b = 0; b < matrix2.length; b++) {
					matrix2[a][b] = ulaz.nextInt();
				}
			}
			// ispis rezultata
			System.out
					.println(equals(matrix1, matrix2) ? "Matrice su identiène."
							: "Matrice nisu identiène.");
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}
}
