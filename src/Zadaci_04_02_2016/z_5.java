package Zadaci_04_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Location class
 */
public class z_5 {
	// osobine
	public int row;
	public int column;
	public double maxValue;

	// konstruktor
	public z_5(int row, int column, double maxValue) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}

	// metoda za vraæanje najveæeg elementa
	public static z_5 locateLargest(double[][] a) {

		int row = 0;
		int column = 0;
		double maxValue = a[row][column];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (maxValue < a[i][j]) {
					maxValue = a[i][j];
					row = i;
					column = j;
				}
			}
		}
		return new z_5(row, column, maxValue);
	}
}