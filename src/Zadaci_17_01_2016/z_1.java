package Zadaci_17_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Napisati metodu koja prima 2 argumenta: po�etni broj i krajnji broj te printa
 * sve proste brojeve u zadanom rangu. BONUS: metoda mo�e primati i tre�i
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
		System.out.println("Unesite po�etni broj");
		try {
			int x = ulaz.nextInt();
			System.out.println("Unesite krajnji broj");
			int y = ulaz.nextInt();
			System.out.println("Koliko �elite brojeva u liniji");
			int z = ulaz.nextInt();
			prosti(x, y, z);
			ulaz.close();
		} catch (InputMismatchException ex) {
			System.out.println("GRE�KA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

}
