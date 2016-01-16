package Zadaci_15_01_2016;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Napisati metodu koja prima dva cijela broja kao argumente te vra�a najve�i
 * zajedni�ki djelilac za ta dva broja.
 * 
 * PRIMJER:
 * 
 * Unesite prvi broj: 125 Unesite drugi broj: 2525 Najve�i zajedni�ki djelilac
 * za brojeve 125 i 2525 je 25.
 */
public class z_3 {
	// metoda djelilac
	public static int djelilac(int a, int b) {
		int broj = 0;
		int max = 0;
		int i = 1;
		// petljom provjeravamo koji je najve�i djelilac izme�u dva broja
		while (i < 100) {
			i++;
			if (a % i == 0 && b % i == 0) {
				broj = i;
				if (max < broj) {
					max = broj;
					
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try{
		System.out.println("Unesite broj 1:");
		int broj1 = ulaz.nextInt();
		System.out.println("Unesite broj 2");
		int broj2 = ulaz.nextInt();
		
		// ispis rezultata i pozivanje metode
		System.out.println("Najve�i zajedni�ki djelilac za unesene brojeve je "
				+ djelilac(broj1, broj2));
		
		//prilikom unosa slova, znaka izbacuje se gre�ka
		}catch (InputMismatchException ex) {
			System.out.println("GRE�KA: Neispravan unos podataka!");
		ulaz.close();
		}
	}

}
