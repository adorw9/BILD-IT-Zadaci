package Zadaci_19_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji prima 10 cijelih brojeva te ih ispisuje u obrnutom
 * redosljedu.
 */
public class z_4 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite brojeve u niz:");
		try {
			//pravimo niz i unosimo brojeve
			int[] niz = new int[10];
			for (int i = 0; i < niz.length; i++) {
				niz[i] = ulaz.nextInt();

			}
			//ispisujemo brojeve obrnutim redoslijedom
			for (int i = niz.length - 1; i >= 0; i--) {
				System.out.print(niz[i] + " ");
			}
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

}
