package Zadaci_17_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Napisati metodu koja nalazi najmanji element u nizu decimalnih vrijednosti
 * koriste�i se sljede�im headerom: public static double min(double[ ] array)
 * Napi�ite potom test program koji pita korisnika da unese deset brojeva te
 * poziva ovu metodu da vrati najmanji element u nizu.
 */
public class z_2 {

	public static double min(double[] niz) {
		double najmanji = niz[0];
		// pronalazimo najmanji broj u nizu
		for (int i = 0; i < niz.length; i++) {
			if (najmanji > niz[i]) {
				najmanji = niz[i];
			}
		}
		return najmanji;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite 10 brojeva u niz:");
		try {
			// pravimo niz od 10 �lanova
			double[] niz = new double[10];
			for (int i = 0; i < niz.length; i++) {
				niz[i] = ulaz.nextDouble();
			}
			// pozivamo metodu koja vra�a najmanji �lan u nizu
			System.out.println(min(niz));

		} catch (InputMismatchException ex) {
			System.out.println("GRE�KA: Neispravan unos podataka!");
			ulaz.close();
		}
	}
}
