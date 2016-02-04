package Zadaci_03_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Even number of 1s) Write a program that generates a 6-by-6 two-dimensional
 * matrix filled with 0s and 1s, displays the matrix, and checks if every row
 * and every column have an even number of 1s.
 */
public class z_5 {
	// metoda za print matrice
	public static void printMatrix(int n) {
		int brojac1 = 0;
		int brojac2 = 0;
		// pravimo matricu sa velicinom koju korisnik unese
		int[][] matrix = new int[n][n];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				// generišemo nasumièno brojeve 0 i 1 u matrici
				matrix[i][j] = (int) (Math.random() * 2);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		// pronalazimo jedinice u redovima i kolonama
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				// brojac jedinica redova
				if (matrix[i][j] == 1) {
					brojac1++;
				}
				// brojac jedinica kolona
				if (matrix[j][i] == 1) {
					brojac2++;
				}
			}
			// za red
			if (brojac1 == matrix.length / 2) {
				System.out.println("Red " + i
						+ " sadrzi jedinice na parnim mjestima.");
			} else {
				System.out.println("Red " + i
						+ " ne sadrzi jedinice na parnim mjestima.");
			}
			brojac1 = 0;

			// za kolone
			if (brojac2 == matrix.length / 2) {
				System.out.println("Kolona " + i
						+ " sadrzi jedinice na parnim mjestima.");

			} else {
				System.out.println("Kolona " + i
						+ " ne sadrzi jedinice na parnim mjestima.");
			}
			brojac2 = 0;
		}
	}

	public static void main(String[] args) {
		// pozivamo metodu i unosimo velièinu matrice
		printMatrix(6);
	}

}
