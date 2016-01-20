package Zadaci_20_01_2016;

import java.awt.Font;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Napisati program koji ispisuje sve prijestupne godine, 10 po liniji, u
 * rasponu godina koje korisnik unese. Program pita korisnika da unese po�etnu
 * godinu, krajnju godinu te ispisuje sve godine u tom rasponu. Razmak izme�u
 * godina treba biti jedan space.
 */
public class z_2 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// unosimo po�etnu i krajnju godinu od korisnika
		try {
			System.out.print("Unesite po�etnu godinu:");
			int poc = ulaz.nextInt();
			System.out.print("Unesite krajnju godinu:");
			int kraj = ulaz.nextInt();
			// for petljom ispitujemo koje su godine prijestupne i ispisujemo
			// rezultat, brojac nam sluzi za linije
			int brojac = 1;
			for (int i = poc; i <= kraj; i++) {
				if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {

					if (brojac == 10) {
						System.out.println(i + " ");
						brojac = 1;
					} else {
						System.out.print(Font.BOLD + i + " ");
						brojac++;
					}

				}
			}
		} catch (InputMismatchException ex) {
			System.out.println("GRE�KA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

}
