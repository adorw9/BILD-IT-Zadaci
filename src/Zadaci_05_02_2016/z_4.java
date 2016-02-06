package Zadaci_05_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Algebra: 2 * 2 linear equations
 */
public class z_4 {
	// osobine
	private double a, b, c, d, e, f;

	// konstruktor
	public z_4(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
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

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}

	// metoda "da li je rješivo"
	public boolean isSolvable() {
		if (((a * d - b * c)) != 0) {
			return true;
		}
		return false;
	}

	// metoda za x
	public double getX() {
		if (isSolvable()) {
			return (d * e - b * f) / (a * d - b * c);
		}
		return 0;
	}

	// metoda za y
	public double getY() {
		if (isSolvable()) {
			return (c * e - f * a) / (a * d - b * c);
		}
		return 0;
	}

}
