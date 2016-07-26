package com.dallas.sowmiya.bankmultithreading;

public class DepositThread implements Runnable{
    
	BankAccount bankAccount;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	   	while(true){
	   		try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   		System.out.println("Deposit thread is running name is "+ Thread.currentThread().getName());
	   		bankAccount.deposit();
	   	}
	}
	public void setBankAccount(BankAccount bankAccount){
		this.bankAccount = bankAccount;
	}
	

}
