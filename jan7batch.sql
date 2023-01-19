CREATE DATABASE jan7batch;

show databases;

use jan7batch;

/*Syntax for creating the table
CREATE TABLE table_name(column_name datatype, column_name datatype,......);*/

CREATE TABLE river(id int, name varchar(30), location varchar(20), size bigint);

SELECT* FROM river;
/*SELECT id FROM river;*/

/*Syntax for inserting the data into table
INSERT INTo table_name VALUES(data1,data2,...datan);*/

INSERT INTO river VALUES(1,'Kaveri','Talakadu',600);
INSERT INTO river VALUES(2,'Tungabhadra','Shivamogga',450);
INSERT INTO river VALUES(3,'Krishna','Almatti',700);

SELECT* FROM river;

SELECT NAME,ID from river;
ALTER TABLE river ADD COLUMN state varchar(20);
INSERT INTO river (id,state) VALUES (1,'Karnataka');
ALTER TABLE river ADD COLUMN country varchar(30) default 'India';

commit;
