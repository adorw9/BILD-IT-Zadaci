package Zadaci_12_02_2016;

import java.lang.IllegalArgumentException;
import java.util.Date;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * (IllegalArgumentException) Modify the Loan class in Listing 10.2 to throw
 * IllegalArgumentException if the loan amount, interest rate, or number of
 * years is less than or equal to zero.
 */
public class z_5 {

	// osobine
	public double godisnjaStopa;
	public int brojGodina;
	public double iznosKredita;
	public Date kreditDate;
	//konstruktor
	z_5(){
		this.godisnjaStopa = 2.5;
		this.brojGodina = 1;
		this.iznosKredita = 1000;
		this.kreditDate = new Date();
		
	}
	// konstruktor sa osobinama
	public z_5(double godisnjaStopa, int brojGodina, double iznosKredita) {
		IllegalArgumentException ex = new IllegalArgumentException();
		if (godisnjaStopa < 0 || brojGodina < 0 || iznosKredita < 0) {
			throw ex;
		}
		this.godisnjaStopa = godisnjaStopa;
		this.brojGodina = brojGodina;
		this.iznosKredita = iznosKredita;
		kreditDate = new Date();
	}

	// geteri i seteri
	public double getGodisnjaStopa() {
		return godisnjaStopa;
	}

	public int getBrojGodina() {
		return brojGodina;
	}

	public double getIznosKredita() {
		return iznosKredita;
	}

	public java.util.Date getKreditDate() {
		return kreditDate;
	}

	public void setGodisnjaStopa(double godisnjaStopa) {
		this.godisnjaStopa = godisnjaStopa;
	}

	public void setBrojGodina(int brojGodina) {
		this.brojGodina = brojGodina;
	}

	public void setIznosKredita(double iznosKredita) {
		this.iznosKredita = iznosKredita;
	}

	public void setKreditDate(java.util.Date kreditDate) {
		this.kreditDate = kreditDate;
	}

	// metoda za mjesecn placanje
	public double mjesec() {
		double mjesecnaKamata = godisnjaStopa / 1200;
		double mjesecno = iznosKredita * mjesecnaKamata
				/ (1 - (1 / Math.pow(1 + mjesecnaKamata, brojGodina * 12)));
		return mjesecno;
	}

	// metoda za ukupno plaæanje
	public double ukupno() {
		return mjesec() * brojGodina * 12;
	}
}
