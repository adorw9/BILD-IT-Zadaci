package Zadaci_24_01_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. Na primjer,
 * brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 su takoðer twin primes.
 * Napisati program koji ispisuje sve twin prime brojeve manje od 10000, 10
 * parova po liniji.
 */
public class z_2 {
	// metoda za prime broj
	public static boolean prime(int a) {
		if (a == 1) {
			return false;
		}
		// provjeravamo da li broj prost
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	// metoda za ispis twinprimes
	public static void twinPrimes(int pocetni, int krajnji) {
		int brojac = 1;
		// provjeravamo da li dva prime broja twin
		for (int i = pocetni; i <= krajnji - 2; i++) {
			int broj1 = i;
			int broj2 = i + 2;
			// pozivamo metodu prime i ispisujemo rezultat
			if (prime(broj1) && prime(broj2)) {
				// stampamo 10 parova po liniji
				if (brojac == 10) {
					System.out.println("(" + (broj1 + " " + broj2) + ")" + " ");
					brojac = 1;
				} else {
					System.out.print("(" + (broj1 + " " + broj2) + ")" + " ");
					brojac++;
				}
			}
		}
	}

	public static void main(String[] args) {
		twinPrimes(1, 10000);
	}

}
