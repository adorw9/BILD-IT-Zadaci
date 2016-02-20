package Zadaci_19_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Enable Circle comparable) Rewrite the Circle class in Listing 13.2 to extend
 * GeometricObject and implement the Comparable interface. Override the equals
 * method in the Object class. Two Circle objects are equal if their radii are
 * the same. Draw the UML diagram that involves Circle, GeometricObject, and
 * Comparable.
 */
public class z_1Circle extends GeometricObject {

	// osobine
	double radius;

	// no arg onstruktor
	public z_1Circle() {

	}

	// konstruktor sa osobinama
	public z_1Circle(double radius) {
		this.radius = radius;
	}

	// konstruktor sa super
	public z_1Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	// geter
	public double getRadius() {
		return radius;
	}

	// povrsina kruga
	public double getArea() {
		return radius * radius * Math.PI;
	}

	// ispis kruga
	public String toString() {
		return "Poluprecnik kruga " + radius;
	}

	// provjera da li su dva kruga ista
	public boolean equals(Object cir) {
		if (this.getRadius() == ((z_1Circle) cir).getRadius()) {
			return true;

		} else
			return false;
	}

}
