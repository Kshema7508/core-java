package com.xworkz.shoppingjdbc.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.shoppingjdbc.dto.ShoppingDTO;
import com.xworkz.shoppingjdbc.repository.ShoppingRepository;
import com.xworkz.shoppingjdbc.repository.shoppingRepositoryImplementation;

public class ShoppingServiceImplementation implements ShoppingService{

	ShoppingRepository shoppingRepository;
	
	public ShoppingServiceImplementation() {
		System.out.println("ShoppingServiceImplementation");
	}
	
	public ShoppingServiceImplementation(ShoppingRepository shoppingRepository) {
		this.shoppingRepository=shoppingRepository;
	}
	
	@Override
	public boolean validateAndSave(ShoppingDTO dto) {
		System.out.println("This is valiateAndsave");
		
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator valid=factory.getValidator();
		Set<ConstraintViolation<ShoppingDTO>> violationMessages=valid.validate(dto);
		if(violationMessages.isEmpty()) {
			boolean save=this.shoppingRepository.onSave(dto);
			System.out.println(save);
		}
		return true;
	}

	@Override
	public boolean readByEmail(String email) {
		if(email!=null) {
			System.out.println("Read by Email");
			boolean read=this.shoppingRepository.readByEmail(email);
			System.out.println(read);
		}
		return true;
	}

	@Override
	public boolean readByName(String name) {
		if(name!=null) {
			System.out.println("Read by Name");
			boolean read=this.shoppingRepository.readByName(name);
			System.out.println(read);
		}
		return true;
	}

	@Override
	public boolean readAll(ShoppingDTO dto) {
		if(dto!=null) {
			System.out.println("Read All");
			boolean read=this.shoppingRepository.readAll(dto);
			System.out.println(read);
		}
		return true;
	}

	@Override
	public boolean updateById(int id) {
		if(id!=0) {
			System.out.println("Update by Id");
			boolean update=this.shoppingRepository.updateById(id);
			System.out.println(update);
		}
		return true;
	}

	@Override
	public boolean updateByName(String name) {
		if(name!=null) {
			System.out.println("Update by name");
			boolean update=this.shoppingRepository.updateByName(name);
			System.out.println(update);
		}
		return true;
	}

	@Override
	public boolean updateByEmail(String email) {
		if(email!=null) {
			System.out.println("Update by Email");
			boolean update=this.shoppingRepository.updateByEmail(email);
			System.out.println(update);
		}
		return true;
	}

	@Override
	public boolean deleteById(int id) {
		if(id!=0) {
			System.out.println("Delete by Id");
			boolean delete=this.shoppingRepository.deleteById(id);
			System.out.println(delete);
		}
		return true;
	}

	@Override
	public boolean deleteByEmail(String email) {
		if(email!=null) {
			System.out.println("Delete by Email");
			boolean delete=this.shoppingRepository.deleteByEmail(email);
			System.out.println(delete);
		}
		return true;
	}

	
}
