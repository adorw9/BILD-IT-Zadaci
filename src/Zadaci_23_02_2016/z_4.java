package Zadaci_23_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Sum the digits in an integer using recursion) Write a recursive method that
 * computes the sum of the digits in an integer. Use the following method
 * header: public static int sumDigits(long n) For example, sumDigits(234)
 * returns 2 + 3 + 4 = 9. Write a test program that prompts the user to enter an
 * integer and displays its sum.
 */
public class z_4 {
	// metoda za sum
	public static int sumDigits(int value) {
		if (value <= 0) {
			return 0;
		}
		return (value % 10) + sumDigits(value / 10);
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			// korisnik upis
			System.out.println("Unesite neki broj: ");
			int broj = ulaz.nextInt();
			// poziv metode i ispis
			System.out.println("Suma cifri: " + sumDigits(broj));
		} catch (InputMismatchException ex) {
			System.out.println("Cijelobrojni broj!");
			ulaz.close();
		}

	}

}
