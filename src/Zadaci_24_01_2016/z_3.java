package Zadaci_24_01_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji ispisuje sve moguæe kombinacije za biranje dva broja u
 * rasponu od 1 do 7. Takoðer, program ispisuje broj svih moguæih kombinacija.
 * Dakle, program treba da ispiše sve moguæe parove brojeva u datom rasponu,
 * krenuvši sa 1 2, 1 3, 1 4, itd. Broj moguæih kombinacija je 21.
 */
public class z_3 {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		// pravimo matricu i ispisujemo moguce kombinacije
		int[][] matrix = new int[0][8];
		for (int i = 1; i < 8; i++) {
			for (int j = i; j < 8; j++) {
				if (i != j)
					System.out.println("" + i + " " + (j - 1));
			}
		}
	}
}
