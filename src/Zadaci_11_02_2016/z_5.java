package Zadaci_11_02_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Combine two lists) Write a method that returns the union of two array lists
 * of integers using the following header: public static ArrayList<Integer>
 * union( ArrayList<Integer> list1, ArrayList<Integer> list2) For example, the
 * union of two array lists {2, 3, 1, 5} and {3, 4, 6} is {2, 3, 1, 5, 3, 4, 6}.
 * Write a test program that prompts the user to enter two lists, each with five
 * integers, and displays their union. The numbers are separated by exactly one
 * space in the output.
 */
public class z_5 {
	// metoda za spajanje dvije liste u jendu zajednièku
	public static ArrayList<Integer> union(ArrayList<Integer> list1,
			ArrayList<Integer> list2) {
		ArrayList<Integer> newList = new ArrayList<>(list1.size()
				+ list2.size());
		newList.addAll(list1);
		newList.addAll(list2);

		return newList;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {

			// kreiranje liste i dodavanje unosa listi
			ArrayList<Integer> lista1 = new ArrayList<Integer>();

			System.out.println("Unesite brojeve u listu1:");
			while (lista1.size() < 5) {
				int broj = ulaz.nextInt();
				lista1.add(broj);
			}
			ArrayList<Integer> lista2 = new ArrayList<Integer>();
			System.out.println("Unesite brojeve u listu2: ");
			while (lista2.size() < 5) {
				int broj = ulaz.nextInt();
				lista2.add(broj);
			}
			// ispis
			System.out.println("Lista union: " + union(lista1, lista2));
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();

		}

	}

}
