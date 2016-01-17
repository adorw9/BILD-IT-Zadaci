package Zadaci_16_01_206;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati metodu koja prima jedan argument, broj pitanja, te generiše toliko
 * nasumiènih, jednostavnih pitanja oduzimanja tipa : „Koliko je 5 - 2 ?“.
 * Metoda treba da broji broj taènih i netaènih odgovora te ih ispiše korisniku.
 */
public class z_2 {
	public static void oduzimanje(int a) {
		Scanner ulaz = new Scanner(System.in);

		// brojac taènih i netaènih odgovora
		int brojacT = 0;
		int brojacN = 0;
		// petljom generišemo nasumièna pitanja
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
				System.out.println("Odgovorili ste taèno");
			} else {
				brojacN++;
				System.out.println("Odgovorili ste netaèno");
			}
		}
		// ispis koliko je bilo taènih i netaènih odgovora
		System.out.println("Imali ste " + brojacT + " tacnih odgovora i "
				+ brojacN + " netaènih odgovora.");
		ulaz.close();
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// korisnik unosi koliko želi pitanja
		System.out.println("Unesite broj pitanja:");
		try {
			int pitanja = ulaz.nextInt();
			// poziv metode
			oduzimanje(pitanja);

		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Unosite brojeve!");
			ulaz.close();
		}
	}
}
