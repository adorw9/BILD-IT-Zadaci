package Zadaci_18_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
public class z_2Rectangle extends z_2GeometricObject {

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
		return "Stranice veæeg pravougaonika su " + this.height + " | "
				+ this.width;
	}
}
