package Zadaci_19_01_2016;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Pretpostavimo da uplatimo $100 svaki mjesec na štedni raèun koji ima godišnju
 * interesnu stopu od 5%. Mjeseèna interesna stopa je stoga 0.05 / 12 = 0.00417.
 * Nakon prvog mjeseca vrijednost na raèunu postaje 100 * (1 + 0.00417) =
 * 100.417. Nakon drugog mjeseca, vrijednost na raèunu postaje (100 + 100.417) *
 * (1 + 0.00417) = 201.252. Nakon treæeg mjeseca, vrijednost na raèunu postaje
 * (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje. Napisati program koji
 * pita korisnika da unese mjeseèni iznos štednje te broj mjeseci nakon kojeg bi
 * želio znati stanje raèuna.
 */
public class z_1 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.print("Unesite mjeseèni iznos štednje:");
		try{
		double iznos = ulaz.nextDouble();
		System.out.println("Unesite nakon koliko mjeseci želite vidjeti stanje raèuna:");
		int mjesec = ulaz.nextInt();
		//izraèunavamo mjeseènu interesnu stopu
		double mjesecnaStopa =(0.05/12);
		//odredimo formulu za mjesece
		double mjeseci = Math.round((1+mjesecnaStopa)*100.0)/100.0;
		//unosimo nakon koliko mjeseci želimo vidjeti stanje na raèunu
		for (int i = 0; i < mjesec; i++){
			mjeseci = mjeseci + ( Math.round((iznos * (1+mjesecnaStopa))*100.0)/100.0);
		}
		System.out.println("Stanje:" + mjeseci);
		
		}catch (InputMismatchException ex) {
			System.out.println("GREŠKA: Neispravan unos podataka!");
			ulaz.close();
		}
	}
	}


