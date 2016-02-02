package Zadaci_02_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Pattern recognition: consecutive four equal numbers) Write the following
 * method that tests whether the array has four consecutive numbers with the
 * same value. public static boolean isConsecutiveFour(int[] values) Write a
 * test program that prompts the user to enter a series of integers and displays
 * if the series contains four consecutive numbers with the same value. Your
 * program should first prompt the user to enter the input size—i.e., the number
 * of values in the series.
 */
public class z_3 {
	// metoda za uzastopne brojeve
	public static boolean uzastopniBrojevi(int[] niz) {
		boolean sadrziUzastopne = false;
		int vrijednost = niz[0];
		int brojac = 1;

		for (int i = 1; i < niz.length; i++) {
			if (niz[i] == vrijednost) {
				brojac++;
			} else {
				vrijednost = niz[i];
				brojac = 1;
			}
			if (brojac == 4) {
				sadrziUzastopne = true;

			}
		}
		return sadrziUzastopne;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			// unos od korisnika
			System.out.println("Unesite velièinu niza");
			int a = ulaz.nextInt();

			int[] niz = new int[a];
			System.out.println("Unosite brojeve niza");
			for (int i = 0; i < niz.length; i++) {
				niz[i] = ulaz.nextInt();
			}
			// pozivanje metode i ispis rezultata
			System.out
					.println(uzastopniBrojevi(niz) ? "Brojevi imaju iste 4 vrijednosti."
							: "Brojevi nemaju iste 4 vrijednosti");

		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

}
