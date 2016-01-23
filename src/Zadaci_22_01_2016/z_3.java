package Zadaci_22_01_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napišite program koji ispisuje sve brojeve, od 100 do 1000, 10 brojeva po
 * liniji, koji su djeljivi i sa 5 i sa 6. Razmak izmeðu brojeva treba biti
 * taèno jedan space.
 */
public class z_3 {
	public static void main(String[] args) {
		int brojac = 1;
		// raspon brojeva od 100 do 1000
		for (int i = 100; i <= 1000; i++) {
			// brojevi djeljivi sa 5 i 6
			if ((i % 5 == 0) && (i % 6 == 0)) {
				// ispis brojeva 10 po liniji
				if (brojac == 10) {
					System.out.println(i + " ");
					brojac = 1;
				} else {
					System.out.print(i + " ");
					brojac++;
				}

			}
		}

	}
}
