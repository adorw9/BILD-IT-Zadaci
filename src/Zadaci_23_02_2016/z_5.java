package Zadaci_23_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Find the largest number in an array) Write a recursive method that returns
 * the largest integer in an array. Write a test program that prompts the user
 * to enter a list of eight integers and displays the largest element.
 */
public class z_5 {
	// metoda za najveci èlan niza
	public static int maxNumber(int[] niz, int i) {
		if (i > 0) {
			return Math.max(niz[i], maxNumber(niz, (i - 1)));
		} else
			return niz[0];
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// pravimo niz od osam èlanoca
		int[] niz = new int[8];
		try {
			// korisnik unos
			System.out.println("Unesite 8 brojeva: ");
			for (int i = 0; i < niz.length; i++) {
				niz[i] = ulaz.nextInt();

			}
			for (int i = 0; i < niz.length; i++) {
				System.out.print(niz[i] + " ");
			}
			// ispis
			System.out.println();
			System.out.println("Najveæi èlan je: "
					+ maxNumber(niz, niz.length - 1));
		} catch (InputMismatchException e) {
			System.out.println("GREŠKA! Pogrešan unos podataka!");
			ulaz.close();

		}
	}
}
