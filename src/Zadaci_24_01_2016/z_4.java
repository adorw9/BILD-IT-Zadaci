package Zadaci_24_01_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati metodu koja pronalazi broj ponavljanja odreðenog karaktera u
 * stringu. Metoda treba da koristi sljedeæi header: public static int
 * count(String str, char a). Na primjer, ukoliko pozovemo metodu na sljedeæi
 * naèin: count("Welcome", e) metoda treba da vrati 2. Napisati program koji
 * pita korisnika da unese string i koji karakter želi da prebroji u datom
 * stringu te mu ispiše koliko se puta odreðeni karakter ponovio u zadatom
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
