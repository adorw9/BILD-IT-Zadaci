package Zadaci_26_01_2016;

import java.util.Random;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Pretpostavimo da se registarska tablica za auto sastoji od tri uppercase
 * karaktera i 4 broja u sljedeæem formatu AAA-1234. Napisati program koji
 * nasumièno generiše tablicu.
 */
public class z_1 {

	public static void main(String[] args) {
		// random velika slova, koristimo ASCII
		Random r = new Random();
		char ch1 = (char) (r.nextInt(25) + 65);
		char ch2 = (char) (r.nextInt(25) + 65);
		char ch3 = (char) (r.nextInt(25) + 65);
		System.out.print(ch1 + "" + ch2 + "" + ch3 + "-");
		// pravimo niz i generisemo 4 nasumièna broja
		int[] niz = new int[4];
		for (int i = 0; i < niz.length; i++) {
			niz[i] = (int) (Math.random() * 10);
			System.out.print(niz[i]);
		}

	}

}
