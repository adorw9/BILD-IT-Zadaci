package Zadaci_20_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji uèitava iznos investicije, godišnju interesnu stopu i
 * broj godina te vraæa buduæu vrijednost investicije koristeæi se sljedeæom
 * formulom: buducaVrijednostInvesticije = iznosInvesticije * (1 +
 * mjesecnaInteresnaStopa)^brojGodina*12. Na primjer, ukoliko uneste kao iznos
 * investicije 1000, 3.25 kao godišnju interesnu stopu i 1 kao broj godina
 * program vam vraæa 1032.98 kao buducu vrijednost investicije.
 */
public class z_1 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// unosimo podatke od korisnika
		try {
			System.out.print("Unesite iznos investicije:");
			double iznos = ulaz.nextDouble();
			System.out.print("Unesite godišnju interesnu stopu:");
			double godisnjaStopa = ulaz.nextDouble();
			System.out.print("Unesite broj godina");
			int godina = ulaz.nextInt();

			// izraèunavamo mjeseènu interesnu stopu
			double mjesecnaStopa = godisnjaStopa / 1200;
			// odredimo formulu za buducu vrijednost investicije
			double buducaInvesticija = iznos
					* ((double) Math.pow(1 + mjesecnaStopa, godina * 12));
			// dvije decimale
			buducaInvesticija = Math.round(buducaInvesticija * 100);
			buducaInvesticija = buducaInvesticija / 100;
			// ispis
			System.out.println(buducaInvesticija);

		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}

	}

}
