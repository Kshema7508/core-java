package com.xworkz.springmaven;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString 
public class FoodStall {
	
	private int id;
	private String name;
	private String location;
	private String state;
}
