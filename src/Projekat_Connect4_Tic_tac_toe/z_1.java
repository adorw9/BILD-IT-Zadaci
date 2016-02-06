package Projekat_Connect4_Tic_tac_toe;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Game: play a tic-tac-toe game
 */
public class z_1 {
	// pravimo tablu 3x3
	char[][] tabla = new char[3][3];

	// postavljamo igru
	public void Igra() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tabla[i][j] = ' ';
			}
		}
	}

	// provjeravamo da li je tabla 3x3
	public boolean provjeraTable(int r, int k) {
		if ((r > 2 || k > 2) || (r < 0 || k < 0)) {
			return true;

		} else if (tabla[r][k] == 'x' || tabla[r][k] == 'o') {
			return true;
		}
		return false;
	}

	// metoda za promjenu board-a
	public void promjeniBoard(char igrac, int r, int k) {
		tabla[r][k] = igrac;

	}

	// metoda za prikaz Board-a
	public void prikaziBoard() {

		System.out.println("  0  " + tabla[0][0] + "|" + tabla[0][1] + "|"
				+ tabla[0][2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + tabla[1][0] + "|" + tabla[1][1] + "|"
				+ tabla[1][2]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + tabla[2][0] + "|" + tabla[2][1] + "|"
				+ tabla[2][2]);
		System.out.println("     0 1 2 ");
	}

	// metoda za promjenu igraca
	public char promjeniIgraca(char igrac) {
		char noviPotez = 'e';
		if (igrac == 'o') {
			noviPotez = 'x';
		}
		if (igrac == 'x') {
			noviPotez = 'o';
		}
		return noviPotez;
	}

	// provjeravamo pobjednika
	public boolean pobjednik() {
		if (tabla[0][0] == tabla[1][0] && tabla[1][0] == tabla[2][0]
				&& (tabla[0][0] == 'x' || tabla[0][0] == 'o')) {
			return true;
		} else if (tabla[0][1] == tabla[1][1] && tabla[1][1] == tabla[2][1]
				&& (tabla[0][1] == 'x' || tabla[0][1] == 'o')) {
			return true;
		} else if (tabla[0][2] == tabla[1][2] && tabla[1][2] == tabla[2][2]
				&& (tabla[0][2] == 'x' || tabla[0][2] == 'o')) {
			return true;
		} else if (tabla[0][0] == tabla[0][1] && tabla[0][1] == tabla[0][2]
				&& (tabla[0][0] == 'x' || tabla[0][0] == 'o')) {
			return true;
		} else if (tabla[1][0] == tabla[1][1] && tabla[1][1] == tabla[1][2]
				&& (tabla[1][0] == 'x' || tabla[1][0] == 'o')) {
			return true;
		} else if (tabla[2][0] == tabla[2][1] && tabla[2][1] == tabla[2][2]
				&& (tabla[2][0] == 'x' || tabla[2][0] == 'o')) {
			return true;
		} else if (tabla[0][0] == tabla[1][1] && tabla[1][1] == tabla[2][2]
				&& (tabla[0][0] == 'x' || tabla[0][0] == 'o')) {
			return true;
		} else if (tabla[2][0] == tabla[1][1] && tabla[1][1] == tabla[0][2]
				&& (tabla[2][0] == 'x' || tabla[2][0] == 'o')) {
			return true;
		} else {
			return false;
		}
	}

	// provjera ukoliko je neriješeno
	public boolean nerijeseno() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (tabla[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

}