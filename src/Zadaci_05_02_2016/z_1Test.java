package Zadaci_05_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
public class z_1Test {

	public static void main(String[] args) {
		// objekat fan1
		z_1 fan1 = new z_1();
		fan1.setSpeed(fan1.FAST);
		fan1.setRadius(10);
		fan1.setColor("žuta");
		fan1.setOn(true);
		System.out.println(fan1.toString());

		// objekat fan2
		z_1 fan2 = new z_1();
		fan2.setSpeed(fan1.MEDIUM);
		fan2.setRadius(5);
		fan2.getColor();
		fan2.setOn(false);
		System.out.println(fan2.toString());

	}

}
