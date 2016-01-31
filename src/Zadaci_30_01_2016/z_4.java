package Zadaci_30_01_2016;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati metodu koja vraæa datum i trenutaèno vrijeme.
 */
public class z_4 {
	// metoda za taèno vrijeme i datum
	public static String datumIvrijeme(String vrijeme) {
		Date date = new Date();

		SimpleDateFormat ft = new SimpleDateFormat(
				"E dd.MM.yyyy '\nSati je:' HH:mm:ss  ");

		return ft.format(date);
	}

	public static void main(String[] args) {
		// pozivanje metode i ispis rezultata
		String a = "";
		System.out.println("Današnji datum je: " + datumIvrijeme(a));

	}

}
