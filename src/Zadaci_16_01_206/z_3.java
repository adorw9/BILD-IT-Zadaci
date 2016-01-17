package Zadaci_16_01_206;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napišite program koji æe brojati broj karaktera, rijeèi i linija teksta u
 * nekom fileu. Rijeèi trebaju biti odvojene jednim spaceom. Ime file
 * proslijediti kao argument u vaš program. (Ovo je text koji æu jakoristiti za
 * testiranje, ukoliko nema ideja)
 */
public class z_3 {

	public static void main(String[] args) throws FileNotFoundException {
		// unosimo ime fajla za èitanje
		System.out.println("File za èitanje: ");
		Scanner ulaz = new Scanner(System.in);
		String fileIme = ulaz.nextLine();

		// èitanje file
		try {
			FileReader fReader = new FileReader(fileIme);
			// èitamo ime unesenog file
			BufferedReader citac = new BufferedReader(fReader);
			String tekst;
			String sadrzaj = "";
			// brojaci
			int rijeci = 0;
			int linije = 0;
			int karakteri = 0;
			// ako je tekst jednak èitaèu koji nije prazan, onda se brojaci
			// povecavaju
			while ((tekst = citac.readLine()) != null) {
				// brojac linija
				linije += 1;
				sadrzaj += tekst;

				// brojac rijeci
				String[] _rijeci = tekst.split(" ");

				for (@SuppressWarnings("unused")
				String r : _rijeci) {
					rijeci++;
				}
			}
			// brojac karaktera
			karakteri = sadrzaj.length();

			citac.close();
			// ispis linija rijec i karaktera
			System.out.println("Broj linija: " + linije);
			System.out.println("Broj rijeci: " + rijeci);
			System.out.println("Broj karaktera: " + karakteri);
		} catch (FileNotFoundException ex) {
			System.out.println("File nije pronaðen!");

		} catch (IOException ex) {
			System.out.println("GREŠKA");
		}
	}
}