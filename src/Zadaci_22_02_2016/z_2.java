package Zadaci_22_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Compute greatest common divisor using recursion) The gcd(m, n) can also be
 * defined recursively as follows: If m % n is 0, gcd(m, n) is n. Otherwise,
 * gcd(m, n) is gcd(n, m % n). Write a recursive method to find the GCD. Write a
 * test program that prompts the user to enter two integers and displays their
 * GCD.
 */
public class z_2 {
	// metoda za najveci zajednicki djelilac
	public static int gcd(int m, int n) {
		if (m % n == 0) {
			return n;

		} else
			return gcd(n, m % n);
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			// korisnik unos
			System.out.println("Unesite prvi broj: ");
			int b1 = ulaz.nextInt();
			System.out.println("Unesite drugi broj: ");
			int b2 = ulaz.nextInt();
			// poziv metode i ispis
			System.out.println("Najveæi zajednièki djelilac je " + gcd(b1, b2));
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA!Pogrešan unos!");
			ulaz.close();
		}
	}
}
