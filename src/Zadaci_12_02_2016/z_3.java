package Zadaci_12_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (InputMismatchException) Write a program that prompts the user to read two
 * integers and displays their sum. Your program should prompt the user to read
 * the number again if the input is incorrect.
 */
public class z_3 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		int a = 0;
		int b = 0;
		// korisnik unos
		try {
			System.out.print("Unesite prvi broj: ");
			a = ulaz.nextInt();
			System.out.print("Unesite drugi broj: ");
			b = ulaz.nextInt();
			// suma brojeva
			int suma = a + b;
			System.out.println("Suma brojeva " + a + " + " + b + " = " + suma);

		} catch (InputMismatchException ex) {
			System.out.println("Neispravan unos podataka! Pokušajte ponovo!");
			// ponovo unošenje u sluèaju greške
			main(args);
			ulaz.close();
		}
	}
}
