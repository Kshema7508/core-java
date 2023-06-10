package com.xworkz.donationapp.repository;

import com.xworkz.donationapp.dto.BloodGroupDTO;

public interface DonationRepository {

	void savePerson(BloodGroupDTO dto);

}
