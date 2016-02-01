package Zadaci_01_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati metodu sa sljedeæim headerom: public static String format(int
 * number, int width) koja vraæa string broja sa prefiksom od jedne ili više
 * nula. Velièina stringa je width argument. Na primjer, ukoliko pozovemo metodu
 * format(34, 4) metoda vraæa 0034, ukoliko pozovemo format(34, 5) metoda vraæa
 * 00034. Ukoliko je uneseni broj veæi nego width argument, metoda vraæa samo
 * string broja. Npr. ukoliko pozovemo format(34, 1) metoda vraæa 34.
 */
public class z_4 {
	// metoda koja vraæa string broja sa prefiksom
	public static String format(int number, int width) {
		// postavljamo nule na osnovu broja dužine
		return String.format("%0" + width + "d", number);
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			// unos od korisnika
			System.out.print("Unesite broj: ");
			int broj = ulaz.nextInt();
			System.out.print("Unesite 'duzinu': ");
			int duzina = ulaz.nextInt();
			// pozivanje metode i ispis rezultata
			System.out.println(format(broj, duzina));
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

}
