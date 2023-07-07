package com.xworkz.parkingapp.service;

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
	public boolean validateAndSave(UserDTO dto, UserParkingDTO dtos) {
		System.out.println("Running validateAndSave");
		UserEntity record=userRepository.findByUserEmail(dto.getEmail());
	
		if(record == null) {
			UserEntity entity=new UserEntity();
			BeanUtils.copyProperties(dto, entity);
			System.out.println("Evaluvating entity "+entity);
			
			UserService service=new UserServiceImpl();
			service.otpSendMail(dto.getEmail());
			//dto.setOneTimePassword(record.getOneTimePassword());
			
			userRepository.saveInformation(entity);
			
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
	public boolean otpSendMail(String email) {
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
			
			Random random = new Random(1000);
			int otp = random.nextInt(999999);
			
			
			message.setFrom(new InternetAddress(fromEmail));
			message.setSubject("Here your One Time Password sent by Kshema");
			message.setText("OTP = " + otp);
			//here we need to add code
			message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
			Transport.send(message);
			
		
			
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
		return true;
	}
}
