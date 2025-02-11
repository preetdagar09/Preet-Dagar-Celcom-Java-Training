package com.celcom.day6;

public class GarbageCollectionEample1 {
	
	static int count;
	
	GarbageCollectionEample1(){
		count++;
		System.out.println(count);
	}
	
	@Override
	protected void finalize(){
		count--;
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollectionEample1 obj1 = new GarbageCollectionEample1();
		GarbageCollectionEample1 obj2 = new GarbageCollectionEample1();
		
		obj1 = null;
		System.gc();
		
		obj2 = null;
		Runtime.getRuntime().gc();
	}

}
