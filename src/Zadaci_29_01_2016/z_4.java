package Zadaci_29_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati metodu koja izraèunava zbir svih brojeva u cijelom broju. Koristite
 * sljedeæi header: public static int sumDigits(long n). Na primjer, ako
 * pozovemo metodu i proslijedimo joj broj 234 (sumDigits(234)) metoda treba da
 * vrati 9. (2 + 3 + 4 = 9)
 */
public class z_4 {
	// metoda koja sabire cifre broja
	public static int sumDigits(long broj) {
		int suma = 0;
		while (broj != 0) {
			suma = suma % 100;
			suma = suma + (int) (broj % 10);
			broj = broj / 10;
		}
		return suma;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			// unos podataka i ispis rezultata
			System.out.println("Unesite neki broj: ");
			long broj = ulaz.nextLong();
			System.out.println("Suma svih brojeva u cijelom broju je: "
					+ sumDigits(broj));
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}
}
