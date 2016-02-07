package Zadaci_06_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Displaying the prime factors
 */
public class z_4Test {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			// korisnik unos
			System.out.println("Unesite broj: ");
			int broj = ulaz.nextInt();

			// pravimo objekat
			z_4 stack = new z_4();

			int i = 2;
			while (broj != 1) {
				if (broj % i == 0) {
					stack.integer(i);
					broj = broj / i;
					i = 2;
				} else {
					i++;
				}
			}
			// ispis
			System.out.println("Prosti faktori su: " + stack.obrnuto());
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}
}
