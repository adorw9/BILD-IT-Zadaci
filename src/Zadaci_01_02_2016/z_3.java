package Zadaci_01_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * U javi, short vrijednost se sprema u samo 16 bita. Napisati program koji pita
 * korisnika da unese short broj te mu ispiše svih 16 bita za dati cijeli broj.
 * Na primjer, ukoliko korisnik unese broj 5 - program mu ispisuje
 * 0000000000000101
 */
public class z_3 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// unos od korisnika
		System.out.print("Unesite short broj: ");
		try {
			short broj = ulaz.nextShort();
			// ispis rezultata, prazna mjesta zamjenjujemo nulama
			System.out.println(String.format("%16s",
					Integer.toBinaryString(broj)).replace(' ', '0'));
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

}
