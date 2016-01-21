package Zadaci_21_01_2016;

import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Neke web stranice forsiraju odreðena pravila za passworde. Napisati metodu
 * koja provjerava da li je unijeti string validan password. Pravila da bi
 * password bio validan su sljedeæa: 1. Password mora biti saèinjen od najmanje
 * 8 karaktera. 2. Password smije da se sastoji samo od slova i brojeva. 3.
 * Password mora sadržati najmanje 2 broja. Napisati program koji pita korisnika
 * da unese password te mu ispisuje "password je validan" ukoliko su sva pravila
 * ispoštovana ili "password nije validan" ukoliko pravila nisu ispoštovana.
 */
public class z_5 {
	// metoda za provjeru lozinke
	public static boolean password(String lozinka) {
		// duzina lozinke
		if (lozinka.length() < 8) {
			return false;
		} else {
			char c;
			int brojac = 0;
			// provjeravamo da li se lozinka sasatoji od rijeci i brojeva, s tim
			// da u lozinci moraju biti sadrzana najmanje dva broja
			for (int i = 0; i < lozinka.length(); i++) {
				c = lozinka.charAt(i);
				if (!Character.isLetterOrDigit(c)) {
					return false;
				} else if (Character.isDigit(c)) {
					brojac++;
				}
			}
			if (brojac < 2) {

				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.print("Unesite password: ");
		String a = ulaz.next();
		if (password(a)) {
			System.out.println("Password je dobar.");
		} else {
			System.out.println("Password nije dobar!");
			ulaz.close();
		}
	}
}
