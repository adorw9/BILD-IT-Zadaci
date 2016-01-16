package Zadaci_15_01_2016;

import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Pretpostavimo da su slova A, E, I, O i U samoglasnici. Napisati program koji
 * pita korisnika da unese string te mu ispište broj samoglasnika i suglasnika u
 * datom stringu.
 */
public class z_2 {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);

		String string1;
		System.out.println("Ukucaj rijec:");

		string1 = ulaz.nextLine();
		string1 = string1.toLowerCase();

		int samoglasnici = 0;
		int suglasnici = 0;
		int praznine = 0;
		for (int i = 0; i < string1.length(); i++) {

			char ch = string1.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				samoglasnici++;
			} else if (ch == ' ') {
				praznine++;
			} else {
				suglasnici++;

			}
		}

		System.out.println("Suglasnici: " + samoglasnici);
		System.out.println("Samoglasnici " + suglasnici);
		System.out.println("Praznine " + praznine);

		ulaz.close();

	}
}