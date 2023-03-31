package com.xworkz.shoppingjdbc.boot;

import com.xworkz.shoppingjdbc.dto.ShoppingDTO;
import com.xworkz.shoppingjdbc.repository.ShoppingRepository;
import com.xworkz.shoppingjdbc.repository.shoppingRepositoryImplementation;
import com.xworkz.shoppingjdbc.service.ShoppingService;
import com.xworkz.shoppingjdbc.service.ShoppingServiceImplementation;

public class ShoppingRunner {

	public static void main(String[] args) {
		
		System.out.println("This is MVC project");
		ShoppingDTO dto=new ShoppingDTO(5, "Easybuy", "easybuy@gmail.com");
		
		ShoppingRepository repository=new shoppingRepositoryImplementation();
		ShoppingService service=new ShoppingServiceImplementation(repository);
		service.validateAndSave(dto);
		service.readByEmail("max@gmail.com");
		service.readByName("Easybuy");
		service.readAll(dto);
		service.updateById(2);
		service.updateByName("Justbake");
		service.updateByEmail("max@gmail.com");
		service.deleteById(4);
		service.deleteByEmail("naturals@gmail.com");
	}
}
