package Zadaci_19_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (The Octagon class) Write a class named Octagon that extends GeometricObject
 * and implements the Comparable and Cloneable interfaces. Assume that all eight
 * sides of the octagon are of equal length. The area can be computed using the
 * following formula: area = (2 + 4/22)* side * side Draw the UML diagram that
 * involves Octagon, GeometricObject, Comparable, and Cloneable. Write a test
 * program that creates an Octagon object with side value 5 and displays its
 * area and perimeter. Create a new object using the clone method and compare
 * the two objects using the compareTo method.
 */
public class z_3Octagon extends GeometricObject implements
		Comparable<GeometricObject>, Cloneable {

	// osobine
	public double side;

	// no arg konstruktor
	public z_3Octagon() {

	}

	// konstruktor sa osobinama
	public z_3Octagon(double side) {
		this.side = side;
	}

	// povrsina
	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}

	// obim
	public double getPerimeter() {
		return 8 * side;
	}

	// uporedivanje objekata
	public int compareTo(z_3Octagon obj) {
		if (this.getArea() > obj.getArea()) {
			return 1;
		} else if (this.getArea() == obj.getArea()) {
			return 0;
		} else
			return -1;

	}

	// kloniranje
	public z_3Octagon clone() {
		z_3Octagon clone = new z_3Octagon(this.side);
		return clone;
	}
}
