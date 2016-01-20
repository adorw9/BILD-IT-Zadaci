package Zadaci_19_01_2016;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji pita korisnika da unese 2 stringa te ispisuje najveæi
 * zajednièki prefix za ta dva stringa, ukoliko isti postoji. Na primjer,
 * ukoliko korisnik unese sljedeæa dva stringa "Dobrodošli u Dubai" i
 * "Dobrodošli u Vankuver" program treba da ispiše: Najveæi zajednièki prefix za
 * dva stringa je "Dobrodošli u".
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
		System.out.println("Unesite prvu rijeè");
		String tekst1 = ulaz.nextLine();
		System.out.println("Unesite drugu rijeè");
		String tekst2 = ulaz.nextLine();

		// ispis rezultata;
		// "ukoliko je prvo slovo razlièito nema zajednièkih prefiksa"
		if (tekst1.charAt(0) != tekst2.charAt(0)) {
			System.out.println("Nema zajednièkih prefiska");
		} else
			System.out.println("Najveæi zajednièki prefiks za stringove je: \n"
					+ prefix(tekst1, tekst2));
		ulaz.close();

	}
}
