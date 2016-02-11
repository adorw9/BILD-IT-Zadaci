package Zadaci_11_02_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Sum ArrayList) Write the following method that returns the sum of all
 * numbers in an ArrayList: public static double sum(ArrayList<Double> list)
 * Write a test program that prompts the user to enter 5 numbers, stores them in
 * an array list, and displays their sum.
 */
public class z_3 {
	// metoda za sumu brojeva u listi
	public static double sum(ArrayList<Double> list) {
		double suma = 0;
		for (int i = 0; i < list.size(); i++) {
			suma += list.get(i);
		}
		return suma;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {

			// kreiranje liste i dodavanje unosa listi
			ArrayList<Double> lista = new ArrayList<Double>();
			System.out.println("Unesite brojeve:");
			while (lista.size() < 5) {
				double broj = ulaz.nextDouble();
				lista.add(broj);

			}
			// ispis
			System.out.println("Suma brojeva u listi iznosi: " + sum(lista));
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();

		}

	}

}
