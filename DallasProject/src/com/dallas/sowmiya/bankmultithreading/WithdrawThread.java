package com.dallas.sowmiya.bankmultithreading;

public class WithdrawThread implements Runnable{

	BankAccount bankAccount;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	   	while(true){
	   		try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   		System.out.println("Withdraw thread is running name is "+ Thread.currentThread().getName());
	   		bankAccount.withdraw();
	   	}
	}
	public void setBankAccount(BankAccount bankAccount){
		this.bankAccount = bankAccount;
	}
}
