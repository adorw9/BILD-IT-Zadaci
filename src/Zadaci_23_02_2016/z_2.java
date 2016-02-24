package Zadaci_23_02_2016;

import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Print the characters in a string reversely) Write a recursive method that
 * displays a string reversely on the console using the following header: public
 * static void reverseDisplay(String value) For example, reverseDisplay("abcd")
 * displays dcba. Write a test program that prompts the user to enter a string
 * and displays its reversal.
 */
public class z_2 {

	// metoa za obrnuto
	public static void reverseDisplay(String value) {

		if (value.length() == 0) {
			return;
		}
		System.out.print(value.substring(value.length() - 1));

		reverseDisplay(value.substring(0, value.length() - 1));
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String str = ulaz.nextLine();

		reverseDisplay(str);
		ulaz.close();
	}

}
