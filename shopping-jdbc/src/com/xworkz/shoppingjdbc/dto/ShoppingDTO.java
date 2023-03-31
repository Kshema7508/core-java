package com.xworkz.shoppingjdbc.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ShoppingDTO {

	private int id;
	@NotBlank
	@NotEmpty
	@NotNull
	@Size(min=2,max=16)
	private String name;
	private String email;
}
