package Zadaci_21_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Napisati program koji ispisuje tri nasumi�na cijela broja te pita korisnika
 * da unese njihov zbir. Ukoliko korisnik pogrije�i, program ispisuje pitanje
 * ponovo sve sa porukom da poku�a ponovo. Ukoliko korisnik unese ta�an odgovor,
 * program mu �estita i zavr�ava sa radom.
 */
public class z_1 {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			// generi�emo tri nasumi�na broja
			int a = (int) (Math.random() * 100);
			int b = (int) (Math.random() * 100);
			int c = (int) (Math.random() * 100);

			// postavljamo pitanje korisniku
			System.out.println("Unesit zbir brojeva: " + a + " + " + b + " + "
					+ c + "=");

			// odredimo zbir , i omogu�ujemo unos podatak od korisnika
			int zbir = a + b + c;
			int unos = ulaz.nextInt();

			// petljom postavljamo pitanje korisniku sve dok ne unese ta�an
			// odgovor
			while (unos != zbir) {
				System.out.println("Poku�ajte ponovo!");
				unos = ulaz.nextInt();

				if (unos == zbir) {
					System.out.println("Bravo,zbir je ta�an!");
				}
			}
		} catch (InputMismatchException ex) {
			System.out.println("GRE�KA: Neispravan unos podataka!");
			ulaz.close();
		}
	}
}
