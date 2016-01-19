package Zadaci_18_01_2016;

import java.util.InputMismatchException;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Napisati metodu koja printa 100 nasumi�nih uppercase karaktera i 100
 * nasumi�nih brojeva, 10 po liniji.
 */
public class z_4 {
	// metoda za ispis 100 karaktera
	public static void ispisS() {

		System.out.println("SLOVA:");
		try {
			// trazimo 100 random uppercase karaktera, koriste�i ASCII,
			// ispisujemo ih po deset u liniji
			for (int i = 1; i <= 100; i++) {
				int karakter = (int) (Math.random() * 26) + 65;
				if (i % 10 == 0) {
					System.out.println((char) (karakter) + " ");
				} else {
					System.out.print((char) (karakter) + " ");
				}
			}
		} catch (InputMismatchException ex) {
			System.out.println("GRE�KA: Neispravan unos podataka!");

		}
	}

	// metoda za ispis 100 brojeva
	public static void ispisB() {
		System.out.println();
		try {
			int brojac = 0;
			int[] niz = new int[100];
			System.out.println("BROJEVI:");
			// prolazimo kroz niz i ipisujemo random brojeve u liniji po deset
			for (int i = 0; i <= niz.length - 1; i++) {
				niz[i] = (int) (Math.random() * 100);

				System.out.print(niz[i] + " ");
				brojac++;
				if (brojac % 10 == 0) {
					System.out.println();
				}
			}
		} catch (InputMismatchException ex) {
			System.out.println("GRE�KA: Neispravan unos podataka!");

		}
	}

	public static void main(String[] args) {
		ispisS();
		ispisB();

	}

}
