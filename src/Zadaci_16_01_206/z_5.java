package Zadaci_16_01_206;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Bri�i�
 *
 */
/*
 * Napisati metodu koja prima jedan argument te simulira bacanje nov�i�a toliko
 * puta. Nakon �to se simulacija zavr�i, program ispisuje koliko puta je nov�i�
 * pokazao glavu a koliko puta pismo.
 */
public class z_5 {
	// pravimo metodu za simulaciju bacanja kovanice
	public static void simulacija(int a) {
		int i = 0;
		// postavljamo brojace
		int glava = 0;
		int pismo = 0;
		// petljom odradujemo simulaciju za broj koji upisemo
		while (i < a) {
			i++;
			// generisemo nasumican flip, 0 je za glava 1 je za pismo
			int flip = (int) (Math.random() * 2);
			if (flip == 0) {
				pismo++;
			} else
				glava++;
		}
		System.out.println("Kovanica je pokazala " + glava + " puta a "
				+ " pismo " + pismo + " puta.");

	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			System.out.println("Upi�ite koliko puta �elite simulaciju");

			int a = ulaz.nextInt();
			
			simulacija(a);
		} catch (InputMismatchException ex) {
			System.out.println("GRE�KA: Unesite broj za simulaciju!");
			ulaz.close();
		}
	}

}
