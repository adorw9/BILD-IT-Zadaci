package Zadaci_19_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Sum the areas of geometric objects) Write a method that sums the areas of
 * all the geometric objects in an array. The method signature is: public static
 * double sumArea(GeometricObject[] a) Write a test program that creates an
 * array of four objects (two circles and two rectangles) and computes their
 * total area using the sumArea method.
 */
public class z_4 {
	// pravimo metodu za sumu površina
	public static double sumPovrsina(GeometricObject[] o) {

		double suma = 0;
		for (int i = 0; i < o.length; i++) {
			suma = suma + o[i].getArea();
		}
		return suma;
	}

	public static void main(String[] args) {
		// pravimo objekte
		GeometricObject krug1 = new z_1Circle(5);
		GeometricObject krug2 = new z_1Circle(9);
		GeometricObject prav1 = new z_2Rectangle(2, 8);
		GeometricObject prav2 = new z_2Rectangle(3, 7);

		// stavljamo objekte u niz i ispisujemo rezultat
		GeometricObject[] o = { krug1, krug2, prav1, prav2 };

		System.out.println(sumPovrsina(o));

	}

}
