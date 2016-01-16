package Zadaci_15_01_2016;

import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Napisati sljede�u metodu koja vra�a najve�u vrijednosti u ArrayListu
 * Integera. Metoda vra�a null ukoliko je lista null iil ukoliko lista sadr�i 0
 * elemenata. public static Integer max(ArrayList<Integer> list)
 */
public class z_1 {
	// metoda za pronalazenje max
	public static Integer max(ArrayList<Integer> list) {
		// da li je lista prazna
		if (list.isEmpty()) {
			return null;
		} else {
			// ukoliko lista nije prazna vra�amo najve�i �lan
			int max = (int) list.get(0);
			for (int i = 1; i < list.size(); i++) {
				if ((int) list.get(i) > max) {
					max = (int) list.get(i);
				}

			}
			return max;
		}

	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// kreiranje liste
		ArrayList<Integer> a = new ArrayList<Integer>();

		System.out.println("Unesite brojeve:");
		try {
			// po�etak petlje
			while (true) {
				int broj = ulaz.nextInt();
				// u slu�aju da korisnik unese 0 petlja se zaustavlja u
				// suprotnom dodaje broj u listu
				if (broj == 0) {
					// ispis max
					System.out.println(max(a));
				} else
					a.add(broj);

			}
			// ukoliko korisnik unese znak,slovo prijavljuje se gre�ka
		} catch (InputMismatchException ex) {
			System.out.println("GRE�KA: Neispravan unos podataka!");
			ulaz.close();

		}
	}
}
