package Zadaci_27_01_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Palindrome prime je prosti broj koji je takoðer i palindrom. Na primjer, 131
 * je palindrome prime, kao i brojevi 313 i 757. Napisati program koji ispisuje
 * prvih 100 palindrome prime brojeva, 10 brojeva po liniji.
 */
public class z_4 {
	// metoda za reverse
	public static int reverse(int broj) {

		int obrnuto = 0;
		while (broj != 0) {
			obrnuto = obrnuto * 10 + broj % 10;
			broj = broj / 10;
		}
		return obrnuto;
	}

	// metoda za prost broj
	public static boolean prosti(int a) {
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

	// metoda za palindrom
	public static boolean palindrom(int broj) {
		// pozivamo metodu reverse i provjeravamo da li je broj palindrom
		return broj == reverse(broj);
	}

	public static void main(String[] args) {
		int brojac = 0;
		int broj = 1;

		// pozivanje metoda i ispis
		System.out.println("Palindrom prime brojevi:");
		while (brojac < 100) {
			if (prosti(broj) && prosti(reverse(broj)) && palindrom(broj)) {
				brojac++;
				if (brojac % 10 == 0) {
					System.out.println(broj);
				} else {
					System.out.print(broj + " ");
				}
			}
			broj++;
		}
	}

}