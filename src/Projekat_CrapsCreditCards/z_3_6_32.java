package Projekat_CrapsCreditCards;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Game: chance of winning at craps) Revise Exercise 6.30 to run it 10,000
 * times and display the number of winning games.
 */
public class z_3_6_32 {
	public static void main(String[] args) {
		int brojac = 0;
		int brojac1 = 0;
		for (int i = 1; i <= 10000; i++) {
			boolean craps = true;
			// bacanje kockica
			int kocka1 = (int) ((Math.random() * 6) + 1);
			int kocka2 = (int) ((Math.random() * 6) + 1);

			int suma = kocka1 + kocka2;
			System.out.println(i + "." + "You rolled " + kocka1 + " + "
					+ kocka2 + " = " + suma);
			// ako je suma 2,3,12 gubimo
			if (suma == 2 || suma == 3 || suma == 12) {
				brojac1++;
				craps = false;
				System.out.println("-------------------------->You LOSE!");
				// ako je suma 7,11 pobjedujemo
			} else if (suma == 7 || suma == 11) {
				brojac++;
				craps = false;
				System.out.println("-------------------------->You WIN!");
			} else

				System.out.println("POINT " + suma);
			int pom = suma;
			// petljom nastavljamo igru u skladu sa pravilima
			while (craps) {
				int novaKocka1;
				int novaKocka2;
				novaKocka1 = (int) ((Math.random() * 6) + 1);
				novaKocka2 = (int) ((Math.random() * 6) + 1);
				int novaSuma = novaKocka1 + novaKocka2;
				System.out.println("You rolled " + novaKocka1 + " + "
						+ novaKocka2 + " = " + novaSuma);
				if (novaSuma == pom) {
					brojac++;
					craps = false;
					System.out.println("-------------------------->You WIN!");
				} else if (novaSuma == 7) {
					brojac1++;
					craps = false;
					System.out.println("-------------------------->You LOSE!");
				} else {
					pom = novaSuma;
					System.out.println("POINT " + pom);

				}
			}

		}
		System.out.println("Ukupno ste pobijedili " + brojac + " puta.");
		System.out.println("Ukupno ste izgubili " + brojac1 + " puta.");

	}
}
