package Zadaci_22_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (Fibonacci numbers) Rewrite the fib method in Listing 18.2 using iterations.
 * Hint: To compute fib(n) without recursion, you need to obtain fib(n - 2) and
 * fib(n - 1) first. Let f0 and f1 denote the two previous Fibonacci numbers.
 * The current Fibonacci number would then be f0 + f1. The algorithm can be
 * described as follows: f0 = 0; // For fib(0) f1 = 1; // For fib(1) for (int i
 * = 1; i <= n; i++) { currentFib = f0 + f1; f0 = f1; f1 = currentFib; } //
 * After the loop, currentFib is fib(n) Write a test program that prompts the
 * user to enter an index and displays its Fibonacci number.
 */
public class z_1 {
	// metoda za fibonacci
	public static long fib(long index) {
		long fib = 0;
		long fib1 = 0;
		long fib2 = 1;
		// sabiremo broj sa prethodnim
		for (int i = 1; i < index; i++) {
			System.out.println(fib2);
			fib = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib;
		}
		return fib;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			// korisnik unos
			System.out.println("Unesite index za Fibonacci broj: ");
			int i = ulaz.nextInt();
			// pozivanj metode i ispis
			System.out.println("Fibonacci broj na indeksu " + i + " je "
					+ fib(i));
		} catch (InputMismatchException ex) {
			System.out.println("GREŠKA!Pogrešan unos!");
			ulaz.close();
		}

	}

}
