package Zadaci_25_01_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji ispisuje sve proste brojeve od 2 do 1000, ukljuæujuæi i
 * 2 i 1000. Program treba da ispiše 8 brojeva po liniji te razmak izmeðu
 * brojeva treba da bude jedan space.
 */
public class z_2 {

	public static void main(String[] args) {
		int brojac = 1;
		// raspon brojeva od 2 do 1000
		for (int i = 2; i <= 1000; i++) {
			boolean prost = true;
			// ispitujemo koji su brojevi prosti
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prost = false;
				}
			}
			// ispis
			if (prost) {
				// ispis prostih brojeva 8 po liniji
				if (brojac == 8) {
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
