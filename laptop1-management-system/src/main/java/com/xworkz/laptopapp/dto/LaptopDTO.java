package com.xworkz.laptopapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LaptopDTO {

	private int id;
	private String companyName;
	private String modelNo;
	private String color;
	private String processor;
	private String ram;
	private String email;
}