package Zadaci_15_02_2016;

import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (NumberFormatException) Write the bin2Dec(String binaryString) method to
 * convert a binary string into a decimal number. Implement the bin2Dec method
 * to throw a NumberFormatException if the string is not a binary string.
 */
public class z_1 {

	// metoda za bin2dec
	public static void bin2Dec(String binaryString) {
		double broj = 0;
		// konvertovanje binarnog Stringa u decimalni broj
		broj = Double.parseDouble(binaryString);

		System.out.println(broj);
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			System.out.println("Unesite broj: ");
			String str = ulaz.next();
			// pozivamo metodu
			bin2Dec(str);
		} catch (NumberFormatException ex) {
			System.out.println("Pogrešan format!");
			main(args);
			ulaz.close();
		}

	}

}
