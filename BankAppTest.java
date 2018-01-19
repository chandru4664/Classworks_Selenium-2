package com.htc.bankapp.test;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import com.htc.bankapp.dao.BankOperationsImpl;
import com.htc.bankapp.dto.Bank;
import com.htc.bankapp.dto.BankAccount;
import com.htc.bankapp.exceptions.InvalidAccountNumberException;

import junit.framework.Assert;

public class BankAppTest {

	static BankOperationsImpl bankOperations;

	static {
		bankOperations = new BankOperationsImpl();
	}

	@BeforeClass
	public static void prepareTestClass() {
		Bank bank = new Bank();
		ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();

		bank.getBankAccounts().add(new BankAccount("12345", "Gopi"));
		bankAccounts.add(new BankAccount("12345", "Gopi"));
		bankAccounts.add(new BankAccount("1234567", "John"));

		bankAccounts.add(new BankAccount("123456", "Dev"));

		/*
		 * bankAccounts.add(new BankAccount("12345", "Gopi")); bankAccounts.add(new
		 * BankAccount("1234567", "John"));
		 * 
		 * bankAccounts.add(new BankAccount("123456", "Dev"));
		 */

		bank.setIFSI("ICIC0012");
		bank.setName("ICICI");
		bank.setBranch("Chennai");
		bank.setBankAccounts(bankAccounts);

		bankOperations.setBank(bank);
	}

	@Test(expected = InvalidAccountNumberException.class)
	public void testWithdraw() throws InvalidAccountNumberException {
		try {
			bankOperations.withdraw("1234", 400.00);
			System.out.println(bankOperations.getBalance("1234"));
		} catch (InvalidAccountNumberException e) {

			throw e; // Exception re-throwing

		}

	}
	
	@Test(expected=InvalidAccountNumberException.class)
	public void testDeposit() throws InvalidAccountNumberException {
		boolean depositFlag= bankOperations.deposit("12345", 10000.00);
		
	}
	@Test(timeout=5000)
	public void testLoop() {
		for(int i=1;i>0;i++) {
			System.out.println("Test cycle: "+i);
		}
	}
}