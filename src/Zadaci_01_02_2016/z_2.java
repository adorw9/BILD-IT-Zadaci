package Zadaci_01_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji prima karakter te vraæa njegov Unicode. Primjer:
 * ukoliko korisnik unese karakter E program mu vraæa 69 kao unicode za taj
 * karakter.
 */
public class z_2 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			// unos od korisnika
			System.out.print("Unesite karakter: ");
			char slovo = ulaz.next().charAt(0);
			// ispis rezultata
			System.out.println("Unicode za karakter " + slovo + " je "
					+ (int) slovo);
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

}
