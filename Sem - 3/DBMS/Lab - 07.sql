--Part – A:
--Create table and inset records as per below.

Create table EMP(
	EID int, 
	EName varchar(20),
	Department varchar(20),
	Salary int,
	JoiningDate datetime, 
	City varchar(20)
)

select * from emp

insert into emp values
	(101 ,'Rahul' ,'Admin' ,56000 ,'1-Jan-90' ,'Rajkot'),
	(102 ,'Hardik' ,'IT' ,18000 ,'25-Sep-90' ,'Ahmedabad'),
	(103 ,'Bhavin' ,'HR' ,25000 ,'14-May-91' ,'Baroda'),
	(104 ,'Bhoomi' ,'Admin' ,39000 ,'8-Feb-91' ,'Rajkot'),
	(105 ,'Rohit' ,'IT' ,17000 ,'23-Jul-90' ,'Jamnagar'),
	(106 ,'Priya' ,'IT' ,9000 ,'18-Oct-90' ,'Ahmedabad'),
	(107 ,'Bhoomi' ,'HR' ,34000 ,'25-Dec-91' ,'Rajkot')

--1. Display the Highest, Lowest, Label the columns Maximum, Minimum respectively.
	select max(salary) as maximum, min(salary) as minimum from emp

--2. Display Total, and Average salary of all employees. Label the columns Total_Sal and Average_Sal, respectively.
	select sum(salary) as 'Total Sal', avg(salary) as 'Average Sal' from emp

--3. Find total number of employees of EMPLOYEE table.
	select count(ename) as 'Total Emp' from emp

--4. Find highest salary from Rajkot city.
	select max(salary) as 'Max Sal' from emp where city = 'Rajkot'
	select city, max(salary) as 'Max Sal' from emp group by city having city = 'Rajkot'

--5. Give maximum salary from IT department.
	select max(salary) as 'Max Sal' from emp where department = 'IT'

--6. Count employee whose joining date is after 8-feb-91.
	select count(*) as 'Count' from emp where joiningdate > '8-feb-91'

--7. Display average salary of Admin department.
	select max(salary) as 'Max Sal' from emp where department = 'IT'

--8. Display total salary of HR department.
	SELECT SUM(SALARY)
	FROM EMP
	WHERE DEPARTMENT = 'HR';

--9. Count total number of cities of employee without duplication.

	SELECT COUNT(DISTINCT CITY) FROM EMP;

--10. Count unique departments.

	SELECT COUNT(DISTINCT DEPARTMENT) FROM EMP;

--11. Give minimum salary of employee who belongs to Ahmedabad.

	SELECT MIN(SALARY) FROM EMP
	GROUP BY CITY
	HAVING CITY = 'AHMEDABAD';

--12. Find city wise highest salary.

	SELECT CITY, MAX(SALARY) FROM EMP
	GROUP BY CITY;

--13. Find department wise lowest salary.
	SELECT DEPARTMENT , MIN(SALARY) FROM EMP
	GROUP BY DEPARTMENT;

--14. Display city with the total number of employees belonging to each city.

	SELECT CITY , COUNT(DISTINCT CITY) FROM EMP
	GROUP BY CITY;

--15. Give total salary of each department of EMP table.

	SELECT DEPARTMENT , SUM(SALARY) FROM EMP
	GROUP BY DEPARTMENT;

--16. Give average salary of each department of EMP table without displaying the respective department name.

	SELECT AVG(SALARY) FROM EMP
	GROUP BY DEPARTMENT;



--											Part - B

--1. Count the number of employees living in Rajkot.

SELECT COUNT(ENAME)
FROM EMP
WHERE CITY = 'RAJKOT';

--2. Display the difference between the highest and lowest salaries. Label the column DIFFERENCE.

SELECT MAX(SALARY) - MIN(SALARY) AS DIFFERENCE
FROM EMP;

--3. Display the total number of employees hired before 1st January, 1991.
SELECT COUNT(ENAME) 
FROM EMP
WHERE JOININGDATE < '1991-01-01';


--                                       PART-C

--1. Count the number of employees living in Rajkot or Baroda.

SELECT COUNT(ENAME) 
FROM EMP
WHERE CITY = 'RAJKOT' OR CITY = 'BARODA';

--2. Display the total number of employees hired before 1st January, 1991 in IT department.

SELECT SUM(ENAME) 
FROM EMP
WHERE JOININGDATE < '1991-01-01' AND DEPARTMENT = 'IT';

--3. Find the Joining Date wise Total Salaries

SELECT JOININGDATE , SUM(SALARY) 
FROM EMP
GROUP BY JOININGDATE;

--4. Find the Maximum salary department & city wise in which city name starts with ‘R’.

SELECT DEPARTMENT , MAX(SALARY) 
FROM EMP
WHERE CITY LIKE 'R%'
GROUP BY DEPARTMENT;




--                                         EXTRA QUESTION 

--QUESTION 1

SELECT DEPARTMENT , MAX(SALARY) AS MAX_SALARY 
FROM EMP
GROUP BY DEPARTMENT;

--QUESTION 2

SELECT CITY , AVG(SALARY) AS AVERAGE_SALARY 
FROM EMP
GROUP BY CITY;