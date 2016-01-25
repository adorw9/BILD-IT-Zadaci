package Zadaci_24_01_2016;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Napisati metodu koja pronalazi broj ponavljanja odre�enog karaktera u
 * stringu. Metoda treba da koristi sljede�i header: public static int
 * count(String str, char a). Na primjer, ukoliko pozovemo metodu na sljede�i
 * na�in: count("Welcome", e) metoda treba da vrati 2. Napisati program koji
 * pita korisnika da unese string i koji karakter �eli da prebroji u datom
 * stringu te mu ispi�e koliko se puta odre�eni karakter ponovio u zadatom
 * stringu.
 */
public class z_4 {
	// metoda za broj ponavljanja u stringu
	public static int count(String str, char a) {
		int brojac = 0;
		// trazimo koliko se karakter ponavlja u stringu
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				brojac++;
			}
		}
		return brojac;
	}

	public static void main(String[] args) {
		// ispis rezultata
		System.out.println(count("Welcome", 'e'));

	}

}
