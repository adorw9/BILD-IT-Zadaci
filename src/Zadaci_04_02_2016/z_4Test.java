package Zadaci_04_02_2016;

/**
 * @author Adnan Bri�i�
 *
 */
public class z_4Test {

	public static void main(String[] args) {
		// pravmo account objekt i postavljamo podatke
		z_4 account = new z_4(1122, 20000, 4.5, new java.util.Date());
		// uzimamo sa ra�una
		account.widthdraw(2500);
		// dodajemo na ra�un
		account.deposit(3000);

		// ispis rezultata
		System.out.println("Trenutno stanje " + account.getBalance() + " $.");
		System.out.println("Mjese�na kamata " + account.getMonthlyInterest());
		System.out.println("Account je kreiran " + account.getDate());

	}

}
