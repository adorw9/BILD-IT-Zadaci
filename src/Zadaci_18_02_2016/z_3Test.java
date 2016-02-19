package Zadaci_18_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
public class z_3Test {

	public static void main(String[] args) {
		// pravimo objekte
		z_3ComparableCircle krug1 = new z_3ComparableCircle(8);
		z_3ComparableCircle krug2 = new z_3ComparableCircle(2);

		// Uporedi objekte
		int compare = krug1.compareTo(krug2);

		// Ispisi rezultat
		System.out.println(krug1);
		System.out.println(krug2);
		// uslov koji je krug veæi manji ili isti
		if (compare > 0)
			System.out.println("Prvi krug je veæi!");
		else if (compare < 0)
			System.out.println("Drugi krug je veæi!");
		else
			System.out.println("Krugovi su jednaki!");

	}

}
