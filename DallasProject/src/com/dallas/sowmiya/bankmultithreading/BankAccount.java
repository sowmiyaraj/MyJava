package com.dallas.sowmiya.bankmultithreading;

public class BankAccount {

	int balance = 0;
	
	public  void deposit(){
		synchronized (this) {
			if(balance == 0){
				balance = balance + 5;
				notifyAll();
		}else{
			System.out.println("Waitin to deposit...");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			}
		}
		printBalance();
	}
	public  void withdraw(){
		synchronized (this) {

			if(balance == 5 ){
				balance = balance - 5;
				notifyAll();
			}else{
				System.out.println("Waitin to withdraw...");
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		printBalance();
	}
	 void printBalance(){
		 System.out.println("balance is "+ balance);
	 }
	
}
