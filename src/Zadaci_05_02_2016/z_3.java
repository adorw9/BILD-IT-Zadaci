package Zadaci_05_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Algebra: quadratic equations
 */
public class z_3 {
	// osobine
	private double a, b, c;

	// konstruktori
	public z_3(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// geteri
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	// metoda za discriminant
	public double getDiscriminant() {
		return (b * b) - (4 * a * c);
	}

	// metoda za root 1
	public double getRoot1() {
		if (getDiscriminant() < 0)
			return 0;
		else {
			return (-b + getDiscriminant()) / (2 * a);
		}
	}

	// metoda za root2
	public double getRoot2() {
		if (getDiscriminant() < 0)
			return 0;
		else {
			return (-b - getDiscriminant()) / (2 * a);
		}
	}
}
