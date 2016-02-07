package Zadaci_06_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * The MyInteger class
 */
public class z_2 {

	// osobine
	private int value;

	// konstruktor
	public z_2(int value) {
		this.value = value;
	}

	// geter
	public int getValue() {
		return value;
	}

	// metode
	public boolean isEven() {
		return value % 2 == 0;
	}

	public boolean isOdd() {
		return value % 2 != 0;
	}

	public boolean isPrime() {
		for (int j = 2; j < value; j++) {
			if (value % j == 0) {
				return false;
			}
		}
		return true;
	}

	// static metode
	public static boolean isEven(int v) {
		return v % 2 == 0;
	}

	public static boolean isOdd(int v) {
		return v % 2 != 0;
	}

	public static boolean isPrime(int v) {
		for (int j = 2; j < v; j++) {
			if (v % j == 0) {
				return false;
			}
		}
		return true;
	}

	// static metode koje primaju objekat
	public static boolean isEven(z_2 obj) {
		return obj.getValue() % 2 == 0;
	}

	public static boolean isOdd(z_2 obj) {
		return obj.getValue() % 2 != 0;
	}

	public static boolean isPrime(z_2 obj) {
		for (int j = 2; j < obj.getValue(); j++) {
			if (obj.getValue() % j == 0) {
				return false;
			}
		}
		return true;
	}

	// metoda jednakost sa objektom
	public boolean equals(int v) {
		if (v == value) {
			return true;
		}
		return false;
	}

	// metoda jednakost objekata
	public boolean equals(z_2 obj) {
		if (obj.getValue() == value) {
			return true;
		}
		return false;
	}

	// metoda koja pretvara string u broj
	public static int parseInt(char[] str) {
		return Integer.parseInt(str.toString());
	}

	public static int parseInt(String str) {
		return Integer.parseInt(str);
	}
}
