package Zadaci_30_01_2016;

import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji pita korisnika da unese Social Security Number (SSN) u
 * formatu DDD-DD-DDDD gdje D predstavlja broj. Program treba da provjerava da
 * li je broj unesešen u ispravnom formatu. Ukoliko nije, program pita korisnika
 * da pokuša ponovo. Ukoliko jeste unešen u pravom formatu, program završava sa
 * radom.
 */
public class z_3 {
	// metoda za pvorjeru validnosti SSN-a
	public static boolean validnost(String str) {
		// provjeravamo dužinu stringa
		if (str.length() != 11)
			return false;

		// ispitujemo karaktere
		for (int i = 0; i < str.length(); i++) {
			if (i <= 2) {
				if (!isDigit(str.charAt(i))) {
					return false;
				}
			} else if (i == 3 || i == 6) {
				// pozivamo metodu za crticu
				if (!isDash(str.charAt(i))) {
					return false;
				}
			} else if (i > 6) {
				// pozivamo metodu za broj
				if (!isDigit(str.charAt(i))) {
					return false;
				}
			}
		}
		return true;
	}

	// metoda za broj
	public static boolean isDigit(char c) {
		return Character.isDigit(c);
	}

	// metoda za crticu
	public static boolean isDash(char c) {
		return (c == '-');
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		String str = null;
		boolean validan = false;

		System.out.print("Ukucajte SSN: ");

		while (validan == false) {
			try {
				str = ulaz.nextLine();
				validan = true;
			} catch (Exception e) {
				System.out.println("Ukucajte SSN!!!");
			}
		}

		if (validnost(str) == true) {
			System.out.println(str + " je validan SSN.");
		} else
			System.out.println(str + " nije validan SSN.");
		ulaz.close();

	}

}
