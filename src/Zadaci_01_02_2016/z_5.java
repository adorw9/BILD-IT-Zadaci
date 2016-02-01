package Zadaci_01_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Napisati program koji u�itava 10 brojeva te ispisuje koilko je jedinstvenih
 * brojeva unijeto te sve jedinstvene brojeve koji su unijeti, razmaknute jednim
 * spaceom. Ukoliko se neki broj pojavljuje vi�e puta, broj treba ispisati samo
 * jednom.
 */
public class z_5 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		int jedinstveni = 0;
		int brojac = 1;
		int[] niz = new int[10];
		try {
			// unos od korisnika
			System.out.println("Unesite 10 brojeva: ");
			for (int i = 0; i < niz.length; i++) {
				niz[i] = ulaz.nextInt();
			}
			// tra�imo jedinstvene brojeve i ispisujemo rezultat
			System.out.println("Jedinstveni brojevi su: ");
			jedinstveni = niz[0];
			System.out.print(jedinstveni + " ");
			for (int i = 0; i < niz.length; i++) {
				for (int j = 0; j < niz.length; j++) {
					if (niz[i] == niz[j] && j != i) {
						niz[j] = jedinstveni;
					}
				}
				if (niz[i] != jedinstveni) {
					System.out.print(niz[i] + " ");
					brojac++;
				}
			}
			System.out.println("\nUkupno se nalazi " + brojac
					+ " jedinstvenih brojeva.");
		} catch (InputMismatchException ex) {
			System.out.println("GRE�KA: Neispravan unos podataka!");
			ulaz.close();
		}
	}
}
