package Zadaci_08_02_2016;

import java.math.BigInteger;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Large prime numbers) Write a program that finds five prime numbers larger
 * than Long.MAX_VALUE.
 */
public class z_3 {

	public static void main(String[] args) {
		// kreiramo objekat
		BigInteger broj = BigInteger.valueOf(Long.MAX_VALUE);

		// prosti brojevi
		int brojac = 0;
		while (brojac < 5) {
			if (broj.isProbablePrime(1)) {
				// ispis rezultata
				System.out.println(broj);
				brojac++;
			}
			broj = broj.add(BigInteger.ONE);
		}
	}

}
