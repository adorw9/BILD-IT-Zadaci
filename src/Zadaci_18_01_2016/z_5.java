package Zadaci_18_01_2016;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji uèitava neodreðeni broj cijelih brojeva (nula prekida
 * unos) te ispisuje koliko je brojeva bilo iznad ili jednako prosjeku svih
 * unešenih brojeva a koliko je bilo brojeva ispod prosjeka. Pretpostavimo da je
 * maksimalan niz brojeva koje korisnik može unijeti 100.
 */
public class z_5 {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			// brojac sluzi za maksimalan niz brojeva koje korisnik unosi
			int brojac = 0;
			System.out.println("Unesite brojeve");
			int a = 1;
			// pravimo listu,kada korisnik ukuca 0 unos se prekida
			ArrayList<Integer> lista = new ArrayList<>();
			while (a != 0 || brojac == 100) {
				a = ulaz.nextInt();
				// u slucaju da je broj nula, brojac bi ga racunao i smatrao kao
				// unesen broj, što bi kasnije uticalo na rezultat
				if (a != 0) {
					brojac++;
					lista.add(a);
				}
			}
			// izraèunavamo sumu unesenih brojeva
			double suma = 0;
			for (double b : lista)
				suma += b;
			// izraèunavamo prosjek , tako što uzimamo sumu unsennih brojeva i
			// dijelimo je sa brojacem (nula se ne uzima u obzir!)
			double prosjek = suma / brojac;
			// brojaci sluze da prebrojimo ispod i iznad
			int brojacIspod = 0;
			int brojacIznad = 0;
			for (double b : lista)
				if (b < prosjek)
					brojacIspod++;
				else
					brojacIznad++;
			// ispis rezultata
			System.out.println("Prosjek: " + prosjek);
			System.out.println("Brojevi ispod prosjeka: " + brojacIspod
					+ "\nBrojevi jednaki ili iznad prosjeka: " + brojacIznad);
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}

}