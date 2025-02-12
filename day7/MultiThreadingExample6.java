package com.celcom.day7;

class Resource{
	private String data;
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
}

class Reader extends Thread{
	Resource resource;
	Reader(Resource resource){
		this.resource = resource;
	}
	
	public void run() {
		synchronized(resource) {
			System.out.println("Reader is waiting for writer to write the data");
			try {
				resource.wait();
			} catch(InterruptedException e) {
				
			}
			System.out.println("Data from reader : "+ resource.getData());
		}
	}
}


class Writer extends Thread{
	Resource resource;
	Writer(Resource resource){
		this.resource = resource;
	}
	
	public void run() {
		synchronized(resource) {
			System.out.println("Writer to writing the data....");
			resource.setData("Hello Reader");
			resource.notify();
			}
	}
}



public class MultiThreadingExample6 {
	public static void main(String args[]) throws InterruptedException{
		Resource resource = new Resource();
		Reader reader = new Reader(resource);
		reader.start();
		Thread.sleep(20000);
		Writer writer = new Writer(resource);
		writer.start();
		
	}
}
