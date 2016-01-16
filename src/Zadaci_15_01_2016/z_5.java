package Zadaci_15_01_2016;

import java.util.Scanner;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Napisati program koji u�itava niz brojeva, pronalazi najve�i broj te
 * ispisruje koliko se puta taj broj ponavlja. Pretpostavimo da se unos brojeva
 * zavr�ava sa nulom.
 */
public class z_5 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// pravimo niz

		int[] niz = new int[10];
		System.out.println("Unesite brojeve u niz");
		// upis brojeva u niz ,u slu�aju da korisnik ukuca 0 petlja se
		// zaustavlja i trazi koji je max i koliko se ponavlja
		for (int i = 0; i < niz.length; i++) {
			niz[i] = ulaz.nextInt();
			if (niz[i] == 0)
				break;

		}

		// tra�imo maksimalni broj u nizu
		int max = 0;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] > max) {
				max = niz[i];
			}
		}
		// pomo�u brojaca ispitujemo koliko se puta max broj ponavlja
		int brojac = 0;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == max)
				brojac++;

		}
		// ispis
		System.out.println("Najve�i broj u nizu je " + max + ", ponavlja se "
				+ brojac + " puta");
		ulaz.close();
	}
}
