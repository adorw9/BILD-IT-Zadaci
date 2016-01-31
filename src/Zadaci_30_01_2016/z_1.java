package Zadaci_30_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji pita korisnika da unese cijeli trocifreni broj te
 * provjerava da li je unijeti broj palindrom. Broj je palindrom ukoliko se èita
 * isto i sa lijeva na desno i sa desna na lijevo npr. 121, 131, itd.
 */
public class z_1 {

	public static void main(String[] args) {
		// unos podatak od korisnika
		Scanner ulaz = new Scanner(System.in);
		try {
			System.out.print("Unesite trocifren broj: ");
			int broj = ulaz.nextInt();
			int a, b, c;

			a = broj / 100;
			b = broj / 10;
			b = b % 10;
			c = broj % 10;
			// uslov (prva cifra jedna zadnjoj) i ispis
			if (a == c) {
				System.out.println("Broj je palindrom.");
			} else
				System.out.println("Broje nije palindrom.");

		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}
}
