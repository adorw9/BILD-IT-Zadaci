package Zadaci_05_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
public class z_2Test {

	public static void main(String[] args) {
		// prvi objekat
		z_2 polygon1 = new z_2();
		// drugi obejkat
		z_2 polygon2 = new z_2(6, 4);
		// treæi objekat
		z_2 polygon3 = new z_2(10, 4, 5.6, 7.8);

		// ispisujemo rezulate za svaki polygon
		System.out.print("Polygon1: " + "OBIM = " + polygon1.getPerimeter()
				+ "  | POVRŠINA= " + polygon1.getArea());
		System.out.print("\nPolygon2: " + "OBIM = " + polygon2.getPerimeter()
				+ " | POVRŠINA= " + polygon2.getArea());
		System.out.print("\nPolygon3: " + "OBIM = " + polygon3.getPerimeter()
				+ " | POVRŠINA= " + polygon3.getArea());

	}

}
