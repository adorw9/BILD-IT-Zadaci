package Zadaci_30_01_2016;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Napisati metodu koja vra�a datum i trenuta�no vrijeme.
 */
public class z_4 {
	// metoda za ta�no vrijeme i datum
	public static String datumIvrijeme(String vrijeme) {
		Date date = new Date();

		SimpleDateFormat ft = new SimpleDateFormat(
				"E dd.MM.yyyy '\nSati je:' HH:mm:ss  ");

		return ft.format(date);
	}

	public static void main(String[] args) {
		// pozivanje metode i ispis rezultata
		String a = "";
		System.out.println("Dana�nji datum je: " + datumIvrijeme(a));

	}

}
