package Zadaci_18_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Enable GeometricObject comparable) Modify the GeometricObject class to
 * implement the Comparable interface, and define a static max method in the
 * GeometricObject class for finding the larger of two GeometricObject objects.
 * Draw the UML diagram and implement the new GeometricObject class. Write a
 * test program that uses the max method to find the larger of two circles and
 * the larger of two rectangles.
 */
public abstract class z_2GeometricObject implements
		Comparable<z_2GeometricObject> {
	// osobine
	private String color;
	private boolean filled;

	// no arg konstruktor
	public z_2GeometricObject() {

	}

	// konstruktor sa osobinama
	public z_2GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	// geteri i seteri
	public String getColor() {
		return color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	// metoda string
	public String toStrings() {
		return "Boja: " + color + " i ispunjena: " + filled;
	}

	// povrsina
	public abstract double getArea();

	// uporedujemo dva objekta
	public int compareTo(z_2GeometricObject obj) {
		if (this.getArea() > obj.getArea()) {
			return 1;
		} else if (this.getArea() < obj.getArea()) {
			return -1;
		} else
			return 0;
	}

	// vraca veæi objekat
	public static z_2GeometricObject max(z_2GeometricObject obj1,
			z_2GeometricObject obj2) {
		if (obj1.compareTo(obj2) == 1) {
			return obj1;
		} else
			return obj2;
	}
}
