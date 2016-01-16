package Zadaci_15_01_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napišite program koji generiše 100 nasumiènih cijelih brojeva izmeðu 0 i 9 te
 * ispisuje koliko se puta koji broj ponovio.
 */
public class z_4 {

	public static void main(String[] args) {
		// pravimo niz
		int[] niz = new int[10];
		// prolazimo kroz petlju i i ispitujemo koliko se brojevi ponavljaju
		for (int i = 0; i <= 100; i++) {
			niz[(int) (Math.random() * 10)]++;
		}
		// ispis rezultata
		for (int i = 0; i < 10; i++) {
			System.out.println("Broj " + i + " se ponavlja " + niz[i]
					+ " puta.");

		}

	}

}
