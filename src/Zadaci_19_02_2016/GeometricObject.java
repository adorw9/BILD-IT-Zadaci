package Zadaci_19_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
public abstract class GeometricObject implements Comparable<GeometricObject> {
	// osobine
	private String color;
	private boolean filled;

	// no arg konstruktor
	public GeometricObject() {

	}

	// konstruktor sa osobinama
	public GeometricObject(String color, boolean filled) {
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
	public int compareTo(GeometricObject obj) {
		if (this.getArea() > obj.getArea()) {
			return 1;
		} else if (this.getArea() < obj.getArea()) {
			return -1;
		} else
			return 0;
	}

	// vraca veæi objekat
	public static GeometricObject max(GeometricObject obj1, GeometricObject obj2) {
		if (obj1.compareTo(obj2) == 1) {
			return obj1;
		} else
			return obj2;
	}
}
