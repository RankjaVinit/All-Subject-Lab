--                            Views

create table STUDENT_INFO(
	RNo INT,
	Name VARCHAR(15),
	Branch VARCHAR(15),
	SPI decimal(3,2),
	Bklog int
)

insert into STUDENT_INFO values 
	(101, 'Raju', 'CE', 8.80, 0),
	(102, 'Amit', 'CE', 2.20, 3),
	(103, 'Sanjay', 'ME', 1.50, 6),
	(104, 'Neha', 'EC', 7.65, 1),
	(105, 'Meera', 'EE', 5.52, 2),
	(106, 'Mahesh', 'EC', 4.50, 3)

select * from STUDENT_INFO

--                          Part – A:

--1. Create a view Personal with all columns.
create view Personal
as 
select * from STUDENT_INFO

select * from Personal

--2. Create a view Student_Details having columns Name, Branch & SPI.
create view Student_Details as 
select Name, Branch, SPI from STUDENT_INFO

select * from Student_Details

--3. Create a view AcademicData having columns RNo, Name, Branch.
create view AcademicData as 
select RNo, Name, Branch from STUDENT_INFO

--4. Create a view Student_bklog having all columns but students whose bklog more than 2.
create view Student_bklog as 
select * from STUDENT_INFO
where bklog > 2

--5. Create a view Student_Pattern having RNo, Name & Branch columns in which Name consists of four letters.
create view Student_Pattern as 
select RNo, Name, Branch  from STUDENT_INFO
where name like '____'

select * from Student_Pattern

--6. Insert a new record to AcademicData view. (107, Meet, ME)
insert into AcademicData (rNo, name, branch)  values (107, 'Meet', 'ME')

select * from AcademicData 

--7. Update the branch of Amit from CE to ME in Student_Details view.
update Student_Details 
set Branch = 'ME'
where name = 'Amit'

select * from Student_Details

--8. Delete a student whose roll number is 104 from AcademicData view.
delete from AcademicData
where rNo = 104

select * from AcademicData



--                                    Part – B:

--1. Create a view that displays information of all students whose SPI is above 8.5
create view Student_SPI as 
select * from STUDENT_INFO
where spi > 8.5

select * from Student_SPI 

--2. Create a view that displays 0 backlog students.
create view Student_NoBack as 
select * from STUDENT_INFO
where Bklog = 0

--3. Create a view Computerview that displays CE branch data only.
create view Computerview as 
select * from STUDENT_INFO
where branch = 'CE'

select * from Computerview



--                                              Part – C:

--1. Create a view Result_EC that displays the name and SPI of students with SPI less than 5 of branch EC.
create view Result_EC as 
select name, SPI  from STUDENT_INFO
where branch = 'EC' and spi < 5

--2. Update the result of student MAHESH to 4.90 in Result_EC view.
update Result_EC  
set spi = 4.90
where name = 'MAHESH'

--3. Create a view Stu_Bklog with RNo, Name and Bklog columns in which name starts with ‘M’ and having bklogs more than 5.
create view Stu_Bklog  as 
select RNo, Name, Bklog from STUDENT_INFO
where name like 'M%' and bklog > 5

select * from Stu_Bklog

--4. Drop Computerview form the database.
drop view Computerview