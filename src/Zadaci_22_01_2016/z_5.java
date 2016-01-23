package Zadaci_22_01_2016;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Napisati metodu koja pretavara milisekunde u sate, minute i sekunde. Metoda
 * treba da koristi sljede�i header: public static String convertMillis(long
 * millis). Metoda treba da vra�a vrijeme kao string u formatu
 * sati:minute:sekunde. Na primjer convertMillis(100000) treba da vrati 0:1:40.
 */
public class z_5 {
	// metoda za pretvranje milisekundi
	public static String convertMillis(long miliSekunde) {

		// vra�amo vrijeme kao string u formatu h:m:s
		return (String.format("%d sati : %d minuta : %d sekundi", miliSekunde
				/ (1000 * 60 * 60), (miliSekunde % (1000 * 60 * 60))
				/ (1000 * 60),
				((miliSekunde % (1000 * 60 * 60)) % (1000 * 60)) / 1000));
	}

	public static void main(String[] args) {
		// ispis
		System.out.println(convertMillis(100000));

	}

}
