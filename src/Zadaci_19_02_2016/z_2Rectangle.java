package Zadaci_19_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Enable Rectangle comparable) Rewrite the Rectangle class in Listing 13.3 to
 * extend GeometricObject and implement the Comparable interface. Override the
 * equals method in the Object class. Two Rectangle objects are equal if their
 * areas are the same. Draw the UML diagram that involves Rectangle,
 * GeometricObject, and Comparable.
 */
public class z_2Rectangle extends GeometricObject {

	// osobine
	double width;
	double height;

	// no arg konstruktor
	public z_2Rectangle() {

	}

	// konstruktor sa osobinama
	public z_2Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// povrsina
	public double getArea() {
		return height * width;
	}

	public String toString() {
		return "Stranice pravougaonika su " + this.height + " | " + this.width;
	}

	// provjeravamo jednakost pravougaonika
	public boolean equals(Object rec) {
		if (this.getArea() == ((GeometricObject) rec).getArea()) {
			return true;
		} else
			return false;
	}
}
