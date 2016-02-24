package Zadaci_23_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Print the digits in an integer reversely) Write a recursive method that
 * displays an int value reversely on the console using the following header:
 * public static void reverseDisplay(int value) For example,
 * reverseDisplay(12345) displays 54321. Write a test program that prompts the
 * user to enter an integer and displays its reversal
 */
public class z_1 {

	// metoda za obrnuto
	public static void reverseDisplay(int value) {
		if (value <= 0) {
			return;
		}

		System.out.print(value % 10);

		reverseDisplay(value / 10);
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			// korisnik unos
			System.out.println("Unesite neki broj:");
			int broj = ulaz.nextInt();

			// pozivamo metodu
			reverseDisplay(broj);

		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA! Neispravan unos podataka!");
			ulaz.close();
		}

	}

}
