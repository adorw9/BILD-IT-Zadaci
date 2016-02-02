package Zadaci_02_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Random number chooser) Write a method that returns a random number between 1
 * and 54, excluding the numbers passed in the argument. The method header is
 * specified as follows: public static int getRandom(int... numbers)
 */
public class z_2 {

	// metoda za nasumièan broj
	public static int getRandom(int broj) {
		int i;
		do {
			i = (int) (Math.random() * 54) + 1;
		} while (i == broj);

		return i;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			// unos korisnik
			System.out.print("Unesite broj: ");
			int a = ulaz.nextInt();
			// pozivanje metode i ispis rezultata
			System.out.println(getRandom(a));
			ulaz.close();

		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}

	}
}
