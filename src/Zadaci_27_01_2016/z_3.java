package Zadaci_27_01_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Emirp brojevi (prime unazad) je nepalindromski prosti broj koji je prosti
 * broj i kada ispišemo naopako. Na primjer, broj 17 i broj 71 su prosti brojevi
 * tako da su brojevi i 17 i 71 emirp brojevi. Napisati program koji ispisuje
 * prvih 100 emirp brojeva, 10 brojeva po liniji.
 */
public class z_3 {
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

	// metoda za emirp
	public static boolean emirp(int number) {
		// ako je broj = obrnuto vrati da je emirp
		if (number == reverse(number)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int brojac = 0;
		int broj = 0;

		// pozivanje metoda i ispis
		System.out.println("Emirp brojevi:");
		while (brojac < 100) {
			if (prosti(broj) && prosti(reverse(broj)) && !emirp(broj)) {
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
