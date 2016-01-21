package Projekat_Kalendar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * KALENDAR
 */
public class Kalendar_2 extends Kalendar_1 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);

		// Omoguæiti korisniku da unese godinu
		System.out.print("Unesite godinu: ");
		int godina = ulaz.nextInt();

		// Omoguæiti unos mjeseca
		System.out.print("Unesite mjesec od 1 do 12: ");
		int mjesec = ulaz.nextInt();

		// Ispis kalendara za odgovarajuæi mjesec
		printKalendar(godina, mjesec);
		System.out.println("_____________________________");

		// upisivanje remindera

		Scanner ulaz1 = new Scanner(System.in);
		Calendar test1 = Calendar.getInstance();

		test1.clear();
		// formatiranje datuma za izbacivanje mjeseca godine i dana
		SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");
		System.out.println("Unesite reminder: ");
		String reminder = ulaz1.nextLine();

		System.out.println("Za koji mjesec želite reminder: ");
		mjesec = ulaz1.nextInt();
		System.out.println("Za koji dan želite reminder: ");
		int dan = ulaz1.nextInt();
		// postavljanje datuma koje korisnik unosi
		test1.set(godina, mjesec - 1, dan);

		try {
			File fajl = new File("reminder.txt");

			FileWriter p = new FileWriter(fajl);
			// zapisivanje remindera
			p.write(reminder);
			p.write(System.getProperty("line.separator"));
			p.close();

		} catch (IOException IO) {
			IO.printStackTrace();
		}
		System.out.println("Uspješno ste dodali reminder!");

		System.out.println();

		// ispisivanje remindera
		System.out.println("Reminder koji ste unijeli datuma "
				+ format.format(test1.getTime()) + " : ");

		BufferedReader reader = null;

		try {

			String s;

			reader = new BufferedReader(new FileReader("reminder.txt"));

			while ((s = reader.readLine()) != null) {
				System.out.println(s);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}
