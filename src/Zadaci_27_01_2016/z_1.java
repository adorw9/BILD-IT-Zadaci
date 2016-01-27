package Zadaci_27_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Izraèunavanje napojnice) Napisati program koji uèitava ukupan iznos raèuna
 * koji treba uplatiti kao i procenat tog raèuna kojeg želimo platiti kao
 * napojnicu te izraèunava ukupan raèun i napojnicu. Na primjer, ukoliko
 * korisnik unese 10 kao raèun i 15 % kao procenat za napojnicu program treba da
 * ispiše da je ukupan raèun za uplatiti 11.5 a napojnica 1.5.
 */
public class z_1 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			// unos racuna i napojnice (procenat od racuna)
			System.out.print("Unesite iznos raèuna: ");
			double racun = ulaz.nextDouble();
			System.out.print("Unesite procenat napojnice: ");
			double napojnica = ulaz.nextDouble();

			// izracun ukupnog racuna i napojnice
			double ukupanRacun = racun + ((napojnica / 100) * racun);
			double napojnicaOdRacuna = (napojnica / 100) * racun;

			System.out.println("Ukupan raèun za uplatiti je " + ukupanRacun
					+ " KM, a napojnica " + napojnicaOdRacuna + " KM.");
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}

	}
}
