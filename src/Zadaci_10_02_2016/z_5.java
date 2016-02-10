package Zadaci_10_02_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Shuffle ArrayList) Write the following method that shuffles the elements in
 * an ArrayList of integers. public static void shuffle(ArrayList<Integer> list)
 */
public class z_5 {
	// metoda za shuffle liste
	public static void shuffle(ArrayList<Integer> list) {

		for (int i = 1; i < list.size(); i++)

			Collections.shuffle(list);
		System.out.println(list);
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
					// ispis shuffle
					shuffle(a);
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
