package Zadaci_16_01_206;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji ispisuje sve prestupne godine, 10 po liniji, od godine
 * 101 do 2100, odvojene jednim spaceom. Takoðer ispisati i ukupan broj
 * prijestupnih godina u ovom vremenskom periodu.
 */
public class z_1 {

	public static void main(String[] args) {
		// brojac za ispis godina po 10 u liniji
		int brojac1 = 0;
		int brojac2 = 1;
		// petlja za period od 101 do 2100
		for (int godina = 101; godina <= 2100; godina++) {
			// provjeravamo da li je godina prestupna
			if (((godina % 4 == 0) && (godina % 100 != 0))
					|| (godina % 400 == 0)) {
				// ispisujemo godini u liniji po deset
				if (brojac2 == 10) {
					System.out.println(godina + " ");
					brojac2 = 1;
				} else {
					System.out.print(godina + " ");
					brojac2++;
				}
				brojac1++;
			}

		}
		// ispis za ukupno godina u zadanom vremenskom periodu
		System.out.println("\nUkupno prestupnih godina: " + brojac1);
	}
}
