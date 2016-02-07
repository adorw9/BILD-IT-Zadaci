package Zadaci_06_02_2016;

import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
public class z_2Test {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);

		System.out.print("Unesite prvi broj: ");
		int a = ulaz.nextInt();
		System.out.print("Unesite drugi broj: ");
		int b = ulaz.nextInt();
		// prvi objekat
		z_2 obj1 = new z_2(a);
		System.out.println("Broj " + a + " je paran: " + obj1.isEven());
		System.out.println("Broj " + a + " je neparan: " + obj1.isOdd());
		System.out.println("Broj " + a + " je prost: " + obj1.isPrime());

		System.out.println("Broj " + a + " i " + b + " su jednaki: "
				+ obj1.equals(b));

		// drugi objekat
		z_2 obj2 = new z_2(a);
		System.out.println("Broj " + b + " je paran: "
				+ z_2.isEven(obj2.getValue()));
		System.out.println("Broj " + b + " je neparan: "
				+ z_2.isOdd(obj2.getValue()));
		System.out.println("Broj " + b + " je prost: "
				+ z_2.isPrime(obj2.getValue()));

		ulaz.close();
	}

}
