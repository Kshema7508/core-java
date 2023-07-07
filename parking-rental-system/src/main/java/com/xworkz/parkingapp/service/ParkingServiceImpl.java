package com.xworkz.parkingapp.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xworkz.parkingapp.dto.ParkingDTO;
import com.xworkz.parkingapp.entity.AdminEntity;
import com.xworkz.parkingapp.repository.ParkingRepository;

@Service
public class ParkingServiceImpl implements ParkingService {

	@Autowired
	ParkingRepository repo;
	
	public ParkingServiceImpl() {
		System.out.println("Running ParkingServiceImpl");
	}
	
	@Override
	public boolean sendMail(String email) {
		System.out.println("Inside sendMail");
		
		String portNumber="587";
		String hostName="smtp.office365.com";
		final String fromEmail="kshemapoojary12@outlook.com";
		final String password="Kshema@26";
		String to=email;
		
		Properties prop=new Properties();
		prop.put("mail.smtp.host", hostName);
		prop.put("mail.smtp.port", portNumber);
		prop.put("mail.smtp.starttls.enable", true);
		prop.put("mail.debug",true);
		prop.put("mail.smtp.auth", true);
		prop.put("mail.transport.protocol", "smtp");
		
		Session session=Session.getInstance(prop, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		});
		
		MimeMessage message=new MimeMessage(session);
		
		try {
			message.setFrom(new InternetAddress(fromEmail));
			message.setSubject("Registration completed");
			message.setText("Thanks for registering!!!");
			//here we need to add code
			message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
			Transport.send(message);
			
		
			
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
		return true;
	}
	
	@Override
	public ParkingDTO userSinghIn(String emailId, String password) {
		System.out.println("Running userSinghIn");
		
		AdminEntity entity=this.repo.userSingnInRepo(emailId);
		
		if(entity.getEmailId().equals(emailId) && entity.getPassword().equals(password)){
			SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy, hh:mm:ss");
			String formatedDate=dateFormat.format(new Date()).toString();
			
			entity.setLoginTime(formatedDate);
			boolean status=repo.updatedTime(entity);
			AdminEntity updatedEntity=repo.userSingnInRepo(emailId);
			ParkingDTO  dto=new ParkingDTO();
			BeanUtils.copyProperties(updatedEntity,dto);
			return dto;
		}
		return null;
	}

	
}
