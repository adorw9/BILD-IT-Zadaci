package Zadaci_26_01_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati metodu sa sljedeæim headerom: public static int isPrime(int n) koja
 * provjerava da li je broj prost/prime. Napsati test program koji poziva ovu
 * metodu i ispisuje sve proste brojeve u rasponu od 0 do 100000.
 */
public class z_3 {
	// metoda koja provjerava da li je broj prost
	public static int isPrime(int n) {
		int i = 0;
		boolean prost = true;
		// ako je djeljiv sa jedan i sa samim sobom broj je prost
		for (i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				prost = false;
			}
		}
		// vraæa rezultat ako je tacno ako ne vrati 0
		if (prost) {
			return i;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// ispis prostih brojeva
		for (int i = 2; i <= 100000; i++) {
			if (isPrime(i) > 0) {

				System.out.println(i);
			}
		}

	}

}
