package com.celcom.day7;

public class InnerClassExample1 {
	
	//1. Non-Static Inner class
	class InnerClass1{
		void myMethod1() {
			System.out.println(" Non-Static Inner Class ");
		}
	}
	
	//2. Static Inner Class
	static class InnerClass2{
		void myMethod2(){
			System.out.println("Static Inner Class");
		}
	}
	
	//3. Local Inner Class
	
	void myMethod() {
		class InnerClass3{
			void myMethod3(){
				System.out.println("Local Inner Class");
			}
		}
		
		InnerClass3 local = new InnerClass3();
		local.myMethod3();
	}

	public static void main(String args[]) {
		InnerClassExample1 obj = new InnerClassExample1();
		InnerClass1 inner1 = obj.new InnerClass1();
		inner1.myMethod1();
		

		InnerClassExample1.InnerClass2 inner2 = new InnerClassExample1.InnerClass2();
		inner2.myMethod2();
		
		obj.myMethod();
	
		
	}

}
