package Zadaci_12_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Area of a convex polygon) A polygon is convex if it contains any line
 * segments that connects two points of the polygon. Write a program that
 * prompts the user to enter the number of points in a convex polygon, then
 * enter the points clockwise, and display the area of the polygon.
 */
public class z_1 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// unos korisnik
		try {
			System.out.println("Unesite points: ");
			int points = ulaz.nextInt();

			double[] x = new double[points];
			double[] y = new double[points];

			for (int i = 0; i < x.length; i++) {
				System.out.println("Unesite kordinatu x: ");
				x[i] = ulaz.nextDouble();
				System.out.println("Unesite kordinatu y: ");
				y[i] = ulaz.nextDouble();
			}

			// izraèunavamo površinu
			double povrsina = 0;
			for (int i = 0; i < points - 1; i++) {
				double a = (x[i] * (y[i + 1]));
				double b = (y[i] * (x[i + 1]));
				povrsina = povrsina + (a - b);
			}
			povrsina = Math.abs(povrsina / 2);

			System.out.println("Površina: " + povrsina);
		} catch (InputMismatchException ex) {
			System.out.println("Neispravan unos podataka!");
			ulaz.close();
		}
	}

}
