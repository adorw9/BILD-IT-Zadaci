package Zadaci_11_02_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Largest rows and columns) Write a program that randomly fills in 0s and 1s
 * into an n-by-n matrix, prints the matrix, and finds the rows and columns with
 * the most 1s. (Hint: Use two ArrayLists to store the row and column indices
 * with the most 1s.)
 */
public class z_1 {
	// metoda za red sa najvise 1
	public static void najveciRed(int[][] m, ArrayList<Integer> red) {

		int max = 0;
		for (int i = 0; i < m.length; i++) {
			int brojac = 0;
			for (int j = 0; j < m[i].length; j++) {

				if (m[i][j] == 1) {
					brojac++;
				}
			}
			if (max < brojac) {
				max = brojac;
				red.clear();
				red.add(i);
			} else if (max == brojac) {
				red.add(i);
			}
		}

	}

	// metoda za kolonu sa najvise 1
	public static void najvecaKolona(int[][] m, ArrayList<Integer> kolona) {

		int max = 0;
		for (int j = 0; j < m[0].length; j++) {
			int brojac = 0;
			for (int i = 0; i < m.length; i++) {

				if (m[i][j] == 1) {
					brojac++;
				}
			}
			if (max < brojac) {
				max = brojac;
				kolona.clear();
				kolona.add(j);
			} else if (max == brojac) {
				kolona.add(j);
			}
		}
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			// unos od korisnika
			System.out.print("Unesite velièinu matrice: ");
			int n = ulaz.nextInt();
			int[][] m = new int[n][n];
			// random matrica
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					m[i][j] = (int) (Math.random() * 2);
				}
			}
			// pravimo liste red kolona
			ArrayList<Integer> red = new ArrayList<>();
			ArrayList<Integer> kolona = new ArrayList<>();
			najveciRed(m, red);
			najvecaKolona(m, kolona);

			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					System.out.print(m[i][j] + " ");
				}
				System.out.println();
			}
			// ispis rezultata
			System.out.println("Red sa najviše 1: " + red);
			System.out.println("Kolona sa najviše 1: " + kolona);

		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();

		}
	}
}
