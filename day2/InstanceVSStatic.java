package com.celcom.day2;

public class InstanceVSStatic {
	
	int a = 10;//Instance variable
	static int b = 10;//Static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVSStatic obj1 = new InstanceVSStatic();
		InstanceVSStatic obj2 = new InstanceVSStatic();
		//Instance 
		System.out.println(obj1.a);//10
		System.out.println(obj2.a);//10
		
		obj1.a = 20;
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		//static 
		System.out.println(obj1.b);
		System.out.println(obj2.b);
		obj1.b = 20;
		System.out.println(obj1.b);
		System.out.println(obj2.b);

	}

}
