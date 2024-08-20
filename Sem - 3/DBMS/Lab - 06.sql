--                        Math functions

--                          Part – A:

--1. Display the result of 5 multiply by 30.
select 5 * 30

--2. Find out the absolute value of -25, 25, -50 and 50.
select abs(-25), abs(25), abs(-50), abs(50)

--3. Find smallest integer value that is greater than or equal to 25.2, 25.7 and -25.2.
select CEILING(25.2), CEILING(25.7), CEILING(-25.2)

--4. Find largest integer value that is smaller than or equal to 25.2, 25.7 and -25.2.
select floor(25.2), floor(25.7), floor(-25.2)

--5. Find out remainder of 5 divided 2 and 5 divided by 3.
select 5%2, 5%3

--6. Find out value of 3 raised to 2nd power and 4 raised 3rd power.
select power(3,2), power(4,3)

--7. Find out the square root of 25, 30 and 50.
select sqrt(25), sqrt(30), sqrt(50) 

--8. Find out the square of 5, 15, and 25.
select square(5), square(15), square(25)

--9. Find out the value of PI.
select PI()

--10. Find out round value of 157.732 for 2, 0 and -2 decimal points.
select round(157.732, 2), round(157.732, 0), round(157.732, -2)

--11. Find out exponential value of 2 and 3.
select exp(2), exp(3)

--12. Find out logarithm having base e of 10 and 2.
select log(10), log(2)

--13. Find out logarithm having base b having value 10 of 5 and 100.
select log10(5), log10(100)

--14. Find sine, cosine and tangent of 3.1415 (pi) .
select sin(pi()), cos(pi()), tan(pi())

--15. Find sign of -25, 0 and 25.
select sign(-25), sign(0), sign(25)

--16. Generate random number using function.
select RAND()







-------------------         String functions

--                             Part – A:
--1. Find the length of following. (I) NULL (II) ‘ hello ’ (III) Blank
select len(null), len('hello'), len('')

--2. Display your name in lower & upper case.
select lower('your_name'), upper('your_name')

--3. Display first three characters of your name.
select left('name', 3)

--4. Display 3rd to 10th character of your name.
select substring('abcdefghijklmnop', 3, 10)

--5. Write a query to convert ‘abc123efg’ to ‘abcXYZefg’ & ‘abcabcabc’ to ‘ab5ab5ab5’ using REPLACE.
select replace('abc123efg', '123', 'XYZ'), replace('abcabcabc', 'c', '5')

--6. Write a query to display ASCII code for ‘a’,’A’,’z’,’Z’, 0, 9.
select ascii('a'), ascii('A'), ascii('z'), ascii('Z'), ascii('0'), ascii(9)

--7. Write a query to display character based on number 97, 65,122,90,48,57.
select char(97), char(65), char(122), char(90), char(48), char(57)

--8. Write a query to remove spaces from left of a given string ‘hello world            ‘.
select ltrim('hello world            ');

--9. Write a query to remove spaces from right of a given string ‘               hello world                    ‘.
select rtrim('               hello world                    ')

--10. Write a query to display first 4 & Last 5 characters of ‘SQL Server’.
select left('SQL Server', 4), right('SQL Server', 5)

--11. Write a query to convert a string ‘1234.56’ to number (Use cast and convert function).
select cast('1234.56' as decimal(8,2))

--12. Write a query to convert a float 10.58 to integer (Use cast and convert function).
select cast(10.58 as int)
select convert(int, 10.58)

--13. Put 10 space before your name using function.
select space(10) + 'aa'

--14. Combine two strings using + sign as well as CONCAT ().
select 'as' + 'er'
select concat('as','er')

--15. Find reverse of “Darshan”.
select reverse('Darshan')

--16. Repeat your name 3 times.
select replicate('yourName' , 3)






-------------------               Date Functions

--                                  Part – A:

--1. Write a query to display the current date & time. Label the column Today_Date.
select getdate() as Today_Date

--2. Write a query to find new date after 365 day with reference to today.
select getdate() + 365 

--3. Display the current date in a format that appears as may 5 1994 12:00AM.
select concat_ws(' ', datename(month,  getdate()) , datepart(day,  (getdate())), datepart(year ,  (getdate())) , datepart(hour ,  (getdate())) , ':' , datepart(minute ,  (getdate())))
select format(getdate(), 'MMM d yyyy hh:mmtt')

--4. Display the current date in a format that appears as 03 Jan 1995.
select format(getdate(), 'dd MMM yyyy')

--5. Display the current date in a format that appears as Jan 04, 96.
select format(getdate(), 'MMM dd, yy')

--6. Write a query to find out total number of months between 31-Dec-08 and 31-Mar-09.
select 

--7. Write a query to find out total number of years between 25-Jan-12 and 14-Sep-10.
--8. Write a query to find out total number of hours between 25-Jan-12 7:00 and 26-Jan-12 10:30.
--9. Write a query to extract Day, Month, Year from given date 12-May-16.
--10. Write a query that adds 5 years to current date.
--11. Write a query to subtract 2 months from current date.
--12. Extract month from current date using datename () and datepart () function.
--13. Write a query to find out last date of current month.
--14. Calculate your age in years and months.