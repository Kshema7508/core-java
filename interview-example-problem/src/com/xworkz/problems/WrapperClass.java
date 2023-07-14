package com.xworkz.problems;

public class WrapperClass {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Calling finalise method to clean the object from the memory after the object make as null");
	}

	public static void main(String[] args) {
		
		WrapperClass wrapper=new WrapperClass();
		
		WrapperClass wrapper1=new WrapperClass();
	
		
		//wrapper=null;
		wrapper=wrapper1;
		
		System.gc();
		
		int a=55;
		Integer a1=a;
		
		long l=9876543210l;
		Long lg=l;
		
		char ch='B';
		Character character=ch;
		
		short s=12;
		Short sh=s;
		
		byte by=2;
		Byte b=by;
		
		double d=59.00;
		Double dou=d;
		
		float f=20.0f;
		Float fl=f;
		
		boolean bool=false;
		Boolean boo=bool;
		

		byte i=78;
		int i1=i;//widenning(implicit)
		short j=(short) i1;//narrowing(explicit)
		
		
		
		
		String age="53";
		int age1=Integer.parseInt(age);
		System.out.println(age1);
			
		long age2=Long.parseLong(age);
		System.out.println(age2);
		
		byte age3=Byte.parseByte(age);
		System.out.println(age3);
		
		short age4=Short.parseShort(age);
		System.out.println(age4);
		
		double age5=Double.parseDouble(age);
		System.out.println(age5);
		
		float age6=Float.parseFloat(age);
		System.out.println(age6);
		
		boolean age7=Boolean.parseBoolean(age);
		System.out.println(age7);
		
	}
}
