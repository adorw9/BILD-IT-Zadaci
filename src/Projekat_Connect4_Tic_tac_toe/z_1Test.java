package Projekat_Connect4_Tic_tac_toe;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Game: play a tic-tac-toe game
 */
import java.util.Scanner;

public class z_1Test {

	public static void main(String[] args) {
		char igrac = 'o';
		int r, k;
		Scanner ulaz = new Scanner(System.in);
		// pravimo objekat iksoks
		z_1 iksoks = new z_1();

		iksoks.Igra();

		// mjenjamo igraèe pozivajuci metodu iz klase z_1
		while (true) {
			igrac = iksoks.promjeniIgraca(igrac);
			System.out.print(igrac + " ,izaberite mjesto(red,kolona):");
			r = ulaz.nextInt();
			k = ulaz.nextInt();
			// provjeravamo da li je lokacija zauzeta ili van dosega
			while (iksoks.provjeraTable(r, k)) {
				System.out
						.println("Mjesto je zauzeto ili izvan dosega. Pokušajte ponovo!");
				iksoks.prikaziBoard();
				r = ulaz.nextInt();
				k = ulaz.nextInt();
			}
			// mjenjamo board i prikazujemo novi
			iksoks.promjeniBoard(igrac, r, k);
			iksoks.prikaziBoard();
			// prolasavamo pobjednika
			if (iksoks.pobjednik()) {
				System.out.println("\nPobjednik je " + igrac + " !");
				break;

			}
			// u slucajnu da je nerijeseno
			if (iksoks.nerijeseno()) {
				System.out.println("\nNERIJEŠENO!");
				ulaz.close();
				break;
			}
		}

	}

}
