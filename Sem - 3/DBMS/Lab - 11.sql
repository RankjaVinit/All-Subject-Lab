--Create below tables as per following data


create table EMPLOYEE_MASTER(
	EmployeeNo varchar(10),
	Name varchar(10),
	ManagerNo varchar(10)
)

insert into EMPLOYEE_MASTER values
	('E01', 'Tarun', NULL),
	('E02', 'Rohan', 'E02'),
	('E03', 'Priya', 'E01'),
	('E04', 'Milan', 'E03'),	('E05', 'Jay', 'E01'),	('E06', 'Anjana', 'E04')select * from EMPLOYEE_MASTERselect * from STU_INFOselect * from result

--									Part – A:
--1. Combine information from student and result table using cross join or Cartesian product.
	select * from STU_INFO t1 cross join RESULT t2 

--2. Perform inner join on Student and Result tables.
	select * from STU_INFO t1 inner join RESULT t2 on t1.RNO = t2.rno

--3. Perform the left outer join on Student and Result tables.
	select * from STU_INFO t1 left outer join RESULT t2 on t1.RNO = t2.rno

--4. Perform the right outer join on Student and Result tables.
	select * from STU_INFO t1 right outer join RESULT t2 on t1.RNO = t2.rno

--5. Perform the full outer join on Student and Result tables.
	select * from STU_INFO t1 full outer join RESULT t2 on t1.RNO = t2.rno

--6. Display Rno, Name, Branch and SPI of all students.
	select t1.Rno, t1.Name, t1.Branch, t2.SPI from STU_INFO t1 inner join RESULT t2 on t1.RNO = t2.rno

--7. Display Rno, Name, Branch and SPI of CE branch’s student only.
	select t1.Rno, t1.Name, t1.Branch, t2.SPI from STU_INFO t1 inner join RESULT t2 on t1.RNO = t2.rno where t1.BRANCH = 'CE'

--8. Display Rno, Name, Branch and SPI of other than EC branch’s student only.
	select t1.Rno, t1.Name, t1.Branch, t2.SPI from STU_INFO t1 inner join RESULT t2 on t1.RNO = t2.rno where t1.BRANCH <> 'EC'

--9. Display average result of each branch.
	select t1.branch, AVG(T2.spi) from STU_INFO t1 inner join RESULT t2 on t1.RNO = t2.rno group by t1.BRANCH

--10. Display average result of CE and ME branch.
	select t1.branch, AVG(T2.spi) from STU_INFO t1 inner join RESULT t2 on t1.RNO = t2.rno group by t1.BRANCH having t1.BRANCH in ('CE', 'ME')



-----------------------                     Part – B:

--1. Display average result of each branch and sort them in ascending order by SPI.
	select t1.branch, AVG(T2.spi) from STU_INFO t1 inner join RESULT t2 on t1.RNO = t2.rno group by t1.BRANCH order by AVG(t2.SPI)

--2. Display highest SPI from each branch and sort them in descending order.
	select t1.branch, max(T2.spi) from STU_INFO t1 inner join RESULT t2 on t1.RNO = t2.rno group by t1.BRANCH order by max(t2.SPI) desc



-----------------------                     Part – C:

--1. Retrieve the names of employee along with their manager’s name from the Employee table.
	select t1.Name as Employee, t2.Name as Manager from EMPLOYEE_MASTER t1 full outer join EMPLOYEE_MASTER t2 on t1.ManagerNo = t2.EmployeeNo