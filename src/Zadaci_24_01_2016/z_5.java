package Zadaci_24_01_2016;

import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji pita korisnika da unese dva stringa te provjerava i
 * ispisuje da li je drugi string substring prvog stringa. Na primjer, ukoliko
 * korisnik unese ABCD kao prvi string a BC kao drugi string program mu ispisuje
 * da je BC substring ABCD stringa.
 */
public class z_5 {
	// metoda za provjeru da li je drugi string sadrzan u drugom
	public static boolean isSubstring(String str1, String str2) {
		if (str1.contains(str2)) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// unos stringova od korisnika
		System.out.print("Unesite prvi String: ");
		String string1 = ulaz.next();
		System.out.print("Unesite drugi String: ");
		String string2 = ulaz.next();
		// poziv metode i ispis rezultata
		if (isSubstring(string1, string2)) {
			System.out.println("-" + string2 + "-" + " je substring " + "-"
					+ string1 + "-" + " stringa.");
		} else {
			System.out.println("-" + string2 + "-" + " NIJE substring " + "-"
					+ string1 + "-" + " stringa.");
			ulaz.close();
		}
	}
}
