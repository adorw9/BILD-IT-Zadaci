package Zadaci_19_01_2016;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Pretpostavimo da uplatimo $100 svaki mjesec na �tedni ra�un koji ima godi�nju
 * interesnu stopu od 5%. Mjese�na interesna stopa je stoga 0.05 / 12 = 0.00417.
 * Nakon prvog mjeseca vrijednost na ra�unu postaje 100 * (1 + 0.00417) =
 * 100.417. Nakon drugog mjeseca, vrijednost na ra�unu postaje (100 + 100.417) *
 * (1 + 0.00417) = 201.252. Nakon tre�eg mjeseca, vrijednost na ra�unu postaje
 * (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje. Napisati program koji
 * pita korisnika da unese mjese�ni iznos �tednje te broj mjeseci nakon kojeg bi
 * �elio znati stanje ra�una.
 */
public class z_1 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.print("Unesite mjese�ni iznos �tednje:");
		try{
		double iznos = ulaz.nextDouble();
		System.out.println("Unesite nakon koliko mjeseci �elite vidjeti stanje ra�una:");
		int mjesec = ulaz.nextInt();
		//izra�unavamo mjese�nu interesnu stopu
		double mjesecnaStopa =(0.05/12);
		//odredimo formulu za mjesece
		double mjeseci = Math.round((1+mjesecnaStopa)*100.0)/100.0;
		//unosimo nakon koliko mjeseci �elimo vidjeti stanje na ra�unu
		for (int i = 0; i < mjesec; i++){
			mjeseci = mjeseci + ( Math.round((iznos * (1+mjesecnaStopa))*100.0)/100.0);
		}
		System.out.println("Stanje:" + mjeseci);
		
		}catch (InputMismatchException ex) {
			System.out.println("GRE�KA: Neispravan unos podataka!");
			ulaz.close();
		}
	}
	}


