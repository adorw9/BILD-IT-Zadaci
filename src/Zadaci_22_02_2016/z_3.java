package Zadaci_22_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Sum series) Write a recursive method to compute the following series: m(i) =
 * 1 + 1 2 + 1 3 + c + 1 i Write a test program that displays m(i) for i = 1, 2,
 * . . ., 10.
 */
public class z_3 {
	// metoda za sumu
	public static double m(double a) {

		if (a == 1) {
			return 1;

		} else

			return 1 / a + m(a - 1);
	}

	public static void main(String[] args) {
		// poziv metode i ispis rezultata
		System.out.println("i    m(i)");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "    " + m(i));
		}

	}

}
