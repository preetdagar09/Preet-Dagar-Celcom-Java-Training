package com.celcom.day7;

class MyThread1 implements Runnable{
	 
	 public void run() {
		 for(int i = 1; i<=5;i++) {
			 System.out.println("My Thread running....");
			 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 }
	
}

public class MultiThreadingExample3 {
	public static void main(String args[]) throws InterruptedException {
		Thread obj1 = new Thread(new MyThread1());//Object creation is different here
		System.out.println(obj1.getState());
		obj1.setName("T1");
		System.out.println(obj1.getName());
		System.out.println(obj1.getPriority());
		
		obj1.start();
		
		Thread.sleep(3000);
		
		System.out.println("MAIN END");
		
		obj1.suspend();
		System.out.println(obj1.getState());
		obj1.resume();
		
	}
}
