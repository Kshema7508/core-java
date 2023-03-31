package com.xworkz.shoppingjdbc.service;

import com.xworkz.shoppingjdbc.dto.ShoppingDTO;

public interface ShoppingService {

	abstract boolean validateAndSave(ShoppingDTO dto);
	abstract boolean readByEmail(String email);
	abstract boolean readByName(String name);
	abstract boolean readAll(ShoppingDTO dto);
	abstract boolean updateById(int id);
	abstract boolean updateByName(String name);
	abstract boolean updateByEmail(String email);
	abstract boolean deleteById(int id);
	abstract boolean deleteByEmail(String email);
}
