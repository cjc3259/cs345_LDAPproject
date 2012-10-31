def neatPrint(results):
        for ii in range(0, len(results)):
                print(results[ii]);
        print;






MAKECONNECT URL jdbc:oracle:thin:@rising-sun.microlab.cs.utexas.edu:1521:orcl UNAME CS345_demo PWORD orcl_demo CONTYPE local;

output = (SELECT TABLE_NAME FROM USER_TABLES WHERE TABLE_NAME = 'PETS';)
if len(output) == 2:
        DROP TABLE PETS;

output = (SELECT TABLE_NAME FROM USER_TABLES WHERE TABLE_NAME = 'ANIMALTYPES';)
if len(output) == 2:
        DROP TABLE ANIMALTYPES;

output = (SELECT TABLE_NAME FROM USER_TABLES WHERE TABLE_NAME = 'VISITS';)
if len(output) == 2:
        DROP TABLE VISITS;

output = (SELECT TABLE_NAME FROM USER_TABLES WHERE TABLE_NAME = 'VETS';)
if len(output) == 2:
        DROP TABLE VETS;

CREATE TABLE PETS (PETID NUMERIC, NAME VARCHAR(30), TYPEID NUMERIC, BIRTH_YEAR NUMERIC);
INSERT INTO PETS (PETID, NAME, TYPEID, BIRTH_YEAR) VALUES (1001, 'COUSCOUS',    2001, 2005);
INSERT INTO PETS (PETID, NAME, TYPEID, BIRTH_YEAR) VALUES (1002, 'PUMPKIN',     2001, 2009);
INSERT INTO PETS (PETID, NAME, TYPEID, BIRTH_YEAR) VALUES (1003, 'MAPLE',       2001, 2009);
INSERT INTO PETS (PETID, NAME, TYPEID, BIRTH_YEAR) VALUES (1004, 'MIKE',        2002, 2007);
INSERT INTO PETS (PETID, NAME, TYPEID, BIRTH_YEAR) VALUES (1005, 'BARKLY',      2002, 2000);
INSERT INTO PETS (PETID, NAME, TYPEID, BIRTH_YEAR) VALUES (1006, 'NEMO',        2002, 2010);
INSERT INTO PETS (PETID, NAME, TYPEID, BIRTH_YEAR) VALUES (1007, 'JERRY',       2003, 2006);
INSERT INTO PETS (PETID, NAME, TYPEID, BIRTH_YEAR) VALUES (1008, 'LOLA',        2003, 2010);


CREATE TABLE ANIMALTYPES (TYPEID NUMERIC, SPECIES VARCHAR(30));
INSERT INTO ANIMALTYPES (TYPEID, SPECIES) VALUES (2001, 'CAT');
INSERT INTO ANIMALTYPES (TYPEID, SPECIES) VALUES (2002, 'DOG');
INSERT INTO ANIMALTYPES (TYPEID, SPECIES) VALUES (2003, 'RABBIT');

CREATE TABLE VISITS (VETID NUMERIC, PETID NUMERIC, TIME FLOAT, PRICE NUMERIC);
INSERT INTO VISITS (VETID, PETID, TIME, PRICE) VALUES (4003,1002,2,200);
INSERT INTO VISITS (VETID, PETID, TIME, PRICE) VALUES (4005,1005,1,80);
INSERT INTO VISITS (VETID, PETID, TIME, PRICE) VALUES (4004,1008,1,15);
INSERT INTO VISITS (VETID, PETID, TIME, PRICE) VALUES (4002,1003,2.9,95);
INSERT INTO VISITS (VETID, PETID, TIME, PRICE) VALUES (4001,1006,2,100);
INSERT INTO VISITS (VETID, PETID, TIME, PRICE) VALUES (4005,1001,5,50);
INSERT INTO VISITS (VETID, PETID, TIME, PRICE) VALUES (4003,1002,24,20);

CREATE TABLE VETS (VETID NUMERIC, NAME VARCHAR(30), HIRED_YEAR NUMERIC);
INSERT INTO VETS (VETID, NAME, HIRED_YEAR) VALUES (4001, 'ANDREW', 2011);
INSERT INTO VETS (VETID, NAME, HIRED_YEAR) VALUES (4002, 'BOBBY', 2008);
INSERT INTO VETS (VETID, NAME, HIRED_YEAR) VALUES (4003, 'CATHY', 2007);
INSERT INTO VETS (VETID, NAME, HIRED_YEAR) VALUES (4004, 'DHARMA', 2010);
INSERT INTO VETS (VETID, NAME, HIRED_YEAR) VALUES (4005, 'ELIZABETH', 2004);
 
