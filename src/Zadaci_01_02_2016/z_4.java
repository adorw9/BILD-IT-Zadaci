package Zadaci_01_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Napisati metodu sa sljede�im headerom: public static String format(int
 * number, int width) koja vra�a string broja sa prefiksom od jedne ili vi�e
 * nula. Veli�ina stringa je width argument. Na primjer, ukoliko pozovemo metodu
 * format(34, 4) metoda vra�a 0034, ukoliko pozovemo format(34, 5) metoda vra�a
 * 00034. Ukoliko je uneseni broj ve�i nego width argument, metoda vra�a samo
 * string broja. Npr. ukoliko pozovemo format(34, 1) metoda vra�a 34.
 */
public class z_4 {
	// metoda koja vra�a string broja sa prefiksom
	public static String format(int number, int width) {
		// postavljamo nule na osnovu broja du�ine
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
			System.out.println("GRE�KA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

}
