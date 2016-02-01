package Zadaci_01_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji prima ASCII kod (cijeli broj izmeðu 0 i 127) te
 * ispisuje koji je to karakter. Na primjer, ukoliko korisnik unese 69 kao ASCII
 * kod, program mu ispisuje da je karakter sa tim brojem karakter E.
 */
public class z_1 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			// unos od korisnika
			System.out.print("Unesite broj od 0 do 127: ");
			int broj = ulaz.nextInt();
			// ispis karaktera
			System.out.println("Karakter: " + (char) broj);
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

}
