package Zadaci_20_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlije�e v, mo�emo
 * izra�unati minimalnu du�inu piste potrebne da avion uzleti koriste�i se
 * sljede�om formulom: du�ina = v * v / 2a. Napisati program koji pita korisnika
 * da unese v u m/s i a u m/s te ispisuje korisniku minimalnu du�inu piste.
 * (Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje du�ina piste je
 * 514.286)
 */

public class z_5 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			// unosimo podatke
			System.out.print("Unesite brzinu: ");
			double v = ulaz.nextDouble();
			System.out.print("Unesite ubrzanje: ");
			double a = ulaz.nextDouble();

			// formula za izracunavanje duzine
			double duzina = (v * v) / (2 * a);
			// ispis rezultata sa tri decimale
			duzina = Math.round(duzina * 1000);
			duzina = duzina / 1000;

			// ispis
			System.out.println("Minimalna du�ina piste: " + duzina);
		} catch (InputMismatchException ex) {
			System.out.println("GRE�KA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

}
