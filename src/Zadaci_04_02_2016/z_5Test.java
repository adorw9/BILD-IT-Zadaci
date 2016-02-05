package Zadaci_04_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class z_5Test {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			// unos korisnik
			System.out.println("Unesite broj redova:");
			int x = ulaz.nextInt();
			System.out.println("Unesite broj kolona:");
			int y = ulaz.nextInt();

			double[][] matrix = new double[x][y];

			System.out.println("Unesite brojeve u matricu:");
			for (int a = 0; a < matrix.length; a++) {
				for (int b = 0; b < matrix.length; b++) {
					matrix[a][b] = ulaz.nextDouble();
				}
			}
			// ispis matrice
			System.out.println("Matrica:");
			for (int a = 0; a < matrix.length; a++) {
				for (int b = 0; b < matrix.length; b++) {
					System.out.print(matrix[a][b] + " ");
				}
				System.out.println();
			}
			// pravimo objekat i ispisujemo rezultat
			z_5 lokacija = z_5.locateLargest(matrix);
			System.out.print("Najveci element u matrici je "
					+ lokacija.maxValue + " i nalazi se na poziciji " + "["
					+ lokacija.row + "]" + "[" + lokacija.column + "]");
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

}
