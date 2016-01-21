package Zadaci_21_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji ispisuje tri nasumièna cijela broja te pita korisnika
 * da unese njihov zbir. Ukoliko korisnik pogriješi, program ispisuje pitanje
 * ponovo sve sa porukom da pokuša ponovo. Ukoliko korisnik unese taèan odgovor,
 * program mu èestita i završava sa radom.
 */
public class z_1 {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			// generišemo tri nasumièna broja
			int a = (int) (Math.random() * 100);
			int b = (int) (Math.random() * 100);
			int c = (int) (Math.random() * 100);

			// postavljamo pitanje korisniku
			System.out.println("Unesit zbir brojeva: " + a + " + " + b + " + "
					+ c + "=");

			// odredimo zbir , i omoguæujemo unos podatak od korisnika
			int zbir = a + b + c;
			int unos = ulaz.nextInt();

			// petljom postavljamo pitanje korisniku sve dok ne unese taèan
			// odgovor
			while (unos != zbir) {
				System.out.println("Pokušajte ponovo!");
				unos = ulaz.nextInt();

				if (unos == zbir) {
					System.out.println("Bravo,zbir je taèan!");
				}
			}
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}
}
