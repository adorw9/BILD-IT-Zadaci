package Zadaci_21_01_2016;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Pozitivni cijeli broj je savr�en broj ukoliko je jednak zbiru svih svojih
 * pozitivnih djelilaca, isklju�uju�i sebe. Na primjer, 6 je prvi savr�eni broj
 * jer 6 = 3 + 2 + 1. Sljede�i savr�eni broj je 28 jer 28 = 14 + 7 + 4 + 2 + 1.
 * Samo 4 savr�ena broja postoje u rasponu od 0 do 10.000. Napi�ite program koji
 * ispisuje sva 4.
 */
public class z_4 {

	// metoda za provjeru brojeva
	public static int brojevi(int a) {
		int suma = 0;
		// trazimo brojeve od 1 do 10000
		for (int i = 1; i < a; i++)
			if (a % i == 0)
				suma += i;

		if (suma == a)
			return 1;
		else
			return 0;

	}

	// metoda za pronalazak savrsenih brojeva
	public static int savrseniBrojevi(int a) {
		int broj = 1;
		// pozivamo metodu brojevi da bi provjerili da li je broj savr�en
		while (broj <= a) {
			if (brojevi(broj) == 1)
				System.out.println(broj + " je savr�en broj.");
			broj++;

		}
		return broj;
	}

	public static void main(String[] args) {

		savrseniBrojevi(10000);

	}

}
