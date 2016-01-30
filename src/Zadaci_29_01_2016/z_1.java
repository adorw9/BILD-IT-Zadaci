package Zadaci_29_01_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Napisati program koji nasumièno generiše cijeli broj izmeðu 1 i 12 te
 * ispisuje ime mjeseca za taj broj. (Januar za 1, Ferbruar za 2....)
 */
public class z_1 {

	public static void main(String[] args) {
		// nasumièno generisanje broja od 1 d 12
		int broj = (int) (Math.random() * 12 + 1);
		System.out.print(broj + " ");
		// ispis mjeseca
		if (broj == 1) {
			System.out.println("Januar");
		} else if (broj == 2) {
			System.out.println("Februar");
		} else if (broj == 3) {
			System.out.println("Mart");
		} else if (broj == 4) {
			System.out.println("April");
		} else if (broj == 5) {
			System.out.println("Maj");
		} else if (broj == 6) {
			System.out.println("Juni");
		} else if (broj == 7) {
			System.out.println("Juli");
		} else if (broj == 8) {
			System.out.println("August");
		} else if (broj == 9) {
			System.out.println("Septembar");
		} else if (broj == 10) {
			System.out.println("Oktobar");
		} else if (broj == 11) {
			System.out.println("Novembar");
		} else if (broj == 12) {
			System.out.println("Decembar");
		} else if (broj == 2) {
			System.out.println("Februar");
		}
	}

}
