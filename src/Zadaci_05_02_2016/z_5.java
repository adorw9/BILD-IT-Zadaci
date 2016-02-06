package Zadaci_05_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Geometry: intersecting point
 */
public class z_5 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);

		double x1, x2, x3, x4, y1, y2, y3, y4;
		// unos podataka
		try {
			System.out.println("Unesite X1: ");
			x1 = ulaz.nextDouble();
			System.out.println("Unesite Y1: ");
			y1 = ulaz.nextDouble();
			System.out.println("Unesite X2: ");
			x2 = ulaz.nextDouble();
			System.out.println("Unesite Y2: ");
			y2 = ulaz.nextDouble();
			System.out.println("Unesite X3: ");
			x3 = ulaz.nextDouble();
			System.out.println("Unesite Y3: ");
			y3 = ulaz.nextDouble();
			System.out.println("Unesite X4: ");
			x4 = ulaz.nextDouble();
			System.out.println("Unesite Y4: ");
			y4 = ulaz.nextDouble();

			double a = y1 - y2;
			double b = x1 - x2;
			double c = y3 - y4;
			double d = x3 - x4;
			double e = a * x1 - b * y1;
			double f = c * x3 - d * y3;
			// kreiramo objekat i ispisujemo rezultat
			z_4 le = new z_4(a, b, c, d, e, f);
			if (le.isSolvable()) {
				System.out.println("Taèka presjeka: " + le.getX() + le.getY());
			} else {
				System.out.println("Linije su paralelne!");
			}
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

}
