package com.xworkz.problems;

public class LocalVariable {
	
	public void local() {
		int id=4;
		String name="Kshema";
		Long phoneNo=9876543210l;
		//System.out.println(id+" "+name+" "+phoneNo);
	}
	
	public static void main(String[] args) {
		/*int id=4;
		String name="Kshema";
		Long phoneNo=9876543210l;*/
		//System.out.println(id+" "+name+" "+phoneNo);
		LocalVariable localvariable=new LocalVariable();
		localvariable.local();
	}

}
