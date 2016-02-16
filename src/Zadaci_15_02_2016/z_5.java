package Zadaci_15_02_2016;

import java.util.Scanner;
import java.io.*;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * (Process scores in a text file) Suppose that a text file contains an
 * unspecified number of scores separated by blanks. Write a program that
 * prompts the user to enter the file, reads the scores from the file, and
 * displays their total and average.
 */
public class z_5 {
	// metoda za kreiranje file
	public static void kreiraj() throws FileNotFoundException {
		File file = new File("scores.txt");

		if (file.exists()) {
			System.out.println("File " + file + " ve� postoji!");
		}
		try (PrintWriter output = new PrintWriter(file)) {
			output.print(2 + " " + 56 + " " + 22 + " " + 76);
			output.close();
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner ulaz = new Scanner(System.in);
		// poziv metode
		kreiraj();

		try {
			// unos korisnik
			System.out.println("Unesite ime fajla:");
			String str = ulaz.next();

			File file = new File(str);
			// �itamo score i tra�imo sumu i prosjek
			Scanner s = new Scanner(file);

			int suma = 0;
			int brojac = 0;

			while (s.hasNext()) {

				int score = s.nextInt();

				suma = suma + score;
				brojac++;
				// ispis score
				System.out.println("Score: " + score);
			}
			// ispis sume i prosjeka
			System.out.println("Suma: " + suma);
			System.out.println("Prosjek: " + suma / brojac);

			s.close();
		} catch (FileNotFoundException ex) {
			System.out.println("GRE�KA! Pogre�an unos!");
			ulaz.close();
		}

	}

}
