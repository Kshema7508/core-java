CREATE DATABASE assignment;

show databases;

use assignment;

CREATE TABLE olympic_games(id int, game_type varchar(30), player_name varchar(20), country varchar(20), no_of_players int, no_of_teams int, no_of_medals int, medal_type varchar(20), jersey_no int, wining_prize_amount bigint);

INSERT INTO olympic_games VALUES(1,'Swimming','Michael Fred Phelps','America',1,25,28,'Gold',26,385000);

SELECT* FROM olympic_games;

INSERT INTO olympic_games VALUES(2,'Boxing','Mary Kom','India',1,15,35,'Gold',36,420000);
INSERT INTO olympic_games VALUES(3,'Golf','Adithi Ashok','India',1,10,2,'Gold',11,395000);
INSERT INTO olympic_games VALUES(4,'Volleyball','Kerrin','USA ',6,5,7,'Silver',7,148300);
INSERT INTO olympic_games VALUES(5,'Fotball','Cristiano Ronaldo','Brazil',11,9,12,'Silver',15,238500);
INSERT INTO olympic_games VALUES(6,'Judo','Teddy Rinners','French',1,7,5,'Bronze',17,35500);
INSERT INTO olympic_games VALUES(7,'Sailing','Nick dempsey','Great Britain',1,5,6,'Silver',6,15000);
INSERT INTO olympic_games VALUES(8,'Badminton','Lin Dan','China',1,17,8,'Gold',78,5000);
INSERT INTO olympic_games VALUES(9,'Fencing','Bhavani Devi','India',1,5,18,'Gold',69,97000);
INSERT INTO olympic_games VALUES(10,'Rowing','Oppo Ruta','Italy',2,9,5,'Bronze',40,53300);

INSERT INTO olympic_games VALUES(11,'Equestrain','Isabell Werthi','Germany',1,18,4,'Silver',73,6300);
INSERT INTO olympic_games VALUES(12,'Shooting','Javad Foroughi','Iran',1,9,3,'Gold',20,8100);
INSERT INTO olympic_games VALUES(13,'Handball','Rodrigo Corrales','Spain',7,7,5,'Bronze',33,45100);
INSERT INTO olympic_games VALUES(14,'Taekwondo','Valdislav Larin','Roc',1,6,1,'Gold',37,31000);
INSERT INTO olympic_games VALUES(15,'Archery','Jyothi Sureka','India',1,9,24,'Silver',75,85000);
INSERT INTO olympic_games VALUES(16,'Modern pentathlon','Joseph Choong','Great Britain',1,12,5,'Gold',23,41000);
INSERT INTO olympic_games VALUES(17,'Ice hockey','Sofianna Sundelin','Finland',11,5,18,'Bronze',9,9000);
INSERT INTO olympic_games VALUES(18,'Diving','Jian Yang','China',1,8,18,'Silver',82,9560);
INSERT INTO olympic_games VALUES(19,'Basketball','Durant','USA',5,10,4,'Gold',99,26400);
INSERT INTO olympic_games VALUES(20,'Tennis','Daniiell Venus','New Zeeland',2,4,2,'Bronze',19,32840);

INSERT INTO olympic_games VALUES(21,'Weightlifting','Mirabai Chanu','India',1,8,19,'Silver',53,73520);
INSERT INTO olympic_games VALUES(22,'Surfing','Italo Ferreira','Brazil',1,12,3,'Gold',39,8120);
INSERT INTO olympic_games VALUES(23,'Diving','Thomas Daley','Great Britain',1,17,4,'Bronze',43,52100);
INSERT INTO olympic_games VALUES(24,'Table tennis','Zhendong Fan','China',1,8,24,'Silver',23,35360);
INSERT INTO olympic_games VALUES(25,'triathlon','Hayden','New Zealand',1,11,14,'bronze',67,25300);
INSERT INTO olympic_games VALUES(26,'Karate','JRyo Kiyuna','Japan',1,14,32,'Gold',22,25000);
INSERT INTO olympic_games VALUES(27,'Field hockey','Maria Granatto','Argentina',11,15,8,'Silver',56,900340);
INSERT INTO olympic_games VALUES(28,'Wrestling','Genno Petraishvili','Georgia',1,13,4,'Silver',28,3160);
INSERT INTO olympic_games VALUES(29,'Water polo','Matyas Pasztor','Hungary',7,1,3,'Bronze',27,4400);
INSERT INTO olympic_games VALUES(30,'Skateboarding','Hiraki Kokona','Japan',1,35,6,'Silver',44,9840);

INSERT INTO olympic_games VALUES(31,'Gymnastics','Aliya Mustafina','Russia',1,3,6,'Gold',35,8320);
INSERT INTO olympic_games VALUES(32,'Atistic swimming','Sun Huang','China',2,5,1,'Silver',59,34520);
INSERT INTO olympic_games VALUES(33,'Alpine skiing','James Crawford','Canada',1,5,9,'Bronze',46,73100);
INSERT INTO olympic_games VALUES(34,'Nordic combined','Houston','Rusia',2,7,4,'Gold',64,98660);
INSERT INTO olympic_games VALUES(35,'Figure skating','Kagiyama Yuma','Japan',1,15,4,'Silver',43,300);
INSERT INTO olympic_games VALUES(36,'Softball','Yukiyo Mine','Japan',10,4,22,'bronze',95,35310);
INSERT INTO olympic_games VALUES(37,'Baseball','Kim','Koria',11,34,1,'Goldr',31,42340);
INSERT INTO olympic_games VALUES(38,'Luge','Geisenberger','German',1,6,2,'Goldr',60,34210);
INSERT INTO olympic_games VALUES(39,'Rugby sevens','Scott Curry','New Zeland',7,9,6,'Silver',82,56400);
INSERT INTO olympic_games VALUES(40,'Road Cycling','Richard Carapaz','USA',1,69,8,'Bronzer',53,12340);

SELECT * from olympic_games;


INSERT INTO festivals VALUES(1,'Dasara','2022-10-06','Thursday','south');
INSERT INTO festivals (id,fest_name,fest_date,fest_day,region) VALUES (2,'Sankrathi','2023-01-14','Saturday','South');
INSERT INTO festivals (id,fest_name,fest_day) VALUES (3,'Onam','friday'); /*insert into selected column*/

