package Zadaci_10_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
public class z_1Triangle extends z_1GeometricObject {
	// osobine
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	// no arg konstruktor
	public z_1Triangle() {
	}

	// konstruktor sa osobinama
	public z_1Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// geteri i seteri
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	// metoda za povrsinu
	public double getArea() {
		return (side1 + side2 + side3) / 2;
	}

	// metoda za obim
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	// metoda za string
	public String toString() {
		return "side1 = " + side1 + " ,side2 = " + side2 + " ,side3 = " + side3
				+ ".";
	}
}
