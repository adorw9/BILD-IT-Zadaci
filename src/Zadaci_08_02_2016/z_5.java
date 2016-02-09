package Zadaci_08_02_2016;

import java.math.BigInteger;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Divisible by 5 or 6) Find the first ten numbers greater than Long.MAX_VALUE
 * that are divisible by 5 or 6.
 */
public class z_5 {

	public static void main(String[] args) {
		// objekat
		BigInteger broj = BigInteger.valueOf(Long.MAX_VALUE);
		// za broj 5
		BigInteger broj5 = new BigInteger("5");
		// za broj 6
		BigInteger broj6 = new BigInteger("6");

		int brojac = 0;
		while (brojac < 10) {
			// provjeravamo da li je broj djelljiv sa 5 ili 6
			BigInteger ostatak5 = broj.remainder(broj5);
			BigInteger ostatak6 = broj.remainder(broj6);

			if (ostatak5 == BigInteger.ZERO || ostatak6 == BigInteger.ZERO) {
				System.out.println(broj);
				brojac++;
			}
			broj = broj.add(BigInteger.ONE);
		}
	}

}
