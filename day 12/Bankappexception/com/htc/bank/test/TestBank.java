package com.htc.bank.test;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.htc.bankapp.dao.BankOperationsImpl;
import com.htc.bankapp.dto.Bank;
import com.htc.bankapp.dto.BankAccount;
import com.htc.bankapp.exceptions.InvalidAccountNumberException;

public class TestBank {
	
	
	static BankOperationsImpl bankOperations;
	@BeforeClass
	public static void testInitialization()
	{
		Bank bank=new Bank();
		ArrayList<BankAccount> bankAccounts=new ArrayList<BankAccount>();
		bankAccounts.add(new BankAccount("12345","Gopi"));
		bankAccounts.add(new BankAccount("1234567","Sayooj"));;
		bankAccounts.add(new BankAccount("123456","Dev"));
		bank.setIFSI("ICIC0012");
		bank.setName("ICICI");
		bank.setBranch("Chennai");
		bank.setBankAccounts(bankAccounts);
	   bankOperations=new BankOperationsImpl();
		bankOperations.setBank(bank);
	}
	@Test
	public  void testGetAllAccounts() {
		try {
			System.out.println(bankOperations.getBank());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testDeposit() {
		try {
			System.out.println(bankOperations.deposit("12345", 5000.00));
		} catch (InvalidAccountNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testWithdraw() {
		try {
			System.out.println(bankOperations.withdraw("123456",500.00));
		} catch (InvalidAccountNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(expected=InvalidAccountNumberException.class)
	public void testInvalidSccountException() throws InvalidAccountNumberException
	{
		bankOperations.withdraw("11111",500.00);
	}
}
