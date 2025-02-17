package com.celcom.day10;

class Buffer{
	private int itemCount = 0;
	private int capacity = 10;
	
	 synchronized void produce() throws InterruptedException {
		while(itemCount == capacity) {
			System.out.println("Buffer is full...Producer is waiting..");
			wait();
		}
		itemCount++;
		System.out.println("Produced an item. Item count : " + itemCount);
		notify();  //notifying the consumer that an item is available
	}
	 
	 synchronized void consume() throws InterruptedException {
		 while(itemCount == 0) {
			 System.out.println("No item is available in buffer. Consumer is waiting..");
			 wait();
		 }
		 itemCount--;
		 System.out.println("One item is consumed. Item count = " + itemCount);
		 notify();
	 }
	 
}

public class ProducerConsumerProblem {

	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		
		//Producer thread
		Thread producer = new Thread(() -> {
			
				try {
					for(int i = 0; i<=10; i++) {
						buffer.produce();
						Thread.sleep(500);
				} 
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
			}
		
		});
		
		Thread consumer = new Thread(() -> {
			try {
				for(int i = 0; i<=10; i++) {
					buffer.consume();
					Thread.sleep(500);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});
		
		producer.start();
		consumer.start();
		
		
		}

}
