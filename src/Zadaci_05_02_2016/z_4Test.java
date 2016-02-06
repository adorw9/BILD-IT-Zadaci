package Zadaci_05_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
public class z_4Test {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			System.out.print("Unesite a: ");
			double a = ulaz.nextDouble();
			System.out.print("Unesite b: ");
			double b = ulaz.nextDouble();
			System.out.print("Unesite c: ");
			double c = ulaz.nextDouble();
			System.out.print("Unesite d: ");
			double d = ulaz.nextDouble();
			System.out.print("Unesite e: ");
			double e = ulaz.nextDouble();
			System.out.print("Unesite f: ");
			double f = ulaz.nextDouble();

			// objekat linearna jednaèina
			z_4 le = new z_4(a, b, c, d, e, f);
			if (le.isSolvable()) {
				System.out.println("X: " + le.getX());
				System.out.println("\nY: " + le.getY());
			} else
				System.out.println("Jednaèina nema rješenja!");
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}
}
