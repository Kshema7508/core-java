package com.xworkz.springmaven;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Train {

	private int id;
	private String trainName;
	private String source;
	private String destination;
	
}
