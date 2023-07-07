package com.xworkz.parkingapp.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity 
@Table(name="user_details")
@NamedQuery(name = "findByUserEmail", query = "select ent from UserEntity as ent where ent.email=:mail")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private String email;
	private long mobileNo;
	
	private static final long OTP_VALID_DURATION = 5*60*100;
	private String oneTimePassword;
	private Date otpRequestedTime;
	
	
	
	public boolean isOTPRequired() {
		if(this.getOneTimePassword() == null) {
			return false;
		}
		
		long currentTimeInMillis = System.currentTimeMillis();
        long otpRequestedTimeInMillis = this.otpRequestedTime.getTime();
         
        if (otpRequestedTimeInMillis + OTP_VALID_DURATION < currentTimeInMillis) {
            // OTP expires
            return false;
        }
		
		return true;
	}
}