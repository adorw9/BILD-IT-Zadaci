package Zadaci_15_02_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Count characters, words, and lines in a file) Write a program that will
 * count the number of characters, words, and lines in a file. Words are
 * separated by whitespace characters. The file name should be passed as a
 * command-line argument, as shown in Figure 12.13.
 */
public class z_4 {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("scores.txt");
		if (file.exists()) {
			System.out.println("File " + file + " veæ postoji");
		}
		// brojaci za rijeci, karaktere i linije
		int brojac1 = 0;
		int brojac2 = 0;
		int brojac3 = 0;
		// èitamo file i tražimo koliko ima linija, rijeci, karaktera
		try (Scanner ulaz = new Scanner(file);) {
			while (ulaz.hasNext()) {
				String linije = ulaz.nextLine();
				brojac1++;
				if (!linije.equalsIgnoreCase("")) {
					String rep = linije.replaceAll("\\s+", "");
					brojac2 += rep.length();
					brojac3 += linije.split(" ").length;
				}
			}
			ulaz.close();
		}
		System.out.println("Karakteri: " + brojac2);
		System.out.println("Rijeèi: " + brojac3);
		System.out.println("Linije: " + brojac1);

	}
}
