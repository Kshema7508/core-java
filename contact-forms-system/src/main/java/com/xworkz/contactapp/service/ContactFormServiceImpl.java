package com.xworkz.contactapp.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.contactapp.dto.ContactFormDTO;
import com.xworkz.contactapp.entity.ContactFormEntity;
import com.xworkz.contactapp.repository.ContactFormRepository;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@Service
public class ContactFormServiceImpl implements ContactFormService{

	@Autowired
	private ContactFormRepository repo;
	
	public ContactFormServiceImpl() {
		System.out.println("Inside ContactFormServiceImpl");
	}
	
	@Override
	public boolean sendMail(String email) {
		System.out.println("Inside sendMail");
		
		String portNumber="587";
		String hostName="smtp.office365.com";
		final String fromEmail="vijaykumarvini59@outlook.com";
		final String password="Vij@y123";
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
	public boolean validateAndsave(ContactFormDTO dto) {
		System.out.println("Inside validateAndsave");
		
		ContactFormEntity contactFormEntity=new ContactFormEntity();
		BeanUtils.copyProperties(dto, contactFormEntity);
		
		System.out.println("Evaluvating entity "+contactFormEntity);
		ContactFormService g = new ContactFormServiceImpl();
		g.sendMail(dto.getEmail());
		repo.savePerson(contactFormEntity);
		
		return true;
	}

}
