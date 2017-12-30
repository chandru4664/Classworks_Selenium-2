package com.htc.bankapp.main;


import java.util.ArrayList;

import com.htc.bankapp.dao.BankOperationsImpl;
import com.htc.bankapp.dto.Bank;
import com.htc.bankapp.dto.BankAccount;
import com.htc.bankapp.exceptions.InvalidAccountNumberException;

public class ExceptionMain {
	public static void main(String[] args) {
		
		Bank bank=new Bank();
		//BankAccount[] bankAccounts=new BankAccount[5];
		ArrayList<BankAccount> bankAccounts=new ArrayList<BankAccount>();
		
		
	//	bank.getBankAccounts().add(new BankAccount("12345","Gopi"));
		bankAccounts.add(new BankAccount("12345","Gopi"));
		bankAccounts.add(new BankAccount("1234567","John"));;
		bankAccounts.add(new BankAccount("123456","Dev"));
		
		//bankAccounts.add(new BankAccount("12345","Gopi"));
		//bankAccounts.add(new BankAccount("1234567","John"));;
		//bankAccounts.add(new BankAccount("123456","Dev"));
		
		bank.setIFSI("ICIC0012");
		bank.setName("ICICI");
		bank.setBranch("Chennai");
		bank.setBankAccounts(bankAccounts);
		
		BankOperationsImpl bankOperations=new BankOperationsImpl();
		bankOperations.setBank(bank);
		/*try {
			bankOperations.getAccount("1234");
		} catch (InvalidAccountNumberException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
			e1.printStackTrace();
		}*/
		/*try {
			System.out.println("before exception statement");
			//System.out.println("Account: "+bankOperations.getAccount("145"));
			System.out.println("Balance: "+bankOperations.getBalance("1233345"));			
			System.out.println("after exception statement");
		} catch (InvalidAccountNumberException e) {
			System.out.println("inside catch block");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("inside finally block");
		}
		System.out.println("after finally statement");*/
		
		System.out.println(bank.getBankAccounts().toString());
	}

}
