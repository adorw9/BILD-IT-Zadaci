package Zadaci_27_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napišite metodu sa sljedeæim headerom koja vraæa naopako ispisan broj koji
 * joj je proslijeðen kao argument: public static void reverse(int number). Na
 * primjer, reverse(3456) treba da vrati 6543. Napisati program koji pita
 * korisnika da unese neki cijeli broj te mu vrati isti ispisan naopako.
 */
public class z_2 {
	// metoda za reverse
	public static void reverse(int broj) {
		// ako je broj manji od deset ispis tog broja
		if (broj < 10) {
			System.out.println(broj);

			return;
		} else {
			// obrnut broj
			System.out.print(broj % 10);

			reverse(broj / 10);
		}
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			System.out.print("Unesite broj: ");
			int broj = ulaz.nextInt();
			// poziv metode i ispis
			System.out.print("Obrnuto: ");
			reverse(broj);
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}

	}

}
