package Zadaci_17_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati metodu koja prima 2 argumenta: poèetni broj i krajnji broj te printa
 * sve proste brojeve u zadanom rangu. BONUS: metoda može primati i treæi
 * argument, broj brojeva za isprintati po liniji.
 */
public class z_1 {

	public static void prosti(int a, int b, int c) {
		// brojac za linije
		int brojac = 1;
		// petlja za brojeve od a do b
		for (int i = a; i <= b; i++) {
			boolean prost = true;
			// ispitujemo koji su brojevi prosti
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prost = false;

				}
			}
			// ispis
			if (prost) {

				if (brojac == c) {
					System.out.println(i + " ");
					brojac = 1;
				} else {
					System.out.print(i + " ");
					brojac++;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite poèetni broj");
		try {
			int x = ulaz.nextInt();
			System.out.println("Unesite krajnji broj");
			int y = ulaz.nextInt();
			System.out.println("Koliko želite brojeva u liniji");
			int z = ulaz.nextInt();
			prosti(x, y, z);
			ulaz.close();
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

}
