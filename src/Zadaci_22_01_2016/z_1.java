package Zadaci_22_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji pita korisnika da unese cijeli broj za današnji dan u
 * sedmici (0 za ponedjeljak, 1 za utorak...) i da unese broj dana nakon
 * današnjeg dana te mu ispiše koji je to dan u buduænosti. (Primjer: ako
 * korisnik unese 1 kao današnji dan a 3 kao dan u buduænosti program mu
 * ispisuje da je danas utorak a dan u buduænosti je petak.)
 */
public class z_1 {
	// metoda za vracanje naziva naziva dana
	public static String dani(int dan) {
		if (dan == 1)
			return "Ponedjeljak";
		if (dan == 2)
			return "Utorak";
		if (dan == 3)
			return "Srijeda";
		if (dan == 4)
			return "Èetvrtak";
		if (dan == 5)
			return "Petak";
		if (dan == 6)
			return "Suboda";
		if (dan == 7)
			return "Nedjelja";
		return null;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			// unosimo dane od 1 do 7,ukoliko su > 7 ili manji < 1 izbacuje
			// ponovo pitanje za unos
			System.out.print("Unesite dan: ");
			int dan = ulaz.nextInt();
			while (dan < 1 || dan > 7) {
				System.out.println("UNESITE DAN OD 1 DO 7!");
				dan = ulaz.nextInt();
			}
			System.out.print("Unesite buduæi dan: ");
			int buduci = ulaz.nextInt();
			// formula za buduci dan
			int buduciDan = (dan + buduci) % 7;
			// ispis rezultata pozivanjem metode
			System.out.println("Današnji dan: " + dani(dan));
			System.out.println("Buduæi dan  : " + dani(buduciDan));
		} catch (InputMismatchException ex) {
			System.out.println("Samo brojevi dozvoljeni za unos :( ");
			ulaz.close();

		}
	}
}
