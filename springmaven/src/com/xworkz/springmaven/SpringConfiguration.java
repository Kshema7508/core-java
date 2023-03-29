package com.xworkz.springmaven;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

 
@Configuration //--bean
public class SpringConfiguration {
	
	//bean can be used for both .class(string) or .java()-->person,glass,train
	@Bean(name = "person")
	public Person getPerson() {
		Person person=new Person();
		person.setId(1);
		person.setName("Nikitha");
		person.setAge(23);
		return person;
	}
	
	@Bean(name="person1")
	public Person getPerson1() {
		Person person=new Person();
		person.setId(2);
		person.setName("Kavana");
		person.setAge(21);
		return person;
	}
	
	@Bean(name = "train")
	public Train getTrain() {
		Train train=new Train();
		train.setId(1);
		train.setTrainName("Shatabdi");
		train.setSource("Udupi");
		train.setDestination("Mysore");
		return train;
	}
	
	@Bean(name="train1")
	public Train getTrain1() {
		Train train=new Train();
		train.setId(40938);
		train.setTrainName("Rajdhani");
		train.setSource("Magalore");
		train.setDestination("Chennai");
		return train;
	}
	
	@Bean(name = "train2")
	public Train getTrain2() {
		Train train=new Train();
		train.setId(28442);
		train.setTrainName("Vivek");
		train.setSource("Bangalore");
		train.setDestination("Hubli");
		return train;
	}
	
	@Bean(name = "train3")
	public Train getTrain3() {
		Train train=new Train();
		train.setId(30241);
		train.setTrainName("VandeBharath");
		train.setSource("Delhi");
		train.setDestination("Bangalore");
		return train;
	}
	
	@Bean(name="train4")
	public Train getTrain4() {
		Train train=new Train();
		train.setId(76121);
		train.setTrainName("Ahimsa Express");
		train.setSource("Karvar");
		train.setDestination("Mumbai");
		return train;
	}
	
	@Bean(name="glass")
	public Glass getGlass() {
		Glass glass=new Glass();
		glass.setId(1);
		glass.setName("TransparentGlass");
		glass.setPrice(250);
		return glass;
	}
	
	@Bean(name="glass1")
	public Glass getGlass1() {
		Glass glass=new Glass();
		glass.setId(2);
		glass.setName("Asahi India");
		glass.setPrice(210);
		return glass;
	}
	@Bean(name="glass2")
	public Glass getGlass2() {
		Glass glass=new Glass();
		glass.setId(3);
		glass.setName("FUSOGlass");
		glass.setPrice(150);
		return glass;
	}
	@Bean(name="glass3")
	public Glass getGlass3() {
		Glass glass=new Glass();
		glass.setId(4);
		glass.setName("Gurind");
		glass.setPrice(90);
		return glass;
	}
	@Bean(name="glass4")
	public Glass getGlass4() {
		Glass glass=new Glass();
		glass.setId(5);
		glass.setName("Priamal");
		glass.setPrice(190);
		return glass;
	}
	
	@Bean(name = "kitchen")
	public Kitchen geKitchen() {
		Kitchen kitchen=new Kitchen();
		kitchen.setId(1);
		kitchen.setKitchenType("Parallel");
		kitchen.setItems(367);
		return kitchen;
	}
	
	@Bean(name = "kitchen1")
	public Kitchen geKitchen1() {
		Kitchen kitchen=new Kitchen();
		kitchen.setId(2);
		kitchen.setKitchenType("L Shape");
		kitchen.setItems(793);
		return kitchen;
	}
	
	@Bean(name = "kitchen2")
	public Kitchen geKitchen2() {
		Kitchen kitchen=new Kitchen();
		kitchen.setId(3);
		kitchen.setKitchenType("Island");
		kitchen.setItems(658);
		return kitchen;
	}
	
	@Bean(name = "kitchen3")
	public Kitchen geKitchen3() {
		Kitchen kitchen=new Kitchen();
		kitchen.setId(4);
		kitchen.setKitchenType("One wall");
		kitchen.setItems(832);
		return kitchen;
	}
	
	@Bean(name = "kitchen4")
	public Kitchen geKitchen4() {
		Kitchen kitchen=new Kitchen();
		kitchen.setId(5);
		kitchen.setKitchenType("Galley");
		kitchen.setItems(390);
		return kitchen;
	}
	
	@Bean(name = "laptop")
	public Laptop getLaptop(){
		Laptop laptop=new Laptop();
		laptop.setId(1);
		laptop.setLaptopName("Dell");
		laptop.setGeneration("8th Generation");
		laptop.setPrice(74000);
		return laptop;
	}
	
	@Bean(name = "laptop1")
	public Laptop getLaptop1(){
		Laptop laptop=new Laptop();
		laptop.setId(2);
		laptop.setLaptopName("Lenovo");
		laptop.setGeneration("7th Generation");
		laptop.setPrice(55000);
		return laptop;
	}
	@Bean(name = "laptop2")
	public Laptop getLaptop2(){
		Laptop laptop=new Laptop();
		laptop.setId(3);
		laptop.setLaptopName("Hp");
		laptop.setGeneration("7th Generation");
		laptop.setPrice(65000);
		return laptop;
	}
	@Bean(name = "laptop3")
	public Laptop getLaptop3(){
		Laptop laptop=new Laptop();
		laptop.setId(4);
		laptop.setLaptopName("Asser");
		laptop.setGeneration("5th Generation");
		laptop.setPrice(35000);
		return laptop;
	}
	@Bean(name = "laptop4")
	public Laptop getLaptop4(){
		Laptop laptop=new Laptop();
		laptop.setId(5);
		laptop.setLaptopName("ThinkPad");
		laptop.setGeneration("8th Generation");
		laptop.setPrice(70000);
		return laptop;
	}

	@Bean(name = "wire")
	public Wire getWire() {
		Wire wire=new Wire();
		wire.setId(1);
		wire.setName("Finolex");
		wire.setPrice(550);
		return wire;
	}
	
	@Bean(name = "wire1")
	public Wire getWire1() {
		Wire wire=new Wire();
		wire.setId(2);
		wire.setName("Magnet");
		wire.setPrice(340);
		return wire;
	}
	
	@Bean(name = "wire2")
	public Wire getWire2() {
		Wire wire=new Wire();
		wire.setId(3);
		wire.setName("Polyvinyl");
		wire.setPrice(230);
		return wire;
	}
	
	@Bean(name = "wire3")
	public Wire getWire3() {
		Wire wire=new Wire();
		wire.setId(4);
		wire.setName("Syska");
		wire.setPrice(179);
		return wire;
	}
	
	@Bean(name = "wire4")
	public Wire getWire4() {
		Wire wire=new Wire();
		wire.setId(5);
		wire.setName("Litz wire");
		wire.setPrice(310);
		return wire;
	}
	
	@Bean(name="foodstall")
	public FoodStall getFoodStall() {
		FoodStall foodStall=new FoodStall();
		foodStall.setId(1);
		foodStall.setName("Chats shop");
		foodStall.setLocation("Rajajinagar");
		foodStall.setState("Karnataka");
		return foodStall;
	}
	
	@Bean(name="foodstall1")
	public FoodStall getFoodStall1() {
		FoodStall foodStall=new FoodStall();
		foodStall.setId(2);
		foodStall.setName("Streets&Steks");
		foodStall.setLocation("Jpnagar");
		foodStall.setState("Karnataka");
		return foodStall;
	}
	
	@Bean(name="foodstall2")
	public FoodStall getFoodStall2() {
		FoodStall foodStall=new FoodStall();
		foodStall.setId(3);
		foodStall.setName("King Sandwich");
		foodStall.setLocation("Magadi");
		foodStall.setState("Karnataka");
		return foodStall;
	}
	
	@Bean(name="foodstall3")
	public FoodStall getFoodStall3() {
		FoodStall foodStall=new FoodStall();
		foodStall.setId(4);
		foodStall.setName("Tastee sub");
		foodStall.setLocation("Jayanagar");
		foodStall.setState("Karnataka");
		return foodStall;
	}
	
	@Bean(name="foodstall4")
	public FoodStall getFoodStall4() {
		FoodStall foodStall=new FoodStall();
		foodStall.setId(5);
		foodStall.setName("NammaIdli");
		foodStall.setLocation("Banashankari");
		foodStall.setState("Karnataka");
		return foodStall;
	}
	
	@Bean(name = "String")
	public String getString() {
		return "to be managed string by the application context";
	}
	
	@Bean(name = "String1")
	public String getString1() {
		return "Its is string application context";
	}
	
	@Bean(name = "String2")
	public String getString2() {
		return "string application context";
	}
	
	@Bean(name = "String3")
	public String getString3() {
		return "Spring framework";
	}
	
	@Bean(name = "String4")
	public String getString4() {
		return "application context is configure by spring framework ";
	}
	
	@Bean(name = "Integer")
	public Integer getInteger() {
		return 55;
	}
	
	@Bean(name = "Integer1")
	public Integer getInteger1() {
		return 746;
	}
	
	@Bean(name = "Integer2")
	public Integer getInteger2() {
		return 987;
	}
	
	@Bean(name = "Integer3")
	public Integer getInteger3() {
		return 123;
	}
	
	@Bean(name = "Integer4")
	public Integer getInteger4() {
		return 540;
	}
	
	@Bean
	public Byte getByte() {
		return 2;
	}
	
	@Bean
	public Float getFloat() {
		return 2.54f;
	}
	
	@Bean
	public Double getDouble() {
		return 65.90d;
	}
	
	@Bean(name = "Character")
	public Character getCharacter() {
		return 'a';
	}
	
	@Bean(name = "Character1")
	public Character getCharacter1() {
		return '7';
	}
	
	@Bean(name = "Character2")
	public Character getCharacter2() {
		return 'g';
	}
	
	@Bean(name = "Character3")
	public Character getCharacter3() {
		return 'K';
	}
	
	@Bean(name = "Character4")
	public Character getCharacter4() {
		return '1';
	}
	
	@Bean 
	public Long getLong() {
		return 9876544567l;
	}
	
	@Bean(name="Short") 
	public Short getShort() {
		return 643;
	}
	
	@Bean(name="Short1") 
	public Short getShort1() {
		return 43;
	}
	
	@Bean(name="Short2") 
	public Short getShort2() {
		return 72;
	}
	
	@Bean(name="Short3") 
	public Short getShort3() {
		return 850;
	}
	
	@Bean(name="Short4") 
	public Short getShort4() {
		return 45;
	}
	
	@Bean
	public Boolean getBoolean() {
		return false;
	}
	
	@Bean
	public Scanner getScanner() {
		return new Scanner(System.in);
	}
}
