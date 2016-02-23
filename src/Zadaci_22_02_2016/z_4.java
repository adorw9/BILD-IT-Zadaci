package Zadaci_22_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Sum series) Write a recursive method to compute the following series: m(i) =
 * 1 3 + 2 5 + 3 7 + 4 9 + 5 11 + 6 13 + c + i 2i + 1 Write a test program that
 * displays m(i) for i = 1, 2, . . ., 10.
 */
public class z_4 {

	// metoda za sumu
	public static double m(double a) {

		if (a == 1) {
			return a / 3;

		} else

			return 1 / ((2 * a) + 1) + m(a - 1);
	}

	public static void main(String[] args) {
		// poziv metode i ispis rezultata
		System.out.println("i    m(i)");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "    " + m(i));
		}
	}

}
