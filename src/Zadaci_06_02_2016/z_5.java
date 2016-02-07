package Zadaci_06_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Displaying the prime numbers
 */
public class z_5 {
	// metoda za proste brojeve
	public static boolean prime(int a) {

		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		// kreiramo objekat
		z_4 stack = new z_4();
		// brojevi do 120
		for (int i = 2; i < 120; i++) {
			if (prime(i)) {
				stack.lista.add(i);

			}
		}
		System.out.println("Prosti brojevi: " + stack.obrnuto());
	}

}
