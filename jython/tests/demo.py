
ASP ?>>[CLEAR].
print "#############################   Diners Problem   #############################"
ASP ?[dinersASP.lp].
print "Original Database"
ASP PRINT
print "##############################################################################"
MAKECONNECT URL jdbc:oracle:thin:@rising-sun.microlab.cs.utexas.edu:1521:orcl UNAME cs345_mjp2259 PWORD orcl_mjp2259 CONTYPE local;

#Creating table to be use as ASP facts for diners problem
DROP TABLE DINERS;

CREATE TABLE DINERS (SUBJECT VARCHAR(255), PREDICATE VARCHAR(255), OBJECT VARCHAR(255));
INSERT INTO  DINERS (SUBJECT,PREDICATE,OBJECT) VALUES ('mrAstor','gender','male');
INSERT INTO  DINERS (SUBJECT,PREDICATE,OBJECT) VALUES ('mrBlake','gender','male');
INSERT INTO  DINERS (SUBJECT,PREDICATE,OBJECT) VALUES ('mrCrane','gender','male');
INSERT INTO  DINERS (SUBJECT,PREDICATE,OBJECT) VALUES ('mrDavis','gender','male');
INSERT INTO  DINERS (SUBJECT,PREDICATE,OBJECT) VALUES ('mrAstor','person','NA');
INSERT INTO  DINERS (SUBJECT,PREDICATE,OBJECT) VALUES ('mrsAstor','person','NA');
INSERT INTO  DINERS (SUBJECT,PREDICATE,OBJECT) VALUES ('mrBlake','person','NA');
INSERT INTO  DINERS (SUBJECT,PREDICATE,OBJECT) VALUES ('mrsBlake','person','NA');
INSERT INTO  DINERS (SUBJECT,PREDICATE,OBJECT) VALUES ('mrCrane','person','NA');
INSERT INTO  DINERS (SUBJECT,PREDICATE,OBJECT) VALUES ('mrsCrane','person','NA');
INSERT INTO  DINERS (SUBJECT,PREDICATE,OBJECT) VALUES ('mrDavis','person','NA');
INSERT INTO  DINERS (SUBJECT,PREDICATE,OBJECT) VALUES ('mrsDavis','person','NA');
INSERT INTO  DINERS (SUBJECT,PREDICATE,OBJECT) VALUES ('mrAstor','married','mrsAstor');
INSERT INTO  DINERS (SUBJECT,PREDICATE,OBJECT) VALUES ('mrBlake','married','mrsBlake');
INSERT INTO  DINERS (SUBJECT,PREDICATE,OBJECT) VALUES ('mrCrane','married','mrsCrane');
INSERT INTO  DINERS (SUBJECT,PREDICATE,OBJECT) VALUES ('mrDavis','married','mrsDavis');
diners = ASPSELECT * FROM DINERS;
print "\nThis is how Tuples are returned using ASPSELECT:\n"
for i in diners:
	print i

#Creating facts for diners problem
male = ""
person = ""
for i in diners:
	#numberOfCols = str(i).count(",") + 1
	x = str(i).strip("'").split(",")
	if(x[1]=="gender"):
		male += x[0] + ";"
	elif(x[1]=="person"):
		person += x[0] + ";"
	elif(x[1]=="married"):
		strTemp = "'"+x[1]+"'"
		ASP ?-> strTemp(x[0],x[2]).
	
ASP ?->'male'(male.rstrip(";")).	
ASP ?->'person'(person.rstrip(";")).

#Printing results of diners'
x=ASP ?-.
for i in x:
    print i

#ASP ?>>[CLEAR]. 



print "\n\n#############################   Bells (Inequality) Theorem   #############################\n"
PRO ?>>[CLEAR]. 
PRO ?[points.pl].

DROP TABLE DATAPOINTS;

#Creating Datapoints
CREATE TABLE DATAPOINTS (DATA VARCHAR(255), C1 NUMBER, C2 NUMBER, C3 NUMBER);
i = 1
while (i < 16):
	c = 0
	for j in range(4):
		c1 = 0
		for k in range(4):
			INSERT INTO  DATAPOINTS (DATA,C1,C2,C3) VALUES ('data',i,c,c1);
			#ASP ?->'data'(i,c,c1).
			c1 = c1 + 30
			i = i + 1
		c = c + 30

#Creating facts for Bells Theorem
facts = []

for i in ASPSELECT * FROM DATAPOINTS;:
	x = str(i).strip("'").split(",")
	if(int(x[1])<6):
		facts.append( x[0]+"("+x[1]+", "+x[2]+", "+x[3]+")" )
	
print "\nShowing data:\n"
for i in facts:
	print i + "."
	PRO ?->i.
	
print "Bells (Inequality) Theorem, for disagree1\n"
x=PRO ?-'disagree1'('A').
for i in x:
    print i


