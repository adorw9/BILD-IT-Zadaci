package Projekat_Kalendar;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * KALENDAR
 */
public class Kalendar_1 {
	// metoda za ispis kalendara
	public static void printKalendar(int godina, int mjesec) {
		// printaj naslov mjeseca
		printNaslovMjeseca(godina, mjesec);

		// printaj izgled mjeseca
		printMjesec(godina, mjesec);
	}

	// metoda za naslov mjeseca
	public static void printNaslovMjeseca(int godina, int mjesec) {
		System.out.println(" " + getImeMjeseca(mjesec) + " " + godina);
		System.out.println("_____________________________");
		System.out.println(" Pon Uto Sri Èet Pet Sub Ned");
	}

	// metoda za nazive mjeseci
	public static String getImeMjeseca(int mjesec) {
		String imeMjeseca = "";

		if (mjesec == 1)
			imeMjeseca = "Januar";
		else if (mjesec == 2)
			imeMjeseca = "Februar";
		else if (mjesec == 3)
			imeMjeseca = "Mart";
		else if (mjesec == 4)
			imeMjeseca = "April";
		else if (mjesec == 5)
			imeMjeseca = "Maj";
		else if (mjesec == 6)
			imeMjeseca = "Juni";
		else if (mjesec == 7)
			imeMjeseca = "Juli";
		else if (mjesec == 8)
			imeMjeseca = "August";
		else if (mjesec == 9)
			imeMjeseca = "Septembar";
		else if (mjesec == 10)
			imeMjeseca = "Oktobar";
		else if (mjesec == 11)
			imeMjeseca = "Novembar";
		else
			imeMjeseca = "Decembar";
		return imeMjeseca;
	}

	// metoda za izgled mjeseca
	public static void printMjesec(int godina, int mjesec) {
		// startni dan sedmice za prvi datum u mjesecu
		int startDan = getStartDan(godina, mjesec);

		// broj dana u mjesecu
		int brojDanaMjeseca = getBrojDanaMjeseca(godina, mjesec);

		// ubaci space prije prvog dana u mjesecu
		int i = 0;
		for (i = 0; i < startDan; i++)
			System.out.print("    ");

		for (i = 1; i <= brojDanaMjeseca; i++) {
			System.out.printf("%4d", i);

			if ((i + startDan) % 7 == 0)
				System.out.println();
		}

		System.out.println();
	}

	// metoda za poèetak dana od 1/mjeseca/godina
	public static int getStartDan(int godina, int mjesec) {
		final int START_DAY_FOR_JAN_1_1800 = 2;
		// ukupan broj dana od 1/1/1800 do 1/x/x
		int ukupanBrojDana = getUkupanBrojDana(godina, mjesec);

		// vrati poèetni dan
		return (ukupanBrojDana + START_DAY_FOR_JAN_1_1800) % 7;
	}

	// metoda za dane od prvog januara 1800
	public static int getUkupanBrojDana(int godina, int mjesec) {
		int ukupno = 0;

		// pronadji dane od 1800 do 1/1/godine
		for (int i = 1800; i < godina; i++)
			if (prijestupnaGodina(i))
				ukupno = ukupno + 366;
			else
				ukupno = ukupno + 365;

		// dodaj dane do januara
		for (int i = 1; i < mjesec; i++)
			ukupno = ukupno + getBrojDanaMjeseca(godina, i);

		return ukupno;
	}

	// metoda za broj dana u mjesecu
	public static int getBrojDanaMjeseca(int godina, int mjesec) {
		if (mjesec == 1 || mjesec == 3 || mjesec == 5 || mjesec == 7
				|| mjesec == 8 || mjesec == 10 || mjesec == 12)
			return 31;

		if (mjesec == 4 || mjesec == 6 || mjesec == 9 || mjesec == 11)
			return 30;

		if (mjesec == 2)
			return prijestupnaGodina(godina) ? 29 : 28;
		// ako mjesec nije tacan vrati 0
		return 0;
	}

	// metoda za prijestupnu godinu
	public static boolean prijestupnaGodina(int godina) {
		return godina % 400 == 0 || (godina % 4 == 0 && godina % 100 != 0);
	}
}
