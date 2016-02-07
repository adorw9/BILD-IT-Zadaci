package Zadaci_06_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
public class z_3Test {

	public static void main(String[] args) {

		// kreiramo prvi objekat
		z_3 myPoint1 = new z_3();
		// kreiramo drugi objekat
		z_3 myPoint2 = new z_3(10, 30.5);

		System.out.println("Udaljenost izmeðu dvije taèke je: "
				+ myPoint1.distance(myPoint2));

	}

}
