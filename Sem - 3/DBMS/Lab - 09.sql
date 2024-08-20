------------------------       Sub Queries

create table STUDENT_DATA(
	no int,
	Name varchar(20),
	City varchar(20),
	DID int
)
insert into STUDENT_DATA values
	(101, 'Raju', 'Rajkot', 10),
	(102, 'Amit', 'Ahmedabad', 20),
	(103, 'Sanjay', 'Baroda', 40),
	(104, 'Neha', 'Rajkot', 20),
	(105, 'Meera', 'Ahmedabad', 30),
	(106, 'Mahesh', 'Baroda', 10)

create table ACADEMIC(
	Rno INT,
	SPI decimal(3,2),
	Bklog int
)
insert into ACADEMIC values
	(101, 8.8, 0),
	(102, 9.2, 2),
	(103, 7.6, 1),
	(104, 8.2, 4),
	(105, 7.0, 2),
	(106, 8.9, 3)


create table DEPARTMENT(
	DID int, 
	DName varchar(20)
)
insert into DEPARTMENT values 
	(10, 'Computer'),
	(20, 'Electrical'),
	(30, 'Mechanical'),
	(40, 'Civil')


--							Part – A:
--1. Display details of students who are from computer department.

--2. Displays name of students whose SPI is more than 8.
--3. Display details of students of computer department who belongs to Rajkot city.
--4. Find total number of students of electrical department.
--5. Display name of student who is having maximum SPI.
--6. Display details of students having more than 1 backlog.


--                          Part – B:
--1. Display name of students who are either from computer department or from mechanical department.
--2. Display name of students who are in same department as 102 studying in.


--                          Part – C:
--1. Display name of students whose SPI is more than 9 and who is from electrical department.
--2. Display name of student who is having second highest SPI.
--3. Display city names whose students branch wise SPI is 9.2