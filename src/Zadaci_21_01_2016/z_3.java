package Zadaci_21_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji pita korisnika da unese godinu i prva tri slova imena
 * mjeseca (prvo slovo uppercase) te mu ispiše broj dana u tom mjesecu. Na
 * primjer, ukoliko korisnik kao godinu unese 2001 a kao mjesec Jan program mu
 * ispisuje da Jan 2011 ima 31 dan.
 */
public class z_3 {
	// metoda za broj dana u mjesecu
	public static int brojDanaMjeseca(int godina, int mjes) {
		// mjeseci koji imaju 31 dan
		if (mjes == 1 || mjes == 3 || mjes == 5 || mjes == 7 || mjes == 8
				|| mjes == 10 || mjes == 12)
			return 31;
		// mjeseci koji imaju 30 dana
		if (mjes == 4 || mjes == 6 || mjes == 9 || mjes == 11)
			return 30;
		// februar koji zavisi od prijestupne godine
		if (mjes == 2)
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
			System.out.print("Unesite godinu: ");
			int godina = ulaz.nextInt();
			System.out.print("Unesite prva tri slova mjeseca: ");

			int intMjesec = 0;
			// stavljamo skracenice mjeseci u niz
			String[] mjeseci = { "Jan", "Feb", "Mar", "Apr", "Maj", "Jun",
					"Jul", "Aug", "Sep", "Okt", "Nov", "Dec" };

			String imeMjeseca = "";

			imeMjeseca = ulaz.next();
			// prolazimo kroz niz,da bi uporedili unos sa nizom
			for (int i = 0; i < mjeseci.length; i++) {
				if (imeMjeseca.equals(mjeseci[i])) {

					intMjesec = (i + 1);
				}
			}
			// odredujemo nazive za mjesece
			switch (brojDanaMjeseca(godina, intMjesec)) {
			case 1:
				imeMjeseca = "Januar";
				break;
			case 2:
				imeMjeseca = "Februar";
				break;
			case 3:
				imeMjeseca = "Mart";
				break;
			case 4:
				imeMjeseca = "April";
				break;
			case 5:
				imeMjeseca = "Maj";
				break;
			case 6:
				imeMjeseca = "Juni";
				break;
			case 7:
				imeMjeseca = "Juli";
				break;
			case 8:
				imeMjeseca = "August";
				break;
			case 9:
				imeMjeseca = "Septembar";
				break;
			case 10:
				imeMjeseca = "Oktobar";
				break;
			case 11:
				imeMjeseca = "Novembar";
				break;
			case 12:
				imeMjeseca = "Decembar";
			}

			// ispis
			System.out.println(imeMjeseca + " " + godina + " ima "
					+ brojDanaMjeseca(godina, intMjesec) + " dan.");
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();

		}

	}

}
