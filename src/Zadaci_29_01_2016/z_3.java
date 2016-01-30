package Zadaci_29_01_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji sabira sljedeæu seriju 1/3 + 3/5 + 5/7 + 7/9 + 9/11 +
 * 11/13 ..... + 95/97 + 97/99.
 */
public class z_3 {

	public static void main(String[] args) {

		double suma = 0.0;
		// sabiremo brojeve 1/3+3/5.....
		for (double i = 1; i <= 97; i += 2) {
			suma += i / (i + 2);
			suma = Math.round(suma * 100);
			suma = suma / 100;
		}
		// ispis
		System.out.println("Suma iznosi: " + suma);
	}

}
