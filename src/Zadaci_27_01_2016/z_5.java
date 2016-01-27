package Zadaci_27_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Pretpostavimo da kupujemo rižu ili neki drugi proizvod u dva razlièita
 * pakovanja. Želimo napisati program koji uporeðuje cijene ta dva pakovanja.
 * Program pita korisnika da unese težinu i cijenu oba pakovanja te ispisuje
 * koje pakovanje ima bolju cijenu.
 */
public class z_5 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			// unosimo težinu i cijenu za prvi prozivod
			System.out.print("Unesite težinu zelenih jabuka: ");
			double tezina1 = ulaz.nextDouble();
			System.out.print("Unesite cijenu zelenih jabuka: ");
			double cijena1 = ulaz.nextDouble();

			// unosimo težinu i cjenu za drugi proizvod
			System.out.print("Unesite težinu crvenih jabuka: ");
			double tezina2 = ulaz.nextDouble();
			System.out.print("Unesite cijenu crvenih jabuka: ");
			double cijena2 = ulaz.nextDouble();

			double ukupnaCijena1 = cijena1 / tezina1;
			double ukupnaCijena2 = cijena2 / tezina2;
			System.out.println("Cijena kilograma zelenih jabuka iznosi: "
					+ ukupnaCijena1);
			System.out.println("Cijena kilograma crvenih jabuka iznosi: "
					+ ukupnaCijena2);
			if ((ukupnaCijena1) < (ukupnaCijena2)) {
				System.out.println();
				System.out.println("Zelene jabuke su jeftinije!");
			} else if ((ukupnaCijena1) > (ukupnaCijena2)) {
				System.out.println();
				System.out.println("Crvene jabuke su jeftinije!");
			} else {
				System.out.println();
				System.out.println("Cijene jabuka su iste.");
			}
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}
}
