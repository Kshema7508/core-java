CREATE DATABASE festival;
show databases;
use festival;

CREATE TABLE festivals(id int,fest_name varchar(30),fest_date varchar(20),fest_day varchar(20),region varchar(20),sweet varchar(20),fruit varchar(20),flower varchar(20),family_members int,location varchar(20),dress varchar(20),dress_clr varchar(20));

INSERT INTO festivals VALUES(1,'Dasara','2023-10-06','Thursday','south','Gulab jamun','Mango','Rose',5,'Udupi','Kurtha','yellow');
INSERT INTO festivals VALUES(2,'Lohri','2023-01-13','Friday','south','Peda','Apple','Jasmin',10,'Mangalore','Chudi','Orange');
INSERT INTO festivals VALUES(3,'pongal','2023-01-14','Saturday','south','Halva','Orange','Lotus',7,'bangalore','Saree','Pink');
INSERT INTO festivals VALUES(4,'Republic day','2023-01-05','Wednesday','south','Kaju Katli','Mango','Sunflower',8,'Mysore','Gown','Red');
INSERT INTO festivals VALUES(5,'Vasanth Panchami','2023-02-07','Monday','south','Ladoo','Banana','Marigold',2,'Dharwadi','Kurtha','Purple');
INSERT INTO festivals VALUES(6,'Holi Dhahan','2023-03-15','Tuesday','south','Kulfi','Pomogranate','Mangolia',12,'Tamilnadu','Kurtha','Greay');
INSERT INTO festivals VALUES(7,'Holi','2023-03-16','Wednessday','south','Modak','Cherry','Mogra',11,'Karkala','Jumper','Balck');
INSERT INTO festivals VALUES(8,'Gudi padwa','2023-04-29','Thursday','south','Puran Poli','Pineapple','Dahlia',8,'Kerala','Kurtha','White');
INSERT INTO festivals VALUES(9,'Ram Navami','2023-05-18','Friday','south','Jalebi','Peach','Tiggerly',3,'Bombay','Kurtha','Blue');
INSERT INTO festivals VALUES(10,'Good Friday','2023-06-13','Saturday','south','Kheer','Straberry','Gloxinia',5,'Tumkur','Kurtha','Sky Blue');
INSERT INTO festivals VALUES(12,'Baisakhi','2023-08-28','Sunday','south','Rasgulla','papaya','Canana',5,'Bellary','Kurtha','Violet');
INSERT INTO festivals VALUES(13,'Easter day','2023-06-15','Monday','south','Nankhatai','Rasberry','Daisy',5,'Kasargodu','JUmpsuit','Green');
INSERT INTO festivals VALUES(14,'Ramzan','2023-07-07','Tuesday','south','Rabdi','Pear','Rose',5,'Tamilnadu','Kurtha','Red');
INSERT INTO festivals VALUES(15,'Buddha purnima','2023-08-27','Wednessday','south','Guva','Mango','Jasminse',5,'Punjab','Gown','Cream');
INSERT INTO festivals VALUES(16,'Rath yathra','2023-09-05','Thursday','south','Lassi','Kiwi','Iris',5,'Assam','Kurtha','Yellow');
INSERT INTO festivals VALUES(17,'Eid','2023-10-02','Friday','south','Shrikhand','Graps','Pansy',5,'Goa','Kurtha','Pink');
INSERT INTO festivals VALUES(18,'Guru Purnima','2023-10-24','Saturday','south','Shahi Takra','Watermelon','Tulip',5,'Madhya Pradesh','Kurtha','Rose White');
INSERT INTO festivals VALUES(19,'Raksha Bandhan','2023-10-06','Sunday','south','Basundi','Mango','Hibiscus',5,'Bihar','Kurtha','Orange');
INSERT INTO festivals VALUES(20,'Independence day','2023-10-21','Monday','south','Sandesh','GrapeFruit','Poppy',5,'Odisha','Kurtha','Blue');
INSERT INTO festivals VALUES(21,'Ganesh Chaturthi','2023-10-11','Tuesdayy','south','Pistachio','Papaya','Lotus',5,'Haryana','Kurtha','Brown');
INSERT INTO festivals VALUES(22,'Ashtami','2023-09-17','Wednessday','south','Petha','Orangeo','Mogra',5,'Manipur','saree','Gold');
INSERT INTO festivals VALUES(23,'Maha Navami','2023-09-13','Thursday','south','Sheera','Banana','Pansy',5,'Gujarat','Kurtha','Silver');
INSERT INTO festivals VALUES(24,'Deepavali','2023-10-26','Friday','south','Appam','Apple','Gloxinia',5,'West Bengal','Kurtha','Peach');
INSERT INTO festivals VALUES(25,'Bhai Dooj','2023-10-29','Saturday','south','Dhondas','Watermellon','Daisy',5,'Rajastan','Kurtha','Maroon');
INSERT INTO festivals VALUES(26,'Guru Nanak Jayathi','2023-11-09','Sunday','south','Sohan Papadi','Melon','Hibiscus',5,'Sikkim','Kurtha','yellow');
INSERT INTO festivals VALUES(27,'Christmas','2023-12-25','Wednessday','south','Cake  ','Litchi','Rose',5,'Delhi','Saree','Olive');



SELECT * from festivals;


/*Syntax
ALTER TABLE table_name ADD COLUMN column_name datatype;*/

ALTER TABLE festivals ADD COLUMN food varchar(30) default 'chitranna';

ALTER TABLE festivals ADD COLUMN state varchar(30);
INSERT INTO festivals (id,state) VALUES (7,'Karnataka');

/*droping the column*/
/*Syntax
ALTER TABLE table_name DROP COLUMN column_name; */
ALTER TABLE festivals DROP COLUMN region;

/*Syntax for renaming the column
ALTER TABLE table_name RENAME COLUMN Exinstingcolumn_name TO new_column_name; */

ALTER TABLE festivals RENAME COLUMN sweet To fest_sweet;
ALTER TABLE festivals RENAME COLUMN location TO state;

ALTER TABLE festivals MODIFY COLUMN fest_name varchar(50);
ALTER TABLE festivals MODIFY COLUMN fest_name bigint;
ALTER TABLE festivals MODIFY COLUMN id bigint;
ALTER TABLE festivals MODIFY COLUMN id varchar(20);
ALTER TABLE festivals MODIFY COLUMN fest_name int;

/*DESC : describe
DESC table_name; */
DESC festivals;
DESC fest_info;

/* RENAMING THE TABLE NAME:
RENAME TABLE old_table_name TO new_table_name; */
RENAME TABLE festivals TO fest_info;
SELECT * from fest_info;

/*TRUNCATE: delete the data but table structure remains same(column remains same).
TURNCATE TABLE table_name; */


commit;