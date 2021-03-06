package Zadaci_11_02_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * (Sort ArrayList) Write the following method that sorts an ArrayList of
 * numbers: public static void sort(ArrayList<Integer> list) Write a test
 * program that prompts the user to enter 5 numbers, stores them in an array
 * list, and displays them in increasing order
 */
public class z_2 {
	// metoa za sortiranje liste
	public static void sort(ArrayList<Integer> list) {
		for (int i = 1; i < list.size(); i++)

			Collections.sort(list);
		System.out.println("Sortirana lista: " + list);
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {

			// kreiranje liste i dodavanje unosa listi
			ArrayList<Integer> lista = new ArrayList<Integer>();
			System.out.println("Unesite brojeve:");
			while (lista.size() < 5) {
				int broj = ulaz.nextInt();
				lista.add(broj);

			}
			sort(lista);
		} catch (InputMismatchException ex) {
			System.out.println("GRE�KA: Neispravan unos podataka!");
			ulaz.close();

		}
	}

}
