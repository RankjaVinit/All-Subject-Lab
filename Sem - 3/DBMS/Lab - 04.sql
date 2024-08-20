--	               Alter Operation
--                   Part – A:

--1. Add two more columns City VARCHAR (20) and Pincode INT.
alter table deposit add city varchar(20), pincode int

--2. Change the size of CNAME column from VARCHAR (50) to VARCHAR (35).
alter table deposit alter column CNAME varchar(35)
 
--3. Change the data type DECIMAL to INT in amount Column.
alter table deposit alter column AMOUNT int

--4. Rename Column ActNo to ANO.
exec sp_rename 'DEPOSIT.ACTNO', 'ANO'

--5. Delete Column City from the DEPOSIT table.
alter table deposit drop column city

--6. Change name of table DEPOSIT to DEPOSIT_DETAIL.
exec sp_rename 'DEPOSIT', 'DEPOSIT_DETAIL'


-----------------------Part – B:
--1. Rename Column ADATE to AOPENDATE OF DEPOSIT_DETAIL table.
exec sp_rename 'DEPOSIT_DETAIL.ADATE', 'AOPENDATE'

--2. Delete Column AOPENDATE from the DEPOSIT_DETAIL table.
alter table deposit_detail drop column aopendate

--3. Rename Column CNAME to CustomerName.
exec sp_rename 'DEPOSIT_DETAIL.CNAME', 'CustomerName'

--select * from  DEPOSIT_DETAIL


------------------------Part – C:
Create table STUDENT_DETAIL(
	Enrollment_No VARCHAR(20),
	Name VARCHAR(25),
	CPI DECIMAL(5,2),
	Birthdate DATETIME
)

--1. Add two more columns City VARCHAR (20) (Not null) and Backlog INT (Null).
alter table student_detail add city varchar(20) not null, backlog int

--2. Change the size of NAME column of student_detail from VARCHAR (25) to VARCHAR (35).
alter table student_detail alter column name varchar(35)

--3. Change the data type DECIMAL to INT in CPI Column.
alter table student_detail alter column cpi int

--4. Rename Column Enrollment_No to ENO.
exec sp_rename 'STUDENT_DETAIL.Enrollment_No', 'ENO'

--5. Delete Column City from the student_detail table.
alter table student_detail drop column city

--6. Change name of table student_detail to STUDENT_MASTER.
exec sp_rename 'STUDENT_DETAIL', 'STUDENT_MASTER'




---------          DELETE, Truncate, Drop Operation
------------                 Part – A:


--1. Delete all the records of DEPOSIT_DETAIL table having amount greater than and equals to 4000.
delete from deposit_detail where amount>=4000

--2. Delete all the accounts CHANDI BRANCH.
delete from deposit_detail where bname = 'CHANDI'

--3. Delete all the accounts having account number (ANO) is greater than 105.
delete from deposit_detail where ano > 105

--4. Delete all the records of Deposit_Detail table. (Use Truncate)
truncate table deposit_detail

--5. Remove Deposit_Detail table. (Use Drop)drop table deposit_detail-----------                    Part – B:
Create table EMPLOYEE_MASTER(
	EmpNo INT,
	EmpName VARCHAR(25),
	JoiningDate DATETIME,
	Salary DECIMAL (8,2),
	City VARCHAR(20)
)

--Insert the following records in the EMPLOYEE_MASTER table.

insert into EMPLOYEE_MASTER values
	(101 ,'Keyur', '2002-1-5',12000.00 ,'Rajkot'),
	(102 ,'Hardik', '2004-2-15' ,14000.00 ,'Ahmedabad'),
	(103 ,'Kajal', '2006-3-14' ,15000.00 ,'Baroda'),
	(104 ,'Bhoomi', '2005-6-23' ,12500.00 ,'Ahmedabad'),
	(105 ,'Harmit', '2004-2-15' ,14000.00 ,'Rajkot'),
	(106 ,'Mitesh', '2001-9-25' ,5000.00 ,'Jamnagar'),
	(107 ,'Meera', Null ,7000.00 ,'Morbi'),
	(108 ,'Kishan', '2003-2-6',10000.00 ,NULL)



--1. Delete all the records of Employee_MASTER table having salary greater than and equals to 14000.
delete from EMPLOYEE_MASTER where salary = 14000

--2. Delete all the Employees who belongs to ‘RAJKOT’ city.
delete from EMPLOYEE_MASTER where city = 'RAJKOT'

--3. Delete all the Employees who joined after 1-1-2007.
delete from EMPLOYEE_MASTER where JoiningDate > '2007-1-1'

--4. Delete the records of Employees whose joining date is null and Name is not null.
delete from EMPLOYEE_MASTER where JoiningDate is null and empname is not null

--5. Delete the records of Employees whose salary is 50% of 20000.
delete from EMPLOYEE_MASTER where Salary = 10000

--6. Delete the records of Employees whose City Name is not empty.
delete from EMPLOYEE_MASTER where city is not null

--7. Delete all the records of Employee_MASTER table. (Use Truncate)
Truncate table EMPLOYEE_MASTER

--8. Remove Employee_MASTER table. (Use Drop)
drop table EMPLOYEE_MASTER