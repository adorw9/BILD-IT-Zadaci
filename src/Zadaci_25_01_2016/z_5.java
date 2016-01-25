package Zadaci_25_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji uèitava neodreðen broj cijelih brojeva, odreðuje koliko
 * je pozitivnih brojeva korisnik unijeo, koliko negativnih te izraèunava ukupnu
 * sumu i prosjek svih unesenih brojeva. (Korisnik prekida unos tako što unese
 * nulu). Na primjer, ukoliko korisnik unese 1 2 -1 3 0 program treba da ispiše
 * da je broj pozitivnih brojeva 3, negativnih brojeva 1, suma ili zbir su 5.0 a
 * prosjek svih brojeva je 1.25
 */
public class z_5 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// brojaci pozitivnih i negativnih brojeva
		int brojac1 = 0;
		int brojac2 = 0;
		// izracuvanje sume i prosjeka
		double suma = 0;
		double prosjek = 0;
		int broj = 1;
		System.out.println("Unesite brojeve (0 prekida unos):");

		try {
			// unosimo brojeve, 0 prekida unos
			while (broj != 0) {
				broj = ulaz.nextInt();
				// ako je korisnikov unos veæi od 0 pozitivni++
				if (broj > 0) {
					brojac1++;
					// ako je korisnikov unos manji od 0 negativni++
				} else if (broj < 0) {
					brojac2++;
				}
				// raèunamo sumu i prosjek unesenih brojeva
				suma += broj;

			}
			prosjek = suma / (brojac1 + brojac2);
			// ispis rezultata
			System.out.print("Pozitivnih brojeva je uneseno: " + brojac1);
			System.out.print("\nNegativnih brojeva je uneseno: " + brojac2);
			System.out.print("\nSuma svih brojeva je: " + suma);
			System.out.print("\nProsjek unesenih brojeva je: " + prosjek);
		} catch (InputMismatchException ex) {
			System.out
					.println("Pogrešan unos podataka, dozvoljeni samo brojevi! ");
			ulaz.close();

		}

	}

}
