package Zadaci_26_01_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji uèitava cijele brojeve u rasponu od 1 do 100 te broji i
 * ispisuje koliko je koji broj puta unijet. Pretpostavimo da nula prekida unos
 * brojeva. Ukoliko unesemo sljedeæi niz brojeva 2 5 6 23 42 58 2 6 0 program
 * nam ispisuje da se broj 2 ponavlja 2 puta, broj 5 jednom, broj 6 2 puta, broj
 * 23 jednom, itd.
 */
public class z_5 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			// pravimo arraylist
			ArrayList<Integer> list = new ArrayList<>();
			System.out.println("Unesite brojeve od 1 do 100:");
			int a = ulaz.nextInt();
			// ako je broj veci od sto ili manji od 0
			if (a > 100 || a < 0) {
				System.out.println("BROJEVI OD 1 DO 100!");
				a = ulaz.nextInt();
			}
			// 0 zaustavlja unos
			while (a != 0) {
				list.add(a);
				a = ulaz.nextInt();
				if (a > 100 || a < 0) {
					System.out.println("BROJEVI OD 1 DO 100!");
					a = ulaz.nextInt();
				}
			}
			// provjeravamo koliko se brojevi ponavaljaju
			int brojac = 0;
			for (int i = 0; i < list.size(); i++) {
				brojac = Collections.frequency(list, i);
				if (brojac > 0) {
					System.out.println("Broj " + i + " ponavlja se " + brojac
							+ " puta.");
				}
			}
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

}
