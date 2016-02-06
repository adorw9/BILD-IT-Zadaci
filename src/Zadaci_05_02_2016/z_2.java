package Zadaci_05_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Geometry: n-sided regular polygon
 */
public class z_2 {

	// osobine
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;

	// no arg konstruktor
	public z_2() {

	}

	// konstruktor broj i velicina
	public z_2(int n, int side) {
		this.n = n;
		this.side = side;
	}

	// konstruktor sa svim podacima
	public z_2(int n, int side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}

	// geteri i seteri
	public int getN() {
		return n;
	}

	public double getSide() {
		return side;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	// metoda za obim
	public double getPerimeter() {
		return n * side;
	}

	// metoda za površinu
	public double getArea() {
		return (n * (side * side) / 4 * Math.tan(Math.PI / n));
	}
}
