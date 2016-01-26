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
 * Napisati program koji pita korisnika da unese 3 cijela broja te mu ispiše ta
 * ista tri broja u rastuæem redosljedu. Bonus: Napisati metodu koja prima tri
 * cijela broja kao argumente te vraæa brojeve u rastuæem redosljedu.
 */
public class z_4 {
	// metoda za sortiranje brojeva
	public static ArrayList<Integer> rastuci(int a, int b, int c) {
		// pravimo arraylist i dodajemo korisnikov unos
		ArrayList<Integer> list = new ArrayList<>();

		list.add(a);
		list.add(b);
		list.add(c);
		// sortiramo brojeve i vraæamo rezultat
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
			System.out.print("Unesite treæi broj:");
			int c = ulaz.nextInt();
			// pozivanje metode i ispis
			System.out.println(rastuci(a, b, c));

		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}
}
