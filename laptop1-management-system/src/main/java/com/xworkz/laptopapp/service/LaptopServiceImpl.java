package com.xworkz.laptopapp.service;

import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.laptopapp.dto.LaptopDTO;
import com.xworkz.laptopapp.repository.LaptopRepository;

@Service
public class LaptopServiceImpl implements LaptopService{

	@Autowired
	private LaptopRepository repo;
	
//	@Override
//	public boolean sendMail(String email) {
//		  
//		System.out.println("Inside sendMail");
//		
//		String portNumber="587";
//		String hostName="smtp.office365.com";
//		final String fromEmail="vijaykumarvini59@outlook.com";
//		final String password="Vij@y123";
//		String to=email;
//		
//		Properties prop=new Properties();
//		prop.put("mail.smtp.host", hostName);
//		prop.put("mail.smtp.port", portNumber);
//		prop.put("mail.smtp.starttls.enable", true);
//		prop.put("mail.debug",true);
//		prop.put("mail.smtp.auth", true);
//		prop.put("mail.transport.protocol", "smtp");
//		
//		Session session=Session.getInstance(prop, new Authenticator() {
//			@Override
//			protected PasswordAuthentication getPasswordAuthentication() {
//				return new PasswordAuthentication(fromEmail, password);
//			}
//		});
//		
//		MimeMessage message=new MimeMessage(session);
//		
//		try {
//			message.setFrom(new InternetAddress(fromEmail));
//			message.setSubject("Registration completed");
//			message.setText("Thanks for registering!!!");
//			//here we need to add code
//			message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
//			Transport.send(message);
//			
//		} catch (MessagingException e) {
//			e.printStackTrace();
//		}
//		
//		return true;
//	}  

	
	@Override
	public void validateAndSave(LaptopDTO dto) {
		
		System.out.println("Inside validate and save");

		
		boolean isCompanyName=false;
		boolean isModelNo=false;
		boolean isColor=false;
		boolean isProcessor=false;
		boolean isRam=false;
		
		if(dto.getCompanyName()!=null && !dto.getCompanyName().isEmpty()) {
		System.out.println("company name present");
			isCompanyName=true;
		}
			
		
		if(dto.getModelNo()!=null && !dto.getModelNo().isEmpty()) {
			System.out.println("model number present");
			isModelNo=true;
		}
		
		if(dto.getColor()!=null && !dto.getColor().isEmpty()) {
			System.out.println("color is present");
			isColor=true;
		}
		
		if(dto.getProcessor()!=null && !dto.getProcessor().isEmpty()) {
			System.out.println("processor is present");
			isProcessor=true;
		}
		
		if(dto.getRam()!=null && !dto.getRam().isEmpty()) {
			System.out.println("ram is present");
			isRam=true;
		}
			
		
		if(isCompanyName==true && isModelNo==true && isColor==true && isProcessor==true && isRam==true) {
			repo.saveLaptop(dto);
		
		}
		
//		LaptopServiceImpl im=new LaptopServiceImpl();
//		im.sendMail(dto.getEmail()); 
		//repo.saveLaptop(dto);
		
		return ;
	}

	@Override
	public List<LaptopDTO> getAllLaptopsSer() {
		System.out.println("Inside the getAllLaptops method");
		return repo.getAllLaptopRepo();
	}


	@Override
	public List<LaptopDTO> getByCompanyNameSer(String companyName) {
		
		System.out.println("Inside getByCompanyNameSer");
		
		return repo.getByCompanyNameRepo(companyName);

	}


	@Override
	public LaptopDTO getLaptopByIdSer(int id) {
		System.out.println("Inside getLaptopByIdSer");

		if(id>0) {
			
			return repo.getAllLaptopByIdRepo(id);
		}
		return null;
		 
	}


	@Override
	public void updateLaptopByIdSer(LaptopDTO dto) {
		System.out.println("Inside updateLaptopByIdSer");
		
		if(dto.getId()!=0 && dto.getCompanyName() !=null && dto.getModelNo()!=null && dto.getColor()!=null && dto.getProcessor()!=null && dto.getRam()!=null) {
			repo.updateLaptopByIdRepo(dto);
		}	
	}


	@Override
	public LaptopDTO deleteLaptopByIdSer(int id) {
		System.out.println("Inside deleteLaptopByIdSer");

		if(id>0) {
			
			return repo.deleteLaptopByIdRepo(id);
		}
		return null;
	}


}
