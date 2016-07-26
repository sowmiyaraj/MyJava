package com.dallas.sowmiya.bankmultithreading;

public class BankingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bankAccount = new BankAccount();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i = 0 ; i < 10 ; i ++)
			
		{
		
		WithdrawThread withDrawObj = new WithdrawThread();
		DepositThread depositObj = new DepositThread();
		
		withDrawObj.setBankAccount(bankAccount);
		depositObj.setBankAccount(bankAccount);
		
		Thread threadForDeposit = new Thread(depositObj);
		Thread threadForWithdraw = new Thread(withDrawObj);
		threadForDeposit.setName("Deposit thread  no  "+ i);
		threadForWithdraw.setName("withdrawthread no "+ i);
		threadForDeposit.start();
		threadForWithdraw.start();
		}

	}

}
