package Zadaci_18_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * ISBN-10 (International Standard Book Number) se sadr�i od 10 brojeva: d1 d2
 * d3 d4 d5 d6 d7 d8 d9 d10. Posljednji broj, d10, slu�i kao checksum i njega
 * izra�unavamo iz prvih devet brojeva koriste�i se sljede�om formulom: (d1 * 1
 * + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) %
 * 11. Ukoliko je checksum 10, zadnji broj ozna�avamo sa X u skladu sa ISBN-10
 * konvencijom. Napisati program koji pita korisnika da unese prvih 9 brojeva te
 * ispi�e desetocifreni ISBN-10 broj. (Primjer: ukoliko unesemo, kao prvih 9
 * brojeva, 013601267 program nam ispisuje 0136012671 kao ISBN-10 broj. Ukoliko
 * unesemo 013031997 kao prvih 9 brojeva, program nam ispisuje 013031997X kao
 * ISBN-10 broj)
 */
public class z_2 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		int d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;
		// unosimo od d1 do d9
		try {
			System.out.println("Unesite brojeve od d1 do d9 ");

			d1 = ulaz.nextInt();
			d2 = ulaz.nextInt();
			d3 = ulaz.nextInt();
			d4 = ulaz.nextInt();
			d5 = ulaz.nextInt();
			d6 = ulaz.nextInt();
			d7 = ulaz.nextInt();
			d8 = ulaz.nextInt();
			d9 = ulaz.nextInt();

			// formula za ira�unavanje d10
			d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7
					+ d8 * 8 + d9 * 9) % 11;
			// zadnji broj ozna�avamo sa X ukoliko je checksum 10, u suprotnom
			// dodajemo d10
			if (d10 == 10) {
				System.out.print("ISBN-10: " + d1 + d2 + d3 + d4 + d5 + d6 + d7
						+ d8 + d9 + "X");
			} else {
				// ako checksum nije 10 onda ispisujemo cifre d1-d10 kao ISBN10
				System.out.print("ISBN-10: " + d1 + d2 + d3 + d4 + d5 + d6 + d7
						+ d8 + d9 + d10);
			}
		} catch (InputMismatchException ex) {
			System.out.println("GRE�KA: Neispravan unos podataka!");
			ulaz.close();
		}
	}
}
