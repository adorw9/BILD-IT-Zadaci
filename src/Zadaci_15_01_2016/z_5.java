package Zadaci_15_01_2016;

import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji uèitava niz brojeva, pronalazi najveæi broj te
 * ispisruje koliko se puta taj broj ponavlja. Pretpostavimo da se unos brojeva
 * završava sa nulom.
 */
public class z_5 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// pravimo niz

		int[] niz = new int[10];
		System.out.println("Unesite brojeve u niz");
		// upis brojeva u niz ,u sluèaju da korisnik ukuca 0 petlja se
		// zaustavlja i trazi koji je max i koliko se ponavlja
		for (int i = 0; i < niz.length; i++) {
			niz[i] = ulaz.nextInt();
			if (niz[i] == 0)
				break;

		}

		// tražimo maksimalni broj u nizu
		int max = 0;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] > max) {
				max = niz[i];
			}
		}
		// pomoæu brojaca ispitujemo koliko se puta max broj ponavlja
		int brojac = 0;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == max)
				brojac++;

		}
		// ispis
		System.out.println("Najveæi broj u nizu je " + max + ", ponavlja se "
				+ brojac + " puta");
		ulaz.close();
	}
}
