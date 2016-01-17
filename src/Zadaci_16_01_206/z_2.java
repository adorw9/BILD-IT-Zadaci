package Zadaci_16_01_206;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Napisati metodu koja prima jedan argument, broj pitanja, te generi�e toliko
 * nasumi�nih, jednostavnih pitanja oduzimanja tipa : �Koliko je 5 - 2 ?�.
 * Metoda treba da broji broj ta�nih i neta�nih odgovora te ih ispi�e korisniku.
 */
public class z_2 {
	public static void oduzimanje(int a) {
		Scanner ulaz = new Scanner(System.in);

		// brojac ta�nih i neta�nih odgovora
		int brojacT = 0;
		int brojacN = 0;
		// petljom generi�emo nasumi�na pitanja
		for (int i = 0; i < a; i++) {
			int broj1 = (int) (Math.random() * 10);
			int broj2 = (int) (Math.random() * 10);
			int tacanOdgovor = broj1 - broj2;
			// postavljamo pitanje korisiku, a brojaci odraduju svoj posao
			System.out.println("Pitanje " + (i + 1) + ":" + " Koliko je "
					+ broj1 + " - " + broj2 + "?");
			int odgovor = ulaz.nextInt();
			if (odgovor == tacanOdgovor) {
				brojacT++;
				System.out.println("Odgovorili ste ta�no");
			} else {
				brojacN++;
				System.out.println("Odgovorili ste neta�no");
			}
		}
		// ispis koliko je bilo ta�nih i neta�nih odgovora
		System.out.println("Imali ste " + brojacT + " tacnih odgovora i "
				+ brojacN + " neta�nih odgovora.");
		ulaz.close();
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// korisnik unosi koliko �eli pitanja
		System.out.println("Unesite broj pitanja:");
		try {
			int pitanja = ulaz.nextInt();
			// poziv metode
			oduzimanje(pitanja);

		} catch (InputMismatchException ex) {
			System.out.println("GRE�KA: Unosite brojeve!");
			ulaz.close();
		}
	}
}
