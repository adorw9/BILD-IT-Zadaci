package Zadaci_22_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Great circle distance predstavlja udaljenost izmeðu dvije taèke na površine
 * sfere. Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku širinu i dužinu
 * dvije taèke. Great circle distance izmeðu ove dvije taèke može biti
 * izraèunata koristeæi se sljedeæom formulom: d = radius * arccos (sin(x1) X
 * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)). Napisati program koij pita
 * korisnika da unese geografsku širinu i dužinu u stepenima dvije taèke na
 * površini zemlje te mu ispisuje great circle distance. Prosjeèni radius zemlje
 * je 6.371.01 km. Stepene koje korisnik unese trebamo promijeniti u radianse
 * koristeæi se Math.toRadians metodom jer Java trigonometrijske metode koriste
 * radianse. Širina i dužina u ovoj formuli se odnose na zapad i sjever.
 * Koristimo negativne vrijednosti da oznaèimo istok i jug.
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
					.println("Pogrešan unos podataka, dozvoljeni samo brojevi! ");
			ulaz.close();

		}

	}

}
