package Zadaci_24_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Napisati metodu koja vra�a broj dana u godini. Metoda koristi sljede�i
 * header: public static int numberOfDayInAYear(int year). Napisati program koji
 * pita korisnika da unese po�etnu godinu, krajnju godinu te ispisuje broj dana
 * za svaku godinu u rasponu.
 */
public class z_1 {
	// metoda za izracun broj dana u godini
	public static int brojDanaUGodini(int godina) {
		// ako je godina prijestupna return 366
		if (godina % 400 == 0 || (godina % 4 == 0 && godina % 100 != 0)) {
			return 366;
		} else
			return 365;

	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			System.out.println("Unesite po�etnu godinu");
			int pocetna = ulaz.nextInt();
			System.out.println("Unesite krajnju godinu");
			int krajnja = ulaz.nextInt();
			// ispis dana od unosa pocetne do krajnje godine
			for (int i = pocetna; i <= krajnja; i++) {
				System.out.println(i + " godina ima: " + brojDanaUGodini(i)
						+ " dana.");
			}
		} catch (InputMismatchException ex) {
			System.out.println("GRE�KA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

}
