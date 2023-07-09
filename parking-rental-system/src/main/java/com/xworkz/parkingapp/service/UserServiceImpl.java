package com.xworkz.parkingapp.service;

import java.text.DecimalFormat;
import java.util.Properties;
import java.util.Random;

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
import com.xworkz.parkingapp.dto.UserDTO;
import com.xworkz.parkingapp.dto.UserParkingDTO;
import com.xworkz.parkingapp.entity.UserEntity;
import com.xworkz.parkingapp.entity.UserParkingEntity;
import com.xworkz.parkingapp.repository.UserParkingRepository;
import com.xworkz.parkingapp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserParkingRepository parkingRepository;
	
	public UserServiceImpl() {
		System.out.println("Inside UserServiceImpl");
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
	public boolean validateAndSave(UserDTO dto, UserParkingDTO dtos) {
		System.out.println("Running validateAndSave");
		UserEntity record=userRepository.findByUserEmail(dto.getEmail());
	
		if(record == null) {
			UserEntity entity=new UserEntity();
			BeanUtils.copyProperties(dto, entity);
			System.out.println("Evaluvating entity "+entity);
			
			UserService service=new UserServiceImpl();
			service.sendMail(dto.getEmail());
			userRepository.saveInformation(entity);
			
//			UserService service=new UserServiceImpl();
//			service.otpSendMail(dto.getEmail());
			//dto.setOneTimePassword(record.getOneTimePassword());
			
			if(entity !=null) {
				UserParkingEntity entity1=new UserParkingEntity();
				UserEntity useByEmail=this.userRepository.findByUserEmail(dto.getEmail());
				dtos.setUserId(useByEmail.getUserId());
				BeanUtils.copyProperties(dtos, entity1);
				System.out.println("Evaluvating entity "+entity1);
				parkingRepository.saveInformation(entity1);
				
				return true;
			}
		}
		return true;
	}

	
	@Override
	public boolean otpSendMail(String email, UserEntity entity) {
		System.out.println("Inside otpSendMail");
		
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
			
			 String otp= new DecimalFormat("000000").format(new Random().nextInt(999999));
			 System.out.println(otp);
			
				// oneTimePassword = otp;
			 entity.setOneTimePassword(otp);
			
			
			message.setFrom(new InternetAddress(fromEmail));
			message.setSubject("Here your One Time Password sent by Kshema");
			message.setText("OTP = " +entity.getOneTimePassword() +" ");
			//here we need to add code
			message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
			Transport.send(message);
			
		
			
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
		return true;
	}

	@Override
	public boolean userSignIn(String email, UserEntity entity) {
		System.out.println("Inside userSignIn");
		
		UserEntity record=this.userRepository.findByUserEmail(entity.getEmail());
		
//		if(email.equals(record)) {
	
			UserService service=new UserServiceImpl();
			service.otpSendMail(email, entity);
			String oneTimePassword=entity.getOneTimePassword();
			
 			userRepository.userSignInUpdate(oneTimePassword,email);
//		}
//		else {
//			System.out.println("Email is not valid");
//		}
		
		return true;
	}
	
	
}
