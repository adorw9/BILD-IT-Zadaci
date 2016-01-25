package Zadaci_25_01_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji pita korisnika da unese imena tri grada te ih ispiše u
 * abecednom redu. Na primjer, ukoliko korisnik unese Chicago, Los Angeles i
 * Atlanta kao gradove, program vraæa Atlanta, Chicago, Los Angeles.
 */
public class z_1 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// unosimo imena gradova od korisnika
		System.out.println("Unesite ime prvog grada");
		String grad1 = ulaz.nextLine();
		System.out.println("Unesite ime drugog grada");
		String grad2 = ulaz.nextLine();
		System.out.println("Unesite ime treceg grada");
		String grad3 = ulaz.nextLine();
		// pravimo listu i dodajemo gradove u listu
		ArrayList<String> gradovi = new ArrayList<>();

		gradovi.add(grad1);
		gradovi.add(grad2);
		gradovi.add(grad3);
		// sortiramo gradove i ispisujemo rezultat
		Collections.sort(gradovi);
		System.out.println("Sortirani gradovi: " + gradovi);
		ulaz.close();
	}
}
