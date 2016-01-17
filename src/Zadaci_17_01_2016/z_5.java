package Zadaci_17_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Implementirati sljede�u metodu da sortira redove u 2D nizu. public static
 * double[ ][ ] sortRows(double[ ][ ] array) Napisati testni program koji pita
 * korisnika da unese 3x3 matricu (ili da pita korisnika koliku matricu �eli
 * unijeti) te mu ispisuje na konzoli matricu sa sortiranim redovima - od
 * najmanjeg broja do najve�eg.
 */
public class z_5 {
	// metoda za sortiranje redova
	public static double[][] sortRows(double[][] niz) {
		// sortiramo niz pomocu util Arrays
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {

				java.util.Arrays.sort(niz[j]);
			}
		}

		return niz;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			// koliko redova, koliko kolona korisnik �eli
			System.out.println("Unesite red matrice");
			int m = ulaz.nextInt();
			System.out.println("Unesite kolonu matrice");
			int n = ulaz.nextInt();
			// unos brojeva u matricu
			System.out.println("Unesite brojeve u matricu");
			double[][] matrix = new double[m][n];
			for (int a = 0; a < matrix.length; a++) {
				for (int b = 0; b < matrix.length; b++) {
					matrix[a][b] = ulaz.nextDouble();
				}
			}
			// ispis matrice
			for (int a = 0; a < matrix.length; a++) {
				for (int b = 0; b < matrix.length; b++) {
					System.out.print(matrix[a][b] + " ");
				}
				System.out.println();
			}
			// pozivamo metodu i ispisujemo sortiranu matricu
			double[][] matrica = sortRows(matrix);
			System.out.println("Sortirana matrica izgleda ovako:");
			for (int a = 0; a < matrica.length; a++) {
				for (int b = 0; b < matrica[a].length; b++) {
					System.out.print(matrica[a][b] + " ");
				}
				System.out.println();
			}
		} catch (InputMismatchException ex) {
			System.out.println("GRE�KA: Neispravan unos podataka!");
			ulaz.close();
		}
	}
}
