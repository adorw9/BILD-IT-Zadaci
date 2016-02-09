package Zadaci_08_02_2016;

import java.math.BigDecimal;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Divisible by 2 or 3) Find the first ten numbers with 50 decimal digits that
 * are divisible by 2 or 3.
 */
public class z_1 {

	public static void main(String[] args) {
		String stringBroj = "" + 1;
		// kreiramo 50 decimalni broj
		for (int i = 0; i < 50; i++) {

			stringBroj += "0";
		}
		// kreiramo objekat
		BigDecimal broj = new BigDecimal(stringBroj);
		int brojac = 0;
		while (brojac < 10) {

			// provjeravamo da li je broj djeljiv sa 2 ili 3
			BigDecimal decimalni1 = broj.remainder(new BigDecimal(2));
			BigDecimal decimalni2 = broj.remainder(new BigDecimal(3));

			if (decimalni1.equals(BigDecimal.ZERO)
					|| decimalni2.equals(BigDecimal.ZERO)) {
				brojac++;
				System.out.println(brojac + ": " + broj);
			}
			// povecava broj za 1
			broj = broj.add(BigDecimal.ONE);
		}

	}
}
