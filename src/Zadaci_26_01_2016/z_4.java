package Zadaci_26_01_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Napisati program koji pita korisnika da unese 3 cijela broja te mu ispi�e ta
 * ista tri broja u rastu�em redosljedu. Bonus: Napisati metodu koja prima tri
 * cijela broja kao argumente te vra�a brojeve u rastu�em redosljedu.
 */
public class z_4 {
	// metoda za sortiranje brojeva
	public static ArrayList<Integer> rastuci(int a, int b, int c) {
		// pravimo arraylist i dodajemo korisnikov unos
		ArrayList<Integer> list = new ArrayList<>();

		list.add(a);
		list.add(b);
		list.add(c);
		// sortiramo brojeve i vra�amo rezultat
		Collections.sort(list);

		return list;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			// unos od korisnika
			System.out.print("Unesite prvi broj:");
			int a = ulaz.nextInt();
			System.out.print("Unesite drugi broj:");
			int b = ulaz.nextInt();
			System.out.print("Unesite tre�i broj:");
			int c = ulaz.nextInt();
			// pozivanje metode i ispis
			System.out.println(rastuci(a, b, c));

		} catch (InputMismatchException ex) {
			System.out.println("GRE�KA: Neispravan unos podataka!");
			ulaz.close();
		}
	}
}
