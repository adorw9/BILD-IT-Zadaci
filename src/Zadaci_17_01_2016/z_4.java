package Zadaci_17_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Napisati metodu koja vra�a lokaciju najve�eg elementa u 2D nizu. Metoda treba
 * da koristi sljede�i header: public static int[ ] locateLargest(double[ ][ ]
 * a) Napisati test program koji pita korisnika da unese 2D niz te mu ispisuje
 * lokaciju najve�eg elementa u nizu.
 */
public class z_4 {
	// metoda za pronalazak najve�eg elementa u matrici
	public static int[] locateLargest(double[][] a) {

		double max = 0;
		// pravimo niz koji �e nam vratiti lokaciju �lana sa najve�om
		// vrijednosti u matrici
		int[] lokacija = new int[2];
		// petljom prolazimo kroz �lanove i pronalazimo max
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
					// dodavanje reda i kolone u niz lokacija
					lokacija[0] = i;
					lokacija[1] = j;
				}
			}
		}
		return lokacija;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			// unosimo koliko matrica sadrzi redova i kolona
			System.out.println("Unesite red matrice");
			int m = ulaz.nextInt();
			System.out.println("Unesite kolonu matrice");
			int n = ulaz.nextInt();
			System.out.println("Unesite brojeve u matricu");
			// unos brojeva u matricu
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
			// pomo�u niza pozivamo metodu i ispisujemo lokaciju najve�eg
			// elementa u matrici
			int[] niz = locateLargest(matrix);
			System.out.println("Lokacija najve�eg elementa: [" + niz[0] + "]["
					+ niz[1] + "].");
		} catch (InputMismatchException ex) {
			System.out.println("GRE�KA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

}
