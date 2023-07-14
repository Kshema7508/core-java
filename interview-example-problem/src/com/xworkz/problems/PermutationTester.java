package com.xworkz.problems;

import java.util.Scanner;

public class PermutationTester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		System.out.println("Enter the r ");
		int r=sc.nextInt();
		FactorialNo factorial=new FactorialNo();
		
		if(num>=r) {
			
			int permutation=factorial.findfacto(num)/factorial.findfacto(num-r);
			int combination=factorial.findfacto(num)/(factorial.findfacto(num-r)*factorial.findfacto(r));
			
			System.out.println("The permutation of "+num+" is "+permutation);
			System.out.println("The permutation of "+num+" is "+combination);
		}
	}
}
