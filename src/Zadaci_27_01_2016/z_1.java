package Zadaci_27_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * (Izra�unavanje napojnice) Napisati program koji u�itava ukupan iznos ra�una
 * koji treba uplatiti kao i procenat tog ra�una kojeg �elimo platiti kao
 * napojnicu te izra�unava ukupan ra�un i napojnicu. Na primjer, ukoliko
 * korisnik unese 10 kao ra�un i 15 % kao procenat za napojnicu program treba da
 * ispi�e da je ukupan ra�un za uplatiti 11.5 a napojnica 1.5.
 */
public class z_1 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			// unos racuna i napojnice (procenat od racuna)
			System.out.print("Unesite iznos ra�una: ");
			double racun = ulaz.nextDouble();
			System.out.print("Unesite procenat napojnice: ");
			double napojnica = ulaz.nextDouble();

			// izracun ukupnog racuna i napojnice
			double ukupanRacun = racun + ((napojnica / 100) * racun);
			double napojnicaOdRacuna = (napojnica / 100) * racun;

			System.out.println("Ukupan ra�un za uplatiti je " + ukupanRacun
					+ " KM, a napojnica " + napojnicaOdRacuna + " KM.");
		} catch (InputMismatchException ex) {
			System.out.println("GRE�KA: Neispravan unos podataka!");
			ulaz.close();
		}

	}
}
