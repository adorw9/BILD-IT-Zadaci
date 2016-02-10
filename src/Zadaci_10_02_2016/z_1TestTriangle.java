package Zadaci_10_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
public class z_1TestTriangle {

	public static void main(String[] args) {
		// kreiramo objekat
		z_1Triangle triangle = new z_1Triangle(1, 2, 3);
		// ispisujemo rezultate
		System.out.println("Strane trokuta su: " + triangle.toString());
		System.out.println("Površina trokuta je: " + triangle.getArea());
		System.out.println("Obim trokuta je: " + triangle.getPerimeter());
		System.out.println("Boja trokuta: " + triangle.getColor());
		System.out.println("Trokut je: " + triangle.isFilled());
	}

}
