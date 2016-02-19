package Zadaci_18_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (The Colorable interface) Design an interface named Colorable with a void
 * method named howToColor(). Every class of a colorable object must implement
 * the Colorable interface. Design a class named Square that extends
 * GeometricObject and implements Colorable. Implement howToColor to display the
 * message Color all four sides. Draw a UML diagram that involves Colorable,
 * Square, and GeometricObject. Write a test program that creates an array of
 * five GeometricObjects. For each object in the array, display its area and
 * invoke its howToColor method if it is colorable.
 */
public class z_4Test {

	public static void main(String[] args) {
		// pravimo objekte
		z_2GeometricObject obj1 = new z_4Square("blue", true, 7);
		z_2GeometricObject obj2 = new z_4Square("yellow", true, 5);
		z_2GeometricObject obj3 = new z_2Circle(2);
		z_2GeometricObject obj4 = new z_4Square("", false, 9);
		z_2GeometricObject obj5 = new z_2Circle(3);
		z_2GeometricObject obj6 = new z_2Circle(4);

		// pravimo niz sa objektima
		z_2GeometricObject[] list = { obj1, obj2, obj3, obj4, obj5, obj6 };

		// ispis rezultata
		for (int i = 0; i < list.length; i++) {
			if (list[i] instanceof z_4Colorable) {
				System.out.print("Objekat" + (i + 1) + " je: "
						+ list[i].getArea() + " ");
				((z_4Colorable) list[i]).howToColor();
			} else
				System.out.println("Objekat" + (i + 1) + " površina je: "
						+ list[i].getArea() + " ");
		}

	}

}
