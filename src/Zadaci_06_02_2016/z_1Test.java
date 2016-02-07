package Zadaci_06_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
public class z_1Test {

	public static void main(String[] args) {
		// objekat time1
		z_1 time1 = new z_1();
		System.out.println("VRIJEME 1: " + time1.toString());

		// objekat time2
		z_1 time2 = new z_1(555550000);
		System.out.println("VRIJEME 2: " + time2.toString());
	}

}
