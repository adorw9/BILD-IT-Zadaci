package Zadaci_19_01_2016;

import java.util.Scanner;
/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati metodu koja broji slova u stringu. Metoda treba koristiti sljedeæi
 * header: public static int countLetters(String s). Napisati program koji pita
 * korisnika da unese neki string te mu vrati koliko taj string ima slova.
 */
public class z_5 {
	// metoda za brojac slova u stringu
	public static int brojSlova(String s) {

		// brojac provjerava duzinu stringa i broji slova
		int brojac = 0;
		// unos stringa zanemaruje praznine (space)

		String ulaz = s.replace(" ", "");

		brojac = ulaz.length();

		return brojac;

	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);

		// unosimo string
		System.out.println("Unesite string");
		String a = ulaz.nextLine();
		// ispis pozivanjem metode
		System.out.println("String koji ste unijeli sadrzi " + brojSlova(a)
				+ " slova.");

		ulaz.close();

	}
}
