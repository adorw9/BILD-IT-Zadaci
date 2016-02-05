package Zadaci_04_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
public class z_3Test {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// kreiramo objekat
		z_3 stopwatch = new z_3();
		try {
			int start = -1;
			int stop = -1;
			// unososm 1 pokreæemo štopericu
			while (start != 1) {
				System.out.print("Pritisnite 1 za start štoperice: ");
				start = ulaz.nextInt();
				stopwatch.start();
			}
			// unosom 0 zaustavljamo štopericu
			while (stop != 0) {
				System.out.print("Pritisnite 0 za stop štoperice: ");
				stop = ulaz.nextInt();
				stopwatch.stop();
			}
			// ispis vremena od start do stop
			System.out.println("Proteklo vrijeme: "
					+ stopwatch.getElapsedTime());
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}
}
