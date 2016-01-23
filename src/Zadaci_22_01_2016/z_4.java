package Zadaci_22_01_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napišite program koji uèitava neodreðen broj cijelih brojeva (unos prekida
 * nula), pronalazi najveæi od unijetih brojeva te ispisuje koliko se najveæi
 * broj puta ponovio. Na primjer, ukoliko unesemo 3 5 2 5 5 5 0 program ispisuje
 * da je najveæi broj 5 te ispisuje da se isti ponavlja 4 puta.
 */
public class z_4 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);

		int broj;
		System.out.println("Unesite brojeve (0 prekida unos):");
		// pravimo listu kojoj dodajemo unose od korisnika
		try {
			ArrayList<Integer> a = new ArrayList<>();
			broj = ulaz.nextInt();
			// unosimo brojeve, 0 prekida unos
			while (broj != 0) {
				a.add(broj = ulaz.nextInt());

			}

			// ispis najveces broja u listi i koliko se puta on ponavlja
			System.out.println("Najveæi broj je " + Collections.max(a)
					+ " ,a ponavlja se "
					+ Collections.frequency(a, Collections.max(a)) + " puta.");
		} catch (InputMismatchException ex) {
			System.out
					.println("Pogrešan unos podataka, dozvoljeni samo brojevi! ");
			ulaz.close();

		}
	}
}
