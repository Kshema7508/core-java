package com.xworkz.airthmaticapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DifferentTester {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(35);
		list.add(12);
		list.add(786);
		list.add(56);
		list.add(2);
		list.add(111);
		
		System.out.println("List of data using iterator are");
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			Integer integerValue=itr.next();
			if(integerValue%2==0) {
				System.out.println(integerValue);
			}
		}
		System.out.println("Filtering");
		List<Integer> listOfEvenNumber = list.stream().filter(integerValue -> (integerValue%2==0)).collect(Collectors.toList());
		System.out.println(listOfEvenNumber);
		System.out.println("List of data using stream are");
		list.stream().forEach(integerValue-> System.out.println(integerValue));
	}
}
