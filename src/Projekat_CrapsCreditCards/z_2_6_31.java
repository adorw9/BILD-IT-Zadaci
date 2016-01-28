package Projekat_CrapsCreditCards;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Zadatak 6.31 iz knjige, Financial: credit card number validation
 */
public class z_2_6_31 {
	// metoda za sumu brojeva pomnoženih sa 2
	public static int sumaDvaParna(long broj) {

		int rezultat = 0;
		long pom = 0;
		// suma brojeva koje množimo sa 2
		while (broj > 0) {
			pom = broj % 100;
			rezultat += cifra((int) (pom / 10) * 2);
			broj = broj / 100;
		}

		return rezultat;
	}

	// metoda vraæa sumu neparnih cifri u broju
	public static int sumaNeparnih(long broj) {
		int rezultat = 0;
		// suma brojeva koji se ne množe sa 2
		while (broj != 0) {
			long pom = broj % 10;
			rezultat = rezultat + (int) pom;
			broj = broj / 100;
		}

		return rezultat;
	}

	// metoda za velicinu brojeva kartice
	public static int velicina(long d) {

		int brojac = 0;

		while (d > 0) {
			d = d / 10;

			brojac++;
		}

		return brojac;

	}

	// vraæa broj ako je manji od 10, u suprotnom vraca sumu dvije cifre
	public static int cifra(int broj) {

		if (broj <= 9) {
			return broj;
		} else {
			int prvaCifra = broj % 10;
			int drugaCifra = (int) (broj / 10);

			return prvaCifra + drugaCifra;
		}
	}

	// metoda kojom provjeravamo nazive kartica
	public static boolean prefix(long broj, int d) {

		if ((getPrefix(broj, d) == 4) || (getPrefix(broj, d) == 5)
				|| (getPrefix(broj, d) == 37) || (getPrefix(broj, d) == 6)) {

			if (getPrefix(broj, d) == 4) {
				System.out.print("Naziv kartice: - VISA -");
			} else if (getPrefix(broj, d) == 5) {
				System.out.print("Naziv kartice: - MASTER -");
			} else if (getPrefix(broj, d) == 37) {
				System.out.print("Naziv kartice: - AMERICAN EXPRESS -");
			} else if (getPrefix(broj, d) == 6) {
				System.out.print("Naziv kartice: - DISCOVER -");
			}

			return true;

		} else {

			return false;

		}
	}

	// metoda za provjeru kartice
	public static long getPrefix(long broj, int k) {

		if (velicina(broj) < k) {
			return broj;
		} else {

			int size = (int) velicina(broj);

			for (int i = 0; i < (size - k); i++) {
				broj = broj / 10;
			}

			return broj;

		}

	}

	// metoda vraca true ako je kartica validna
	public static boolean validnost(long broj) {
		// sabiramo rezultate koje smo dobili metodama
		int suma = sumaDvaParna(broj) + sumaNeparnih(broj);

		if ((suma % 10 == 0) && ((prefix(broj, 1))) && (velicina(broj) >= 13)
				&& (velicina(broj) <= 16)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		try {
			// unos podataka i ispis rezultata
			System.out.print("Unesite broj kartice: ");
			long unos = ulaz.nextLong();

			if (validnost(unos)) {
				System.out.println("\nKartica sa brojem: " + "'" + unos + "'"
						+ " je VALIDNA. ");
			} else {
				System.out.println("\nKartica sa brojem: " + "'" + unos + "'"
						+ " NIJE VALIDNA. ");
			}
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			System.out.println("UNESITE BROJ KARTICE!");
			ulaz.close();
		}
	}
}
