package com.atm.project;

import java.io.IOException;


public class ATM extends Menu {
	public static void main(String[] args) throws IOException {
		Menu M = new Menu();
		display();
		M.getLogin();
	}
	
	public static  void display() {

		System.out.println("====================================================================");
		System.out.println("=================== Welcome To The ATM Machine =====================");
		System.out.println("====================================================================");
}
}



/* Saved ATM Numbers and PIN  */

/* 1) ATM Numbers:123456789   PIN:1234 */

/* 2) ATM Numbers:123456780  PIN:1230  */