package Zadaci_06_02_2016;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * The MyPoint class
 */
public class z_3 {
	// osobine
	private double x;
	private double y;

	// konstruktori
	public z_3(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public z_3() {
		this(0, 0);
	}

	// getter
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	// metoda za izra�un udaljenosti dvije ta�ke
	public double distance(double x, double y) {
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y)
				* (this.y - y));
	}

	// metoda za udaljenost ta�aka sa metodom distance
	public double distance(z_3 obj) {
		return distance(obj.x, obj.y);
	}
}
