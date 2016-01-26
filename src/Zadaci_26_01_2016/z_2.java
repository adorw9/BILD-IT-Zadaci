package Zadaci_26_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji pita korisnika da unese dva cijela, pozitivna broja te
 * ispisuje najveæi i najmanji zajednièki djelilac za ta dva broja.
 */
public class z_2 {
	// metoda za pronalazenje najveceg djelilca
	public static int najveciDjelilac(int a, int b) {
		if (b == 0) {
			return a;
		}
		return najveciDjelilac(b, a % b);
	}

	// metoda za najmanji djelilac
	public static int najmanjiDjelilac(int a, int b) {

		return (a * b / najveciDjelilac(a, b));
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			System.out.print("Unesite prvi broj:");
			int a = ulaz.nextInt();
			// ako su brojevi manji od nule ponovo unosimo
			while (a < 0) {
				System.out.println("Unesite pozitivan broj!");
				a = ulaz.nextInt();
			}
			System.out.print("Unesite drugi broj:");
			int b = ulaz.nextInt();
			while (b < 0) {
				System.out.println("Unesite pozitivan broj!");
				b = ulaz.nextInt();
			}
			// pozivanje metode i ispis
			System.out.println("Najveæi zajednièki djelilac od " + a + " i "
					+ b + " je " + najveciDjelilac(a, b));
			System.out.println("Najmanji zajednièki djelilac od " + a + " i "
					+ b + " je " + najmanjiDjelilac(a, b));
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}

	}
}
