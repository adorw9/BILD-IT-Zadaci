package Zadaci_20_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlijeæe v, možemo
 * izraèunati minimalnu dužinu piste potrebne da avion uzleti koristeæi se
 * sljedeæom formulom: dužina = v * v / 2a. Napisati program koji pita korisnika
 * da unese v u m/s i a u m/s te ispisuje korisniku minimalnu dužinu piste.
 * (Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje dužina piste je
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
			System.out.println("Minimalna dužina piste: " + duzina);
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

}
