package Zadaci_19_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
public class z_3Test {

	public static void main(String[] args) {
		// pravimo objekte
		z_3Octagon oct1 = new z_3Octagon(7);
		System.out.println("Objekat: ");
		System.out.println("Površina objekta: " + oct1.getArea());
		System.out.println("Obim objekta: " + oct1.getPerimeter());

		// kreiramo klon objekat
		z_3Octagon klon = new z_3Octagon();
		klon = oct1.clone();
		System.out.println();
		System.out.println("Klonirani objekat: ");
		System.out.println("Površina kloniranog objekta: " + klon.getArea());
		System.out.println("Obim kloniranog objekta: " + klon.getPerimeter());

		// ispis rezultata
		if (oct1.compareTo(klon) > 0)
			System.out.println("Objekat je veæi od kloniranog!");
		else if (oct1.compareTo(klon) < 0)
			System.out.println("Klonirani objekat je veæi!");
		else
			System.out.println("Objekti su jednaki!");

	}

}
