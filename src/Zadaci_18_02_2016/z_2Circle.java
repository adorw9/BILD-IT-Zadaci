package Zadaci_18_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
public class z_2Circle extends z_2GeometricObject {

	// osobine
	double radius;

	// no arg onstruktor
	public z_2Circle() {

	}

	// konstruktor sa osobinama
	public z_2Circle(double radius) {
		this.radius = radius;
	}

	// konstruktor sa super
	public z_2Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	// povrsina kruga
	public double getArea() {
		return radius * radius * Math.PI;
	}

	// ispis kruga
	public String toString() {
		return "Veæi krug je " + radius;
	}
}
