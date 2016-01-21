package Zadaci_21_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji pita korisnika da unese mjesec i godinu te mu ispiše
 * broj dana u datom mjesecu. Na primjer, ukoliko korisnik unese kao godinu 2012
 * a kao mjesec 2, program treba ispisati da je Februar 2012 imao 29 dana.
 * Ukoliko korisnik unese kao godinu 2015 a kao mjesec 3, program treba ispisati
 * da je Mart 2015 imao 31 dan.
 */
public class z_2 {
	// metoda za broj dana u mjesecu
	public static int brojDanaMjeseca(int godina, int mjesec) {
		// mjeseci koji imaju 31 dan
		if (mjesec == 1 || mjesec == 3 || mjesec == 5 || mjesec == 7
				|| mjesec == 8 || mjesec == 10 || mjesec == 12)
			return 31;
		// mjeseci koji imaju 30 dana
		if (mjesec == 4 || mjesec == 6 || mjesec == 9 || mjesec == 11)
			return 30;
		// februar koji zavisi od prijestupne godine
		if (mjesec == 2)
			return prijestupnaGodina(godina) ? 29 : 28;

		return 0;
	}

	// metoda za prijestupnu godinu
	public static boolean prijestupnaGodina(int godina) {
		return godina % 400 == 0 || (godina % 4 == 0 && godina % 100 != 0);
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// unosimo mjesec i godinu od korisnika
		try {
			System.out.println("Unesite mjesec:");
			int mjesec = ulaz.nextInt();
			System.out.println("Unesite godinu:");
			int godina = ulaz.nextInt();

			// odreðujemo nazive za mjesece
			String imeMjeseca = "";
			if (mjesec == 1)
				imeMjeseca = "Januar";
			else if (mjesec == 2)
				imeMjeseca = "Februar";
			else if (mjesec == 3)
				imeMjeseca = "Mart";
			else if (mjesec == 4)
				imeMjeseca = "April";
			else if (mjesec == 5)
				imeMjeseca = "Maj";
			else if (mjesec == 6)
				imeMjeseca = "Juni";
			else if (mjesec == 7)
				imeMjeseca = "Juli";
			else if (mjesec == 8)
				imeMjeseca = "August";
			else if (mjesec == 9)
				imeMjeseca = "Septembar";
			else if (mjesec == 10)
				imeMjeseca = "Oktobar";
			else if (mjesec == 11)
				imeMjeseca = "Novembar";
			else
				imeMjeseca = "Decembar";

			// ispis
			System.out.println(imeMjeseca + " " + godina + " ima "
					+ brojDanaMjeseca(godina, mjesec) + " dan.");
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();

		}
	}
}
