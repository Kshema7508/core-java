package com.xworkz.laptopapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="laptopinfo")
@NamedQueries({
@NamedQuery(name="getAllLaptop",query="select entity from LaptopDTO entity"),
@NamedQuery(name="getByCompanyName",query="select entity from LaptopDTO entity where companyName=:cName"),
@NamedQuery(name="getAllLaptopById",query="select entity from LaptopDTO entity where id=:i"),
@NamedQuery(name="updateLaptop",query="update LaptopDTO entity set companyName=:cName, modelNo=:m,color=:c,processor=:p,ram=:r where id=:i"),
@NamedQuery(name="deleteLaptopById",query="delete LaptopDTO entity where id=:i")})
public class LaptopDTO {

	@Id
	@Column(name="id")
	private int id;
	@Column(name="companyName")
	private String companyName;
	@Column(name="modelNo")
	private String modelNo;
	@Column(name="color")
	private String color;
	@Column(name="processor")
	private String processor;
	@Column(name="ram")
	private String ram;
	//private String email;
}