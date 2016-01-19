package Zadaci_18_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati metodu sa sljedeæim headerom koja ispisuje tri broja u rastuæem
 * redosljedu: public static void displaySortedNumbers(double num1, double num2,
 * double num3). Napisati program koji pita korisnika da unese tri broja te
 * ispiše ta tri broja u rastuæem redosljedu
 */
public class z_3 {

	public static void displaySortedNumbers(double broj1, double broj2,
			double broj3) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite tri broja");
		try {
			double[] niz = new double[3];
			for (int i = 0; i < niz.length; i++) {
				niz[i] = ulaz.nextDouble();
			}
			double pom;
			int j = 0;
			while (j < niz.length) {
				j++;
				for (int i = 0; i < niz.length - 1; i++) {
					if (niz[i] < niz[i + 1]) {
						pom = niz[i];
						niz[i] = niz[i + 1];
						niz[i + 1] = pom;
					}
				} // for i
			} // for j
			for (int i = niz.length - 1; i >= 0; i--) {
				System.out.print(niz[i] + " ");
			}
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

	public static void main(String[] args) {

		double a = 0;
		double b = 0;
		double c = 0;

		displaySortedNumbers(a, b, c);
	}

}
