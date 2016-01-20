package Zadaci_20_01_2016;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji pita korisnika da unese neki string te mu ispisuje sve
 * karaktere koji se nalaze na neparnim pozicijama. Na primjer, ako korisnik
 * unese string Beijing Chicago, program vraæa BiigCiao.
 */
public class z_4 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);

		// unos stringa
		System.out.println("Unesite neki string");
		String a = ulaz.nextLine();
		// pravimo niz od stringa
		char[] niz = a.toCharArray();
		// prolazimo kroz niz i ispisujemo samo karaktere na neparnim
		// pozicijama
		for (int i = 0; i < niz.length; i++) {
			if (i % 2 == 0) {
				System.out.print(niz[i]);
				ulaz.close();

			}

		}
	}
}
