package Zadaci_18_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
public class z_2Test {

	public static void main(String[] args) {
		//pravimo objekte krug1 i krug2
		z_2GeometricObject krug1 = new z_2Circle(6);
		z_2GeometricObject krug2 = new z_2Circle(2);

		//pravimo obj pravougaonika
		z_2GeometricObject prav1 = new z_2Rectangle(5, 9);
		z_2GeometricObject prav2 = new z_2Rectangle(3, 4);

		// ispisujemo rezultat
		System.out.println(z_2GeometricObject.max(krug1, krug2).toString());
		System.out.println();
		System.out.println(z_2GeometricObject.max(prav1, prav2));

	}

}
