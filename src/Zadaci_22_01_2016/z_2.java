package Zadaci_22_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Great circle distance predstavlja udaljenost izme�u dvije ta�ke na povr�ine
 * sfere. Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku �irinu i du�inu
 * dvije ta�ke. Great circle distance izme�u ove dvije ta�ke mo�e biti
 * izra�unata koriste�i se sljede�om formulom: d = radius * arccos (sin(x1) X
 * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)). Napisati program koij pita
 * korisnika da unese geografsku �irinu i du�inu u stepenima dvije ta�ke na
 * povr�ini zemlje te mu ispisuje great circle distance. Prosje�ni radius zemlje
 * je 6.371.01 km. Stepene koje korisnik unese trebamo promijeniti u radianse
 * koriste�i se Math.toRadians metodom jer Java trigonometrijske metode koriste
 * radianse. �irina i du�ina u ovoj formuli se odnose na zapad i sjever.
 * Koristimo negativne vrijednosti da ozna�imo istok i jug.
 */
public class z_2 {

	public static void main(String[] args) {
		// unos podataka od korisnika, unos negativnih vrijednosti se odnosi na
		// istok i jug
		Scanner ulaz = new Scanner(System.in);
		try {

			System.out.println("Unesite x1");
			double x1 = (double) Math.toRadians(ulaz.nextDouble());
			System.out.println("Unesite y1");
			double y1 = (double) Math.toRadians(ulaz.nextDouble());
			System.out.println("Unesite x2");
			double x2 = (double) Math.toRadians(ulaz.nextDouble());
			System.out.println("Unesite y2");
			double y2 = (double) Math.toRadians(ulaz.nextDouble());

			double radiusZemlje = 6371.01;
			// formula za izracun udaljenosti
			double d = radiusZemlje
					* Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1)
							* Math.cos(x2) * Math.cos(y1 - y2));

			d = Math.round(d * 100);
			d = d / 100;

			System.out.println("Udaljenost iznosi: " + d + " km");

		} catch (InputMismatchException ex) {
			System.out
					.println("Pogre�an unos podataka, dozvoljeni samo brojevi! ");
			ulaz.close();

		}

	}

}
