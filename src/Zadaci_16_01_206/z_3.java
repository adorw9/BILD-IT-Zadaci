package Zadaci_16_01_206;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Napi�ite program koji �e brojati broj karaktera, rije�i i linija teksta u
 * nekom fileu. Rije�i trebaju biti odvojene jednim spaceom. Ime file
 * proslijediti kao argument u va� program. (Ovo je text koji �u jakoristiti za
 * testiranje, ukoliko nema ideja)
 */
public class z_3 {

	public static void main(String[] args) throws FileNotFoundException {
		// unosimo ime fajla za �itanje
		System.out.println("File za �itanje: ");
		Scanner ulaz = new Scanner(System.in);
		String fileIme = ulaz.nextLine();

		// �itanje file
		try {
			FileReader fReader = new FileReader(fileIme);
			// �itamo ime unesenog file
			BufferedReader citac = new BufferedReader(fReader);
			String tekst;
			String sadrzaj = "";
			// brojaci
			int rijeci = 0;
			int linije = 0;
			int karakteri = 0;
			// ako je tekst jednak �ita�u koji nije prazan, onda se brojaci
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
			System.out.println("File nije prona�en!");

		} catch (IOException ex) {
			System.out.println("GRE�KA");
		}
	}
}