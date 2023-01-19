show databases;
use festival;

CREATE TABLE movies(id int,movie_name varchar(50),nayaka varchar(20),hero_role varchar(20),nayaki varchar(20),directedby varchar(20),producedby varchar(20), music varchar(20),storyby varchar(20),release_date date,days_theatre int); 

ALTER TABLE movies ADD COLUMN (language varchar(30));

SELECT * FROM movies;

DESC movies;

ALTER TABLE movies MODIFY COLUMN movie_name varchar(70);
ALTER TABLE movies MODIFY COLUMN nayaka varchar(60);
ALTER TABLE movies MODIFY COLUMN hero_role varchar(40);
ALTER TABLE movies MODIFY COLUMN nayaki varchar(50);
ALTER TABLE movies MODIFY COLUMN directedby varchar(50);
ALTER TABLE movies MODIFY COLUMN producedby varchar(50);

ALTER TABLE movies RENAME COLUMN movie_name to movie;
ALTER TABLE movies RENAME COLUMN nayaka to hero;
ALTER TABLE movies RENAME COLUMN nayaki to heroein;

ALTER TABLE movies DROP COLUMN days_theatre;

INSERT INTO movies VALUES(1,'shabdavedi','rajkumar','sandeep','jayaprada','s narayan','parvatamma rajkumar','hamsalekha','vijay sasanur','2000-02-10','tamil');
INSERT INTO movies VALUES(2,'Kranti','Darshan','Dharma','Rachita ram','V Harikrishna','B suresh, Shylaja nag,','V Harikrishna','V Harikrishna','2023-01-26','Kannada');
INSERT INTO movies VALUES(3,'James','punith rajkumar','santosh','priya anand','chetan kumar','kishore','charanraj','chetam kumar','2022-03-17','Kannada');
INSERT INTO movies VALUES(4,'Milana','Punith rajkumar','Akash','Parvathi','Prakash','Prakash','Mano murthy','Prakash','2007-09-14','Kannada');
INSERT INTO movies VALUES(5,'Lovemocktail 2','Darling krishna','santosh','milana nagraj','Darling krishna','Darling krishna','nakul abyankar','Darling krishna','2022-11-02','Kannada');
INSERT INTO movies VALUES(6,'Valimai','Ajit kumar','sharat','Huma Qureshi','H. Vinoth','boney kishor','zee studios','H. Vinoth','2022-02-24','Kannada');
INSERT INTO movies VALUES(7,'Beast','vijay','vijay','pooja hegde','Nelson','kalanithi maran','anirudh ravi','Nelson','2022-04-13','tamil');
INSERT INTO movies VALUES(8,'kotigobba 2','sudeep','shiva','nitya menon','ks ravikumar','boney kishor','D imman','T shivkumar','2016-08-12','Kannada');
INSERT INTO movies VALUES(9,'Ratnan prapancha','dananjay','Reba monica','Rohit padak','KRG studios','Rohit padak','ajneesh loknath','rohit padak','2021-10-22','Kannada');
INSERT INTO movies VALUES(10,'Anand','Shivraj kumar','anand','sudarani','gurudat','krishna','nagendra prasad','santosh','1996-2-04','Kannada'); 
INSERT INTO movies VALUES(11,'hrudaya haditu','ambreesh','dr prasad','malashree,bhavya','ms rajshekar','sa srinivas','upendra kumar','rajshekar','1991-01-23','kannada');
INSERT INTO movies VALUES(12,'Rider','nikhil','surya','Kashmira Pardeshi','vijay kumar','Sunil gowda','arjun janya','vijay kumar','2022-12-24','Kannada');
INSERT INTO movies VALUES(13,'RRR','N.T.RamaRao Jr','bheem','aliya bhat','rajmouli','DVV entertainment','mm keeravani','vijayendra prasad','2022-03-25','Telugu');
INSERT INTO movies VALUES(14,'Attack','Jhon ibraham','arjun','rakul preeth singh','Lakshay raj','boney kishor','Shashwat Sachdev','john abraham','2022-04-01','Hindi');
INSERT INTO movies VALUES(15,'Veda','Shivraj kumar','shiva','Jhanavi','Harsha','geetha shivrajkumar','Arjun janya','Harsha','2022-12-23','Kannada');
INSERT INTO movies VALUES(16,'Jersey','Shahid kapoor','arjun talwar','mrunal talkur','Gowtam Naidu','dil raju','Anirudh Ravichander','arjun','2022-04-22','hindi');
INSERT INTO movies VALUES(17,'777 Charlie','Rakshith Shetty','Dharma','Sangeetha Sringeri','Kiranraj K','Rakshith Shetty,','Nobin Paul','Kiranraj K','2022-06-10','Kannada,Hindi,Tamil,Telugu');
INSERT INTO movies VALUES(18,'Appu','punith rajkumar','appu','rakshita','puri jaganath','parvathamma','gurukiran','puri jaganath','2002-04-02','Kannada');
INSERT INTO movies VALUES(19,'Googli','yash','sharath','kriti karabanda','pawan wadeyar','jayanna','anoop seelin','pawan wadeyar','2013-09-19','Kannada');
INSERT INTO movies VALUES(20,'na ninna bidalare','ananth nag','krishna','lakshmi','vijay','jayram','rajan nagrendra','md sundar','1979-09-14','Kannada');
INSERT INTO movies VALUES(21,'kabi kush kabi gham','sharuk khan','rahul','kajol','karan johar','yash johar','Sandesh Shandilya','karan johar','2001-12-14','hindi');
INSERT INTO movies VALUES(22,'Kantara','rishab Shetty','shiva','saptami gowda','rishab shetty','vijay kiragandur,','ajneesh loknath','Rishab shetty','2022-09-30','Kannada,Hindi,Tamil,Telugu');
INSERT INTO movies VALUES(23,'super','upendra','shubash','nayanathara','upendra','Rockline Venkatesh','v harikrishna','upendra','2010-12-3','Kannada');
INSERT INTO movies VALUES(24,'aptamitra','vishnuvardan','vijay','soundarya','gurukiran','dwarkish,','madhu muttam','madhu','2004-8-27','Kannada');
INSERT INTO movies VALUES(25,'FIR','Vishnu','Irfan','Reba monica','manu anand','aryan ramesh','manu anand','Ashwath','2022-02-11','tamil');
INSERT INTO movies VALUES(26,'pancharangi','diganth','bharath','nidhi subbayya','yograj bhat','k subramanya','mano murthy','k subramanya','2010-09-03','Telugu');
INSERT INTO movies VALUES(27,'mungaru male','ganesh','preetham','pooja gandhi','yograj bhat','E krishna','mano murthy','yograj bhat','2006-12-29','Kannada');
INSERT INTO movies VALUES(28,'Kalavida','ravichandran','anand','meena','ravichandran','ravichandran','hamsalekha','ravichandran','1997-2-04','Kannada');
INSERT INTO movies VALUES(29,'Sangliyana','shankarnag','sangliyana','bhavya','p nanjundappa','s v raju','hamsalekha','k v raju','1988-02-24','Kannada');
INSERT INTO movies VALUES(30,'inti ninna preetiya','srinagara kitty','rajeeva','bhavana','duniya suri','suri','sadhu kokila','duniya suri','2008-02-29','Kannada');
INSERT INTO movies VALUES(31,'Ajay','Punith rajkumar','Ajay','Anu Mehta','Meher Ramesh','Rockline Venkatesh','Mani Sharma','Gunashekar','2006-06-4','Kannada');
INSERT INTO movies VALUES(32,'krishna leela','ajay rao','krishna','mayuri','shashank','ajay rao','shridhar','shashank','2015-03-20','tamil');
INSERT INTO movies VALUES(33,'agni ips','saikumar','agni','ranjita','anand p raju','rockline venkatesh','ram chakravarthy','r selva raj','1997-01-28','Kannada');
INSERT INTO movies VALUES(34,'Jersey','Shahid kapoor','arjun talwar','mrunal talkur','Gowtam Naidu','dil raju','Anirudh Ravichander','arjun','2022-04-22','hindi');
INSERT INTO movies VALUES(35,'samhara','chiranjivi sarja','srishaila','kavya shetty','guru deshpande','Sunil gowda','ravi busrur','rohin venkatesan','2018-02-09','Kannada');
INSERT INTO movies VALUES(36,'bell bottom','akshay kumar','akshay malhotra','vani kapoor','	Ranjit M. Tewari','vashu bhagnani','Daniel B. George','aseem arrora','2021-08-19','hindi');
INSERT INTO movies VALUES(37,'sully','Tom Hanks','Sully Sullenberger','sully','Clint Eastwood','Clint Eastwood,Frank Marshall','Christian Jacob','Todd Komarnicki','2016-09-02','English');
INSERT INTO movies VALUES(38,'Vikranth Rona','Sudeep ','Vikrath','Jacqueline Fernandez','Nirup Bhandari','Shalini Manjunath','Ajaneesh Loknath','Anup  Bhandari','2022-07-27','Kannada');
INSERT INTO movies VALUES(39,'Vikram','Kamal Haasan',' Arun Kumar','Shivani','Lokesh Kanagaraj','Kamal haasan','Anirudh Ravichandran','Rathna Kumar','2022-06-03','tamil');
INSERT INTO movies VALUES(40,'Sita Ramam','dulquer Salmaan','Ram','mrunal Thakur','Hanu Raghavapudi','Aswani Dutt','Vishal Chandrashekar','Raj Kumar','2022-08-15','telugu');

ALTER TABLE movies MODIFY COLUMN music varchar(60);
ALTER TABLE movies MODIFY COLUMN storyby varchar(60);
ALTER TABLE movies MODIFY COLUMN language varchar(80);
ALTER TABLE movies MODIFY COLUMN id bigint;

ALTER TABLE movies RENAME COLUMN music to music_director;
ALTER TABLE movies RENAME COLUMN storyby to writter;
ALTER TABLE movies RENAME COLUMN release_date to released_on;

ALTER TABLE movies RENAME COLUMN language to film_language;

SELECT count(*) FROM movies;
commit;

ALTER TABLE movies DROP COLUMN hero;