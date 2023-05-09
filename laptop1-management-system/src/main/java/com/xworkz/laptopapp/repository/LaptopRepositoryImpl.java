package com.xworkz.laptopapp.repository;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.xworkz.laptopapp.dto.LaptopDTO;

@Repository
public class LaptopRepositoryImpl implements LaptopRepository {

	@Override
	public LaptopDTO saveLaptop(LaptopDTO dto) {
		
		System.out.println("Inside repository");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/information","root","Xworkzodc@123");
			String query="insert into laptopinfo values(?,?,?,?,?,?)";
			PreparedStatement stmt=con.prepareStatement(query);
			
			stmt.setInt(1, dto.getId());
			stmt.setString(2, dto.getCompanyName());
			stmt.setString(3, dto.getModelNo());
			stmt.setString(4, dto.getColor());
			stmt.setString(5, dto.getProcessor());
			stmt.setString(6, dto.getRam());
		
			int i=stmt.executeUpdate();
			if(i!=0) {
				System.out.println("Data saved succesfully");
			}
			else {
				System.out.println("Data not saved");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dto;
	}

	@Override
	public List<LaptopDTO> getAllLaptopRepo() {
		System.out.println("Inside getAllLaptopRepo method");
		List<LaptopDTO> lap=new ArrayList<LaptopDTO>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/information","root","Xworkzodc@123");
			String readQuery="select * from laptopinfo";
			PreparedStatement stmt=con.prepareStatement(readQuery);
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()) {
				LaptopDTO dtos=new LaptopDTO();
				dtos.setId(rs.getInt(1));
				dtos.setCompanyName(rs.getString(2));
				dtos.setModelNo(rs.getString(3));
				dtos.setColor(rs.getString(4));
				dtos.setProcessor(rs.getString(5));
				dtos.setRam(rs.getString(6));
				
				lap.add(dtos);
			}
			
		} catch (Exception e) {
			System.out.println("Invalid data.. exception occured");
			e.printStackTrace();
		}
		
		return lap;
	}

	@Override
	public List<LaptopDTO> getByCompanyNameRepo(String companyName) {
		
		System.out.println("Inside getByCompanyNameRepo");
		
		List<LaptopDTO> lapt=new ArrayList<LaptopDTO>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/information","root","Xworkzodc@123");
			String readQuery="select * from laptopinfo where companyName="+"'"+companyName+"'";
			PreparedStatement stmt=con.prepareStatement(readQuery);
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()) {
				LaptopDTO dtos=new LaptopDTO();
				
				dtos.setId(rs.getInt(1));
				dtos.setCompanyName(rs.getString(2));
				dtos.setModelNo(rs.getString(3));
				dtos.setColor(rs.getString(4));
				dtos.setProcessor(rs.getString(5));
				dtos.setRam(rs.getString(6));
				
				lapt.add(dtos);
			}
			
		} catch (Exception e) {
			System.out.println("Invalid data.. exception occured");
			e.printStackTrace();
		}
		
		return lapt;
	}

	@Override
	public LaptopDTO getAllLaptopByIdRepo(int id) {
		System.out.println("Inside getAllLaptopByIdRepo");
		
		LaptopDTO laps=new LaptopDTO();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/information","root","Xworkzodc@123");
			String readQuery="select * from laptopinfo where id=?";
			PreparedStatement stmt=con.prepareStatement(readQuery);
			stmt.setInt(1, id);
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()) {
				LaptopDTO dtos=new LaptopDTO();
				
				dtos.setId(rs.getInt(1));
				dtos.setCompanyName(rs.getString(2));
				dtos.setModelNo(rs.getString(3));
				dtos.setColor(rs.getString(4));
				dtos.setProcessor(rs.getString(5));
				dtos.setRam(rs.getString(6));
				
				laps=dtos;
				
			}
			
		} catch (Exception e) {
			System.out.println("Invalid data.. exception occured");
			e.printStackTrace();
		}
		return laps;
		
	}

	@Override
	public void updateLaptopByIdRepo(LaptopDTO dto) {
		System.out.println("Inside updateLaptopByIdRepo");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/information","root","Xworkzodc@123");
			PreparedStatement stmt=con.prepareStatement("update laptopinfo set companyName=?,modelNo=?,color=?,processor=?,ram=? where id=?");
			
			
			stmt.setString(1, dto.getCompanyName());
			stmt.setString(2, dto.getModelNo());
			stmt.setString(3, dto.getColor());
			stmt.setString(4, dto.getProcessor());
			stmt.setString(5, dto.getRam());
			stmt.setInt(6, dto.getId());
			
			int i=stmt.executeUpdate();
			if(i!=0) {
				System.out.println("Data updated succesfully");
			}
			else {
				System.out.println("Data not updated");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
