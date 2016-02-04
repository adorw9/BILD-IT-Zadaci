package Zadaci_03_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Sort two-dimensional array) Write a method to sort a two-dimensional array
 * using the following header: public static void sort(int m[][]) The method
 * performs a primary sort on rows and a secondary sort on columns. For example,
 * the following array {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}} will be
 * sorted to {{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}.
 */
public class z_4 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// kreiramo matricu npr. 3x3
		int matrix1[][] = new int[3][3];
		try {
			// unos podatak od korisnika
			System.out.println("Unesite elemente matrice: ");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {

					matrix1[i][j] = ulaz.nextInt();
				}
			}

			// ispis unesene matrice
			System.out.println("Matrica koje ste unijeli:");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(matrix1[i][j] + "  ");
				}
				System.out.println();
			}

			// saèuvamo matricu u niz
			int niz[] = new int[3 * 3];
			int x = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					niz[x] = matrix1[i][j];
					x++;
				}
			}

			// sortiramo niz
			int pom = 0;
			for (int i = 0; i < (3 * 3) - 1; i++) {
				for (int j = i + 1; j < (3 * 3); j++) {
					if (niz[i] > niz[j]) {
						pom = niz[i];
						niz[i] = niz[j];
						niz[j] = pom;
					}
				}
			}

			// saèuvamo sortiran niz u matricu
			x = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					matrix1[i][j] = niz[x];
					x++;
				}
			}

			// ispis sortirane matric

			System.out.println("Sortirana matrica:");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(matrix1[i][j] + "  ");
				}
				System.out.println();
			}
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}
}
