package Zadaci_05_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
public class z_3Test {

	public static void main(String[] args) {
		try {
			Scanner ulaz = new Scanner(System.in);
			System.out.print("Unesite a: ");
			double a = ulaz.nextDouble();
			System.out.print("Unesite b: ");
			double b = ulaz.nextDouble();
			System.out.print("Unesite c: ");
			double c = ulaz.nextDouble();
			// objekat za kvadratnu jednacinu
			z_3 qe = new z_3(a, b, c);

			if (qe.getDiscriminant() > 0) {
				System.out.println("Root1: " + qe.getRoot1());
				System.out.println("Root2: " + qe.getRoot2());
			} else
				System.out.println("The equation has no roots!");
			ulaz.close();
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");

		}
	}

}
