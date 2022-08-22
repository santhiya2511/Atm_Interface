package com.atm.project;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'₹'##,##,###.00");
	

	/* Set the customer number */

	public int setAtmCardNumber(int AtmCardNumber) {
		this.AtmCardNumber = AtmCardNumber;
		return AtmCardNumber;
	}

	/* Get the ATM Card Number */

	public int getAtmCardNumber() {
		return AtmCardNumber;
	}

	/* Set the pin number */

	public int setPinNumber(int PinNumber) {
		this.PinNumber = PinNumber;
		return PinNumber;
	}

	/* Get the pin number */

	public int getPinNumber() {
		return PinNumber;
	}

	/* Get Current Account Balance */

	public double getCurrentBalance() {
		return CurrentBalance;
	}

	/* Get Saving Account Balance */

	public double getSavingBalance() {
		return savingBalance;
	}

	/* Calculate Current Account withdrawal */

	public double calcCurrentWithdraw(double amount) {
		CurrentBalance = (CurrentBalance - amount);
		return CurrentBalance;
	}

	/* Calculate Saving Account withdrawal */

	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}

	/* Calculate Current Account deposit */

	public double calcCurrentDeposit(double amount) {
		CurrentBalance = (CurrentBalance + amount);
		return CurrentBalance;
	}

	/* Calculate Saving Account deposit */

	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}

	/* Customer Current Account Withdraw input */

	public void getCurrentWithdrawInput() {
		System.out.println("Current Account Balance: " + moneyFormat.format(CurrentBalance));
		System.out.print("Amount you want to withdraw from Current Account: ");
		double amount = input.nextDouble();

		if ((CurrentBalance - amount) >= 0) {
			calcCurrentWithdraw(amount);
			System.out.println("New Current Account balance: " + moneyFormat.format(CurrentBalance) + "\n");
		} else {
			System.out.println("Insufficient Balance to withdraw." + "\n");
		}
	}

	/* Customer Saving Account Withdraw input */

	public void getSavingWithdrawInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.print("Amount you want to withdraw from Saving Account: ");
		double amount = input.nextDouble();

		if ((savingBalance - amount) >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("New Saving Account balance: " +  moneyFormat.format(savingBalance) + "\n");
		} else {
			System.out.println("Insufficient Balance to withdraw." + "\n");
		}
	}

	/* Customer Current Account Deposit input */

	public void getCurrentDepositInput() {
		System.out.println("Current Account Balance: " + moneyFormat.format(CurrentBalance));
		System.out.print("Amount you want to deposit in Current Account: ");
		double amount = input.nextDouble();

		if ((CurrentBalance + amount) >= 0) {
			calcCurrentDeposit(amount);
			System.out.println("New Current Account balance: " + moneyFormat.format(CurrentBalance) + "\n");
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}

	/* Customer Saving Account Deposit input */

	public void getSavingDepositInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.print("Amount you want to deposit in Saving Account: ");
		double amount = input.nextDouble();

		if ((savingBalance + amount) >= 0) {
			calcSavingDeposit(amount);
			System.out.println("New Saving Account balance: " + moneyFormat.format(savingBalance) + "\n");
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}

	private int AtmCardNumber;
	private int PinNumber;
	private double CurrentBalance = 150000;
	private double savingBalance = 200000;
}