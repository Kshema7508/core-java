CREATE DATABASE festival;
show databases;
use festival;

CREATE TABLE highway(id int,NH_no int,route varchar(20),total_length int,state varchar(30),district varchar(30),country varchar(30),toll_gate_name varchar(30),2wheeler_entry int,4wheeler_entry int,2wheeler_toll_money int,4wheeler_toll_money int,no_of_bike int, no_of_cars int,no_of_bus int,no_of_truck int,no_of_hotels int,no_of_dabas int,no_of_cycle int,persons_in_car int,person_in_bike int,persons_in_bus int);

SELECT * from highway;

ALTER TABLE highway ADD COLUMN start_point varchar(30);
ALTER TABLE highway ADD COLUMN end_point varchar(30);
ALTER TABLE highway ADD COLUMN built_year varchar(30);
ALTER TABLE highway ADD COLUMN no_of_garrage int;
ALTER TABLE highway ADD COLUMN tea_shops int;
ALTER TABLE highway ADD COLUMN no_of_house int;
ALTER TABLE highway ADD COLUMN no_of_temples int;
ALTER TABLE highway ADD COLUMN highway_cost int;


ALTER TABLE highway MODIFY COLUMN route varchar(40);
ALTER TABLE highway MODIFY COLUMN district varchar(30);
ALTER TABLE highway MODIFY COLUMN country varchar(70);
ALTER TABLE highway MODIFY COLUMN start_point varchar(70);
ALTER TABLE highway MODIFY COLUMN highway_cost bigint;

INSERT INTO highway VALUES(1,2,'Delhi',1465,'Delhli','Delhli','India','Deltoll',876,1075,250,550,550,3865,73864,9554,875,150,100,64,5,2,60,'Delhli','Dankuni',1980,1078,923,790,108497);
DESC highway;

INSERT INTO highway VALUES(2,1,'Delhi',15,'Delhli','Delhli','India','Deltoll',763,125,463,5133,5510,32165,874,6764,9575,440,3500,3124,6,51,60,'Delhli','punjab',53980,838,43,764,2708497);
INSERT INTO highway VALUES(3,2,'Sikandra',5162,'Delhli','Delhli','India','Deltoll',1856,32455,380,8565,755,7232,556,7521,8659,874,100,64,34,54,610,'Delhli','Bengal',456,4255,526,5352,14585);
INSERT INTO highway VALUES(4,3,'Delhi',465,'Agra','Delhli','India','Deltoll',758,8354,7124,548,315,9830,1245,1755,85,450,566,45,154,78,12,'UttarPradesh','Maharastra',464,764,87545,458,52297);
INSERT INTO highway VALUES(5,4,'Vadodara',1465,'Chenni','Karnataka','India','Vadoratoll',466,1555,7565,830,5446,7945,465,4274,565,765,230,46,542,1,50,'Maharastra','Tamilnadu',6584,468,953,7740,5477);
INSERT INTO highway VALUES(6,5,'Karnataka',365,'Karnataka','udupi','India','Kartoll',646,2175,450,420,210,08565,4887,7554,45,114,3550,465,575,45,55,'Mangalore','Mysore',454,458,453,5420,147497);
INSERT INTO highway VALUES(7,6,'Jarkandi',215,'Jammu','Himachala','India','Himtoll',4653,711,274,752,546,487,72124,07664,45105,015,721,874,155,2,460,'Himachala','hariyan',5443,752,2453,146,35468);
INSERT INTO highway VALUES(8,7,'MadyaPradesh',6479,'MadyaPradesh','Jarkand','India','Madtoll',488,7952,214,465,781,2345,756,756,7855,7850,145,4664,42,44,478,'Varanasi','Megalaya',4647,5488,413,640,478954);
INSERT INTO highway VALUES(9,8,'Domel',467,'UttarPradesh','Uttarpradesh','India','Uttatoll',431,756,7531,245,645,4648,2487,7512,1476,2452,753,215,553,1,60,'Manali','Dankuni',452,214,43,4780,565497);
INSERT INTO highway VALUES(10,9,'Sikandra',87,'UttarPrdesh','Sikadrai','India','Siktoll',523,566,5532,202,452,3132,554,454,781,251,124,785,24,78,74,'Sikandra','Uttarpradesh',451,795,3455,4654,89745);
INSERT INTO highway VALUES(11,10,'Bardhaman',1465,'westbengal','Bengal','India','Bengtoll',145,754,36,4587,215,2475,73864,5751,47,325,454,5256,45,242,75,'Bengal','Bollapur',445,478,254,755,36445);
INSERT INTO highway VALUES(12,11,'Dehri',475,'Bihar','Mollapur','India','molatoll',245,245,48,3654,4785,235,4782,4789,3245,120,7120,145,457,245,145,'Bihar','Bognipur',445,7511,245,364,458459);
INSERT INTO highway VALUES(13,12,'Dehri',2486,'Rajastan','Madyapradesh','India','Madyatoll',545,654,258,159,357,15987,78522,985,8758,15450,658,156,45,27,360,'Jodpura','UpBorder',7844,452,3256,9856,7854698);
INSERT INTO highway VALUES(14,13,'Gurugram',7854,'Haryana','Rajastan','India','Rajtoll',254,654,3254,458,985,1245,1587,35,4587,954,456,254,65,2325,475,'Rajastan','Maharastra',4598,25,596,475,98754);
INSERT INTO highway VALUES(15,14,'Vasai',2478,'Belgam','Bihar','India','nettoll',5795,246,354,364,2476,346,3622,532,120,212,34,124,2455,2452,545,'Hubli','Davangere',545,875,324,452,123654);
INSERT INTO highway VALUES(16,15,'Tumkur',457,'Karnataka','karnataka','India','Tumtoll',546,785,214,487,986,1598,357,7549,487,357,784,357,987,42,360,'Tumker','Davanagere',245,74,258,357,6547);
INSERT INTO highway VALUES(17,16,'Anmod',245,'Goa','Goa','India','Goatoll',245,658,214,354,159,753,452,658,7521,951,754,358,245,942,6540,'Tamilnadu','Karnataka',854,265,478,954,745835);
INSERT INTO highway VALUES(18,17,'haridaspura',8549,'Odisha','Odisha','India','Oditoll',245,548,354,478,3215,475,457,345,75,1254,487,245,45,32,6870,'Odisha','Paradipport',248,7844,3548,145,248);
INSERT INTO highway VALUES(19,18,'Magawan',245,'Rewa','Tamilnadu','India','magltoll',245,345,485,264,45,323,248,985,245,325,148,245,245,87,25,'Playamkottai','Viakhad',245,585,785,354,145);
INSERT INTO highway VALUES(20,19,'Chiloda',754,'Jetpur','Gujarath','India','Gujtoll',356,587,658,987,254,745,654,854,254,958,785,354,456,954,87,'Pune','Vijayawada',653,637,987,231,8751211);

ALTER TABLE highway RENAME COLUMN total_length to length;
ALTER TABLE highway RENAME COLUMN state to persons_States;
ALTER TABLE highway RENAME COLUMN toll_gate_name to tollgate;
