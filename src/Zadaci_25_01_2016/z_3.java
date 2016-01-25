package Zadaci_25_01_2016;

import java.text.*;
import java.util.Calendar;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Ako pozovemo metodu System.currentTimeMillis() dobijemo broj milisekundi od
 * 1. januara 1970 do trenutka pozivanja metode. Napisati program koji ispisuje
 * trenutaèni datum i vrijeme u formatu
 * "Trenutni datum i vrijeme: 22. juli, 2015 19:59:47"
 */
public class z_3 {

	public static void main(String[] args) {
		// ispis trenutnog datuma i vremena koriste date format i java calendar
		String str = new SimpleDateFormat("dd.'Januar', yyyy HH:mm:ss")
				.format(Calendar.getInstance().getTime());

		System.out.println(str);

	}

}
