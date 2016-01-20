package Zadaci_19_01_2016;
import java.util.Random;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji simulira nasumièno izvlaèenje karte iz špila od 52
 * karte. Program treba ispisati koja karta je izvuèena (A, 2, 3, 4, 5, 6, 7, 8,
 * 9, 10, J, Q ili K) te znak u kojem je data karta (Srce, Pik, Djetelina,
 * Kocka). Primjer: Karta koju ste izvukli je 10 u znaku kocke.
 */
public class z_2 {

	public static void main(String[] args) {

		Random rand = new Random();
		// pravimo string niz za karte
		String[] karte = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K" };
		// pravimo string niz za znakove
		String[] znak = { "Pik", "Tref", "Srce", "Karo" };

		// ispis rezultata, za naumièno odreðivanje karte i znaka koristimo
		// java.util.Random
		System.out.println("Karta koju ste izvukli je: ");
		System.out.print(karte[rand.nextInt(karte.length)] + " u znaku  ");
		System.out.println(znak[rand.nextInt(znak.length)]);

	}
}
