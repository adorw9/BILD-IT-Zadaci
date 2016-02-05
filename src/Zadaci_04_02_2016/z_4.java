package Zadaci_04_02_2016;

import java.util.Date;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * The Account class
 */
public class z_4 {
	// osobine
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated;

	// konstruktori
	public z_4() {
		this.dateCreated = new java.util.Date();
	}

	public z_4(int id, double balance, double annualInterestRate,
			Date dateCreated) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = dateCreated;
	}

	// vrati id
	public int getId() {
		return id;
	}

	// vrati stanje
	public double getBalance() {
		return balance;
	}

	// postavi stanje
	public void setBalance(double balance) {
		this.balance = balance;
	}

	// vrati godišnju stopu
	public double getAnnualInterestRate() {
		return annualInterestRate / 100;
	}

	// vrati datum
	public java.util.Date getDate() {
		return dateCreated;
	}

	// metoda za mjeseènu stopu
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	// metoda za mjeseènu kamatu
	public double getMonthlyInterest() {
		return balance * (annualInterestRate / 12);
	}

	// metoda za uzimanje sredstava
	public void widthdraw(double amount) {
		if (amount < balance) {
			balance = balance - amount;
		}
	}

	// metoda za depozit
	public void deposit(double amount) {
		balance = balance + amount;
	}

}
