package Zadaci_19_01_2016;
import java.util.Scanner;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Napisati program koji pita korisnika da unese 2 stringa te ispisuje najve�i
 * zajedni�ki prefix za ta dva stringa, ukoliko isti postoji. Na primjer,
 * ukoliko korisnik unese sljede�a dva stringa "Dobrodo�li u Dubai" i
 * "Dobrodo�li u Vankuver" program treba da ispi�e: Najve�i zajedni�ki prefix za
 * dva stringa je "Dobrodo�li u".
 */
public class z_3 {
	// pravimo metodu prefix
	public static String prefix(String a, String b) {
		// ispitujemo koliko zajednickih prefiksa imaju stringovi
		int duzina = Math.min(a.length(), b.length());
		for (int i = 0; i < duzina; i++) {

			if (a.charAt(i) != b.charAt(i)) {
				return a.substring(0, i);
			}
		}
		return a.substring(0, duzina);
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);

		// unosimo podatke od korisnika
		System.out.println("Unesite prvu rije�");
		String tekst1 = ulaz.nextLine();
		System.out.println("Unesite drugu rije�");
		String tekst2 = ulaz.nextLine();

		// ispis rezultata;
		// "ukoliko je prvo slovo razli�ito nema zajedni�kih prefiksa"
		if (tekst1.charAt(0) != tekst2.charAt(0)) {
			System.out.println("Nema zajedni�kih prefiska");
		} else
			System.out.println("Najve�i zajedni�ki prefiks za stringove je: \n"
					+ prefix(tekst1, tekst2));
		ulaz.close();

	}
}
