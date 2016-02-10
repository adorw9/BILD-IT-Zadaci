package Zadaci_10_02_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Maximum element in ArrayList) Write the following method that returns the
 * maximum value in an ArrayList of integers. The method returns null if the
 * list is null or the list size is 0. public static Integer
 * max(ArrayList<Integer> list)
 */
public class z_3 {
	// metoda za pronalazenje max
	public static Integer max(ArrayList<Integer> list) {
		// da li je lista prazna
		if (list.isEmpty()) {
			return null;
		} else {
			// ukoliko lista nije prazna vraæamo najveæi èlan
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
			// poèetak petlje
			while (true) {
				int broj = ulaz.nextInt();
				// u sluèaju da korisnik unese 0 petlja se zaustavlja u
				// suprotnom dodaje broj u listu
				if (broj == 0) {
					// ispis max
					System.out.println(max(a));
				} else
					a.add(broj);

			}
			// ukoliko korisnik unese znak,slovo prijavljuje se greška
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();

		}

	}

}
