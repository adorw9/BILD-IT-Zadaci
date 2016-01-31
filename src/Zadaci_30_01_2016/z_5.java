package Zadaci_30_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji pita korisnika da unese cijeli broj te ispisuje
 * piramidu svih brojeva do tog broja. (Na primjer, ukoliko korisnik unese 7 vrh
 * piramide je broj 1, red ispod vrha piramide je 2 1 2, red ispod je 3 2 1 2 3,
 * red ispod 4 3 2 1 2 3 4 itd.)
 */
public class z_5 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			System.out.print("Unesite broj od 1 do 10: ");
			int lines = ulaz.nextInt();
			// red
			for (int row = 1; row <= lines; row++) {
				// kolona
				for (int column = 1; column <= lines - row; column++) {
					System.out.print("  ");
				}
				// lijeva strana brojeva
				for (int num = row; num >= 1; num--) {
					System.out.print((num >= 10) ? +num : " " + num);

				}
				// desna strana brojeva
				for (int num = 2; num <= row; num++) {
					System.out.print((num > 10) ? +num : " " + num);

				}

				System.out.println();
			}
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

}
