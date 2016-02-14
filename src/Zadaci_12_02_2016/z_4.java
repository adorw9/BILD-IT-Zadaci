package Zadaci_12_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (ArrayIndexOutOfBoundsException) Write a program that meets the following
 * requirements: Creates an array with 100 randomly chosen integers. Prompts the
 * user to enter the index of the array, then displays the corresponding element
 * value. If the specified index is out of bounds, display the message Out of
 * Bounds.
 */
public class z_4 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			System.out.print("Unesite index niza: ");
			int index = ulaz.nextInt();
			// random niz
			int[] niz = new int[100];
			for (int i = 1; i < niz.length; i++) {
				niz[i] = (int) (Math.random() * 100);
			}
			// ispis broj u zadanom indexu
			System.out.println(niz[index]);
			// izvan indeksa greška
		} catch (IndexOutOfBoundsException e) {
			System.out.println("OUT OF BOUNDS!");
			main(args);
			// neispravan unos podataka greška
		} catch (InputMismatchException ex) {
			System.out.println("Neispravan unos podataka!");
			main(args);
			ulaz.close();
		}
	}
}
