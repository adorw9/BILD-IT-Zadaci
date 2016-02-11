package Zadaci_11_02_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Remove duplicates) Write a method that removes the duplicate elements from
 * an array list of integers using the following header: public static void
 * removeDuplicate(ArrayList<Integer> list) Write a test program that prompts
 * the user to enter 10 integers to a list and displays the distinct integers
 * separated by exactly one space.
 */
public class z_4 {
	// metoda za duplikate
	public static void removeDuplicate(ArrayList<Integer> list) {
		Set<Integer> duplikati = new LinkedHashSet<Integer>(list);

		System.out.println("Lista bez duplikata: " + duplikati);
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {

			// kreiranje liste i dodavanje unosa listi
			ArrayList<Integer> lista = new ArrayList<Integer>();
			System.out.println("Unesite brojeve:");
			while (lista.size() < 10) {
				int broj = ulaz.nextInt();
				lista.add(broj);

			}
			// ispis
			System.out.println("Lista: " + lista);
			removeDuplicate(lista);
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();

		}

	}

}
