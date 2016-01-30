package Zadaci_29_01_2016;

import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji igra sa protivnikom rock-paper-scissors.
 * (papir-bunar-makaze ili tako nekako po naški) Program nasumièno generiše
 * brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze. Program pita
 * korisnika da unese 0, 1 ili 2 te mu ispisuje poruku da li je korisnik
 * pobijedio, da li je raèunar pobijedio ili je bilo neriješeno.
 */
public class z_2 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);

		String korisnik;
		String computer = "";
		// generiše nasumièan broj od 0 do 2
		int broj = (int) (Math.random() * 3);
		// broju dodjeljujemo nazive
		if (broj == 0) {
			computer = "KAMEN";
		} else if (broj == 1) {
			computer = "PAPIR";
		} else if (broj == 2) {
			computer = "MAKAZE";
		}
		// unos podataka od korisnika
		System.out.print("Unesite potez ('KAMEN', 'MAKAZE' , 'PAPIR') : ");
		korisnik = ulaz.next();
		korisnik = korisnik.toUpperCase();

		System.out.println("Kompjuter je odigrao: " + computer);
		// postavljamo pravila igre i ispisujemo rezultat
		if (korisnik.equals(computer)) {
			System.out.println("NERIJEŠENO!");
		} else if (korisnik.equals("KAMEN")) {
			if (computer.equals("MAKAZE"))
				System.out.println("Kamen pobjeðuje makaze. POBIJEDILI STE!!");
			else if (computer.equals("PAPIR"))
				System.out.println("Papir pobjeðuje kamen. IZGUBILI STE!!");
		} else if (korisnik.equals("PAPIR")) {
			if (computer.equals("MAKAZE"))
				System.out.println("Makaze pobjeðuju papir. IZGUBILI STE!!");
			else if (computer.equals("KAMEN"))
				System.out.println("Papir pobjeðuje kamen. POBIJEDILI STE!!");
		} else if (korisnik.equals("MAKAZE")) {
			if (computer.equals("PAPIR"))
				System.out.println("Makaze pobjeðuju papir. POBIJEDILI STE!!");
			else if (computer.equals("KAMEN"))
				System.out.println("Kamen pobjeðuje makaze. IZGUBILI STE!!");
		} else

			System.out
					.println("\nPOGREŠNO STE ODIGRALI, UNESITE PONOVO VAŠ POTEZ!");
		ulaz.close();
	}

}
