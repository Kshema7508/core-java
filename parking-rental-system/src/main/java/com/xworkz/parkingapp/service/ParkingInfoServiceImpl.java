package com.xworkz.parkingapp.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xworkz.parkingapp.dto.ParkingInfoDTO;
import com.xworkz.parkingapp.entity.ParkingInfoEntity;
import com.xworkz.parkingapp.repository.ParkingInfoRepository;

@Service
public class ParkingInfoServiceImpl implements ParkingInfoService{

	@Autowired
	private ParkingInfoRepository infoRepository;
	
	public ParkingInfoServiceImpl() {
		System.out.println("Inside  ParkingInfoServiceImpl");
	}
	
	@Override
	public boolean validateAndSave(ParkingInfoDTO dto) {
		System.out.println("Running validateAndSave");
		
		ParkingInfoEntity entity=new ParkingInfoEntity();
		BeanUtils.copyProperties(dto, entity);
		System.out.println("Evaluvating entity "+entity);
		infoRepository.saveInformation(entity);
		
		return true;
	}

	@Override
	public List<ParkingInfoDTO> findByLocation(String location) {
		System.out.println("Running findByLocation");
		List<ParkingInfoEntity> entities=this.infoRepository.findByLocation(location);
		
		List<ParkingInfoDTO> dtos=entities.stream().map(ent ->{
			ParkingInfoDTO parkingInfoDTO=new ParkingInfoDTO();
			BeanUtils.copyProperties(ent, parkingInfoDTO);
			return parkingInfoDTO;
		}).collect(Collectors.toList());
		return dtos;
	}

}