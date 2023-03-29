package com.xworkz.springmaven;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Laptop {

	private int id;
	private String laptopName;
	private String generation;
	private int price;
}
