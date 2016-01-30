package Zadaci_29_01_2016;

import java.util.Scanner;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Napisati program koji igra sa protivnikom rock-paper-scissors.
 * (papir-bunar-makaze ili tako nekako po na�ki) Program nasumi�no generi�e
 * brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze. Program pita
 * korisnika da unese 0, 1 ili 2 te mu ispisuje poruku da li je korisnik
 * pobijedio, da li je ra�unar pobijedio ili je bilo nerije�eno.
 */
public class z_2 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);

		String korisnik;
		String computer = "";
		// generi�e nasumi�an broj od 0 do 2
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
			System.out.println("NERIJE�ENO!");
		} else if (korisnik.equals("KAMEN")) {
			if (computer.equals("MAKAZE"))
				System.out.println("Kamen pobje�uje makaze. POBIJEDILI STE!!");
			else if (computer.equals("PAPIR"))
				System.out.println("Papir pobje�uje kamen. IZGUBILI STE!!");
		} else if (korisnik.equals("PAPIR")) {
			if (computer.equals("MAKAZE"))
				System.out.println("Makaze pobje�uju papir. IZGUBILI STE!!");
			else if (computer.equals("KAMEN"))
				System.out.println("Papir pobje�uje kamen. POBIJEDILI STE!!");
		} else if (korisnik.equals("MAKAZE")) {
			if (computer.equals("PAPIR"))
				System.out.println("Makaze pobje�uju papir. POBIJEDILI STE!!");
			else if (computer.equals("KAMEN"))
				System.out.println("Kamen pobje�uje makaze. IZGUBILI STE!!");
		} else

			System.out
					.println("\nPOGRE�NO STE ODIGRALI, UNESITE PONOVO VA� POTEZ!");
		ulaz.close();
	}

}
