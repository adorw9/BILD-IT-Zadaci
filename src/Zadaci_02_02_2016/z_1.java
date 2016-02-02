package Zadaci_02_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Count single digits) Write a program that generates 100 random integers
 * between 0 and 9 and displays the count for each number. (Hint: Use an array
 * of ten integers, say counts, to store the counts for the number of 0s, 1s, .
 * . . , 9s.)
 */
public class z_1 {

	public static void main(String[] args) {

		// pravimo niz
		int[] niz = new int[10];
		// generišemo nasumièan broj
		for (int i = 0; i < 100; i++) {
			niz[(int) (Math.random() * 10)]++;
		}
		// ispisujemo rezultat
		for (int i = 0; i < 10; i++) {
			System.out.println("Broj " + i + " se ponavlja " + niz[i]
					+ " puta.");

		}

	}
}
