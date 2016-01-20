package Zadaci_20_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Napisati metode sa sljede�im headerima: public static int reverse(int number)
 * i public static boolean isPalindrome(int number). Prva metoda prima cijeli
 * broj kao argument i vra�a isti ispisan naopako. (npr. reverse(456) vra�a
 * 654.) Druga metoda vra�a true ukoliko je broj palindrom a false ukoliko nije.
 * Koristite reverse metodu da implementirate isPalindrome metodu. Napi�ite
 * program koji pita korisnika da unese broj te mu vrati da li je broj
 * palindrome ili ne.
 */
public class z_3 {
	// metoda koja ispisuje broj nopako
	public static int reverse(int broj) {
		// petljom omogu�avamo da se broj ispi�e naopako
		int unazad = 0;
		while (broj != 0) {
			unazad = unazad * 10;
			unazad = unazad + (broj % 10);
			broj = broj / 10;
		}

		return unazad;
	}

	// metoda za true ili false
	public static boolean isPalindrom(int broj) {
		// pozivamo metodu reverse i provjeravamo da li je broj palindrom
		return broj == reverse(broj);
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			System.out.println("Unesite broj:");
			int a = ulaz.nextInt();

			System.out.println("Broj koji ste unijeli je: " + reverse(a));

			System.out.println("Da li je palindrom ? " + " ---> "
					+ isPalindrom(a));

		} catch (InputMismatchException ex) {
			System.out.println("GRE�KA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

}
