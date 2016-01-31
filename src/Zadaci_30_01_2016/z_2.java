package Zadaci_30_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Napisati program koji pita korisnika da unese neki string te mu ispisuje
 * du�inu tog stringa kao i prvo slovo stringa.
 */
public class z_2 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			// unos od korisnika
			System.out.print("Unesite string: ");
			String str = ulaz.nextLine();
			// zanemarujemo space
			str = str.replaceAll(" ", "");

			// ispis du�ine stringa
			int brojac = 0;
			for (int i = 0; i < str.length(); i++) {
				brojac++;
			}
			System.out.println("Du�ina stringa: " + brojac);
			// ispisujemo prvo slovo stringa
			char[] ch = str.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				if (i == 0) {
					System.out.print("Prvo slovo stringa: " + ch[i]);
				}
			}
		} catch (InputMismatchException ex) {
			System.out.println("GRE�KA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

}
