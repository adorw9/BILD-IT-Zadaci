package Zadaci_17_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Nizovi niz1 i niz2 su striktno identièni ukoliko su svi njihovi elementi na
 * istim pozicijama jednaki. Napisati metodu koja vraæa true ukoliko su nizovi
 * niz1 i niz2 striktno identièni. Koristiti sljedeæi header: public static
 * boolean equals(int[ ] niz1, int[ ] niz2) Napisati testni program koji pita
 * korisnika da unese dva niza cijelih brojeva te provjerava da li su striktno
 * identièni.
 */
public class z_3 {
	public static boolean equals(int[] niz1, int[] niz2) {
		// pravimo niz i poredimo da li su èlanovi jednaki
		for (int i = 0; i < niz1.length; i++) {
			if (niz1[i] != niz2[i]) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite brojeve u prvi niz");
		try {
			// pravimo prvi niz i upisujemo brojeve
			int[] niz1 = new int[5];
			for (int i = 0; i < niz1.length; i++) {
				niz1[i] = ulaz.nextInt();
			}
			System.out.println("Unesite brojeve u drugi niz");
			// drugi niz i upisivanje brojeva
			int[] niz2 = new int[5];
			for (int i = 0; i < niz2.length; i++) {
				niz2[i] = ulaz.nextInt();
			}
			// pozivamo metodu koja vraæa true za iste nizove false za razlièite
			System.out.println(equals(niz1, niz2));

		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

}
