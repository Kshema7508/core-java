package com.xworkz.airthmaticapp;

import com.xworkz.airthmaticapp.airthmatic.Addition;
import com.xworkz.airthmaticapp.airthmatic.Division;
import com.xworkz.airthmaticapp.airthmatic.Multiplication;
import com.xworkz.airthmaticapp.airthmatic.Subtraction;

public class Tester {

	public static void main(String[] args) {
		Addition addition=(num1,num2) -> {
			System.out.println("Add method started");
			System.out.println(num1+num2);
			System.out.println("Add method ended");
		};
		addition.add(10,20);
		
		Subtraction subtraction=(num1,num2) -> {
			System.out.println("Subtraction method started");
			System.out.println(num1-num2);
			System.out.println("Substraction method ended");
		};
		subtraction.sub(90, 50);
		
		Multiplication multiplication=(num1,num2) -> {
			System.out.println("Multiplication method started");
			System.out.println(num1*num2);
			System.out.println("Multiplication method ended");
		};
		multiplication.multiply(10, 15);
		
		Division division=(num1,num2) -> {
			System.out.println("Division method started");
			System.out.println(num1/num2);
			System.out.println("Division method ended");
		};
		division.divide(10, 5);
	}
}
