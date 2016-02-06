package Zadaci_05_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * The Fan class
 */
public class z_1 {
	// osobine
	int SLOW = 1;
	int MEDIUM = 2;
	int FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String color = "blue";

	// no arg konstruktor
	public z_1() {

	}

	// geteri i seteri
	public int getSpeed() {
		return speed;
	}

	public int getSLOW() {
		return SLOW;
	}

	public int getMEDIUM() {
		return MEDIUM;
	}

	public int getFAST() {
		return FAST;
	}

	public boolean isOn() {
		return on;
	}

	public double getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	public void setSLOW(int sLOW) {
		SLOW = sLOW;
	}

	public void setMEDIUM(int mEDIUM) {
		MEDIUM = mEDIUM;
	}

	public void setFAST(int fAST) {
		FAST = fAST;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// metoda za ispis rezultat
	public String toString() {
		if (on) {
			String on = "BRZINA: " + speed + " | BOJA: " + color
					+ " | RADIUS: " + radius;
			return on;
		}
		System.out.println();
		if (!on) {
			String off = "FAN IS OFF";
			return off;
		}
		return null;

	}

}
