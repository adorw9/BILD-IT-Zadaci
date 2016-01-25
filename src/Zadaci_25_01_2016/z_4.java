package Zadaci_25_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji pita korisnika da unese broj minuta (npr. 1 milijardu)
 * te ispiše korisniku koliko je to u godinama i danima. Zbog jednostavnosti,
 * pretpostavimo da godina ima 365 dana.
 */
public class z_4 {

	// metoda za pretvaranje minuta
	public static String Minute(long minute) {
		long ostatakMinuta = (minute % (60 * 24 * 365));

		return (String.format("%d godina i %d dana", minute / (60 * 24 * 365),
				ostatakMinuta / (60 * 24)));
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			System.out.print("Unesite minute: ");
			long minute = ulaz.nextLong();
			// ispis
			System.out.println(Minute(minute));
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

}
