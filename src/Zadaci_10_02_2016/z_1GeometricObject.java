package Zadaci_10_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * The Triangle class
 */
public class z_1GeometricObject {
	// osobine
	private String color = "blue";
	private boolean filled = true;

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
}
