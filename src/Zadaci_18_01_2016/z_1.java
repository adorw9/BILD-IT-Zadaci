package Zadaci_18_01_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji pita korisnika da unese neki cijeli broj te ispisuje
 * njegove najmanje faktore u rastuæem redosljedu. Na primjer, ukoliko korisnik
 * unese 120 program treba da ispiše 2, 2, 2, 3, 5. (2 * 2 * 2 * 3 * 5 = 120)
 */
public class z_1 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite cijeli broj");
		// pravimo listu i unosimo broj cijeli broj
		try {
			ArrayList<Integer> faktor = new ArrayList<>();
			int broj = ulaz.nextInt();

			// postavimo najmanji faktor i provjeravamo koji su sve faktori
			// uneseng
			// broja, dodamo u listu i stampamo rezultat
			for (int i = 2; i <= broj; i++) {
				if (broj % i == 0) {
					faktor.add(i);
					broj /= i;
					i--;
				}
			}
			System.out.println(faktor);
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}
}
