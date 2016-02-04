package Zadaci_03_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Largest row and column) Write a program that randomly fills in 0s and 1s
 * into a 4-by-4 matrix, prints the matrix, and finds the first row and column
 * with the most 1s.
 */
public class z_3 {
	// metoda za print matrice
	public static void printMatrix(int n) {
		int brojac1 = 0;
		int brojac2 = 0;
		int max1 = 0;
		int max2 = 0;
		int pozicija1 = 0;
		int pozicija2 = 0;
		// pravimo matricu sa velicinom koju korisnik unese
		int[][] matrix = new int[n][n];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				// generišemo nasumièno brojeve 0 i 1 u matrici
				matrix[i][j] = (int) (Math.random() * 2);
				System.out.print(matrix[i][j] + " ");
				// brojac jedinica u redu
				if (matrix[i][j] == 1) {
					brojac1++;
				}
				// brojac jedinica u koloni
				if (matrix[j][i] == 1) {
					brojac2++;
				}

			}
			System.out.println();
			// pronalazimo poziciju u redu
			if (brojac1 > max1) {
				max1 = brojac1;
				pozicija1 = i;

			}
			brojac1 = 0;
			// pronalzimo poziciju u koloni
			if (brojac2 > max2) {
				max2 = brojac2;
				pozicija2 = i;

			}
			brojac2 = 0;
		}
		System.out.println("Red sa najviše jedinica je:  " + pozicija1);
		System.out.println("Kolona sa najviše jedinica je " + pozicija2);

	}

	public static void main(String[] args) {

		printMatrix(4);

	}

}
