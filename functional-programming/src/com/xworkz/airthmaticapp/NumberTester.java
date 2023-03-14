package com.xworkz.airthmaticapp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class NumberTester {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(111);
		list.add(56);
		list.add(75);
		list.add(156);
		list.add(123);
		list.add(27);
		list.add(96);
		list.add(155);
		list.add(189);
		list.add(151);
		list.add(57);
		list.add(137);
		list.add(184);
		list.add(73);
		list.add(134);
		list.add(158);
		list.add(45);
		list.add(2);
		list.add(166);
		list.add(107);
		
		System.out.println("List of data using stream are");
		List<Integer> listOfGreaterNumber=list.stream().filter(integerValues -> (integerValues>100)).collect(Collectors.toList());
		System.out.println(listOfGreaterNumber);
		
		List<Integer> listOfLesserNumber=list.stream().filter(integerValues -> (integerValues<100)).collect(Collectors.toList());
		System.out.println(listOfLesserNumber);
	}
}
