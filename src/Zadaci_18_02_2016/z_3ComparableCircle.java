package Zadaci_18_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (The ComparableCircle class) Define a class named ComparableCircle that
 * extends Circle and implements Comparable. Draw the UML diagram and implement
 * the compareTo method to compare the circles on the basis of area. Write a
 * test class to find the larger of two instances of ComparableCircle objects.
 */
public class z_3ComparableCircle extends z_2Circle implements
		Comparable<z_2GeometricObject> {

	// konstruktor
	public z_3ComparableCircle(double radius) {
		super(radius);
	}
	//override
	@Override
	public int compareTo(z_2GeometricObject obj) {
		if (this.getArea() > obj.getArea()) {
			return 1;
		} else if (getArea() < obj.getArea()) {
			return -1;
		} else
			return 0;
	}

}
