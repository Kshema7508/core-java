package com.xworkz.problems;

public class FactorialNo {

	public int findfacto(int number){
		int fact=1;
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		return fact;
	}
}
