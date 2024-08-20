--                        Like operator
--                          Part – A:
Create table STUDENT(
	StuID INT,
	FirstName VARCHAR(25),
	LastName VARCHAR(25),
	Website VARCHAR(50),
	City VARCHAR(25),
	Address VARCHAR(100)
)

Insert into STUDENT values
	(1011, 'Keyur', 'Patel', 'techonthenet.com', 'Rajkot', 'A-303 ''Vasant Kunj'', Rajkot'),
	(1022, 'Hardik', 'Shah', 'digminecraft.com', 'Ahmedabad', '"Ram Krupa", Raiya Road'),
	(1033, 'Kajal', 'Trivedi', 'bigactivities.com', 'Baroda', 'Raj bhavan plot, near garden'),
	(1044, 'Bhoomi', 'Gajera', 'checkyourmath.com','Ahmedabad', '"Jig''s Home", Narol'),
	(1055, 'Harmit', 'Mitel', '@me.darshan.com', 'Rajkot', 'B-55, Raj Residency'),
	(1066, 'Ashok', 'Jani', NULL, 'Baroda', 'A502, Club House Building')

select * from student 


--1. Display the name of students whose name starts with ‘k’.
select firstname from STUDENT where firstname like 'k%'

--2. Display the name of students whose name consists of five characters.
select firstname from STUDENT where firstname like '_____'

--3. Retrieve the first name & last name of students whose city name ends with a & contains six characters.
select firstname, lastname from STUDENT where city like '_____a'

--4. Display all the students whose last name ends with ‘tel’.
select firstname, lastname from STUDENT where lastname like '%tel'

--5. Display all the students whose first name starts with ‘ha’ & ends with‘t’.
select firstname from STUDENT where firstname like 'ha%t'

--6. Display all the students whose first name starts with ‘k’ and third character is ‘y’.
select firstname from STUDENT where firstname like 'k_y%'

--7. Display the name of students having no website and name consists of five characters.
select firstname from STUDENT where firstname like '_____' and website is null

--8. Display all the students whose last name consist of ‘jer’.
select firstname, lastname from STUDENT where firstname like 'k_y%'

--9. Display all the students whose city name starts with either ‘r’ or ‘b’.
select firstname from STUDENT where city like '[rb]%'

--10. Display all the name students having websites.
select firstname from STUDENT where website is not null

--11. Display all the students whose name starts from alphabet A to H.
select firstname from STUDENT where firstname like '[a-h]%'

--12. Display all the students whose name’s second character is vowel.
select firstname from STUDENT where firstname like '_[aeiou]%'

--13. Display the name of students having no website and name consists of minimum five characters.
select firstname from STUDENT where firstname like '_____%' and website is null

--14. Display all the students whose last name starts with ‘Pat’.
select firstname, lastname from STUDENT where lastname like 'pat%'

--15. Display all the students whose city name does not starts with ‘b’.select firstname from STUDENT where city not like 'b%'--                               Part – B:

--1. Display all the students whose name starts from alphabet A or H.
select firstname from STUDENT where firstname like '[a-h]%'

--2. Display all the students whose name’s second character is vowel and of and start with H.
select firstname from STUDENT where firstname like 'h[aeiou]%'

--3. Display all the students whose last name does not ends with ‘a’.
select firstname, lastname from STUDENT where lastname not like '%a'

--4. Display all the students whose first name starts with consonant.
select firstname from STUDENT where firstname not like '[aeiou]%'

--5. Display all the students whose website contains .net
select firstname from STUDENT where website like '%.net'


--                           Part – C:

--1. Display all the students whose address consist of -.
select firstname, Address from STUDENT where Address like '%-%'

--2. Display all the students whose address contains single quote or double quote.
select firstname, Address from STUDENT where Address like '%''%''%' or Address like '%"%"%' 

--3. Display all the students whose website contains @.
select firstname from STUDENT where website like '%@%'

--4. Display all the names those are either four or five characters.
select firstname from STUDENT where firstname like '____' or firstname like '_____'


--                                      EXTRA

delete from student where address like '%"%"%'