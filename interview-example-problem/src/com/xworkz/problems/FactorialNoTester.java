package com.xworkz.problems;

import java.util.Scanner;

public class FactorialNoTester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int number=sc.nextInt();
		FactorialNo factorial=new FactorialNo();
		if(number>0) {
			
			int fact=factorial.findfacto(number);
			
			System.out.println("The factorial of "+number+" is "+fact);
			}                                   
	}
}