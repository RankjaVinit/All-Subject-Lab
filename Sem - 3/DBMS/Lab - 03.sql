--                           Select into Operation

--                    Part – A:  

  Create table CRICKET(
		Name varchar(50), 
		City varchar(50),
		Age  int
  )

  insert into CRICKET values 
			('Sachin Tendulkar' , 'Mumbai' ,30),
			('Rahul Dravid' , 'Bombay' ,35),
			('M. S. Dhoni' , 'Jharkhand' ,31),
			('Suresh Raina' , 'Gujarat' ,30)



--1. Create table Worldcup from cricket with all the columns and data.
	select * into Worldcup from CRICKET

--2. Create table T20 from cricket with first two columns with no data.
	select Name, City into T20 from CRICKET where 1 = 2

--3. Create table IPL From Cricket with No Data
	select * into IPL from CRICKET where 1 = 2



--	                   Part – B:

	Create table EMPLOYEE(
		Name varchar(50), 
		City varchar(50),
		Age  int
	)
	
	insert into EMPLOYEE values
		('Jay Patel' ,'Rajkot' ,30),
		('Rahul Dave' ,'Baroda' ,35),
		('Jeet Patel' ,'Surat' ,31),
		('Vijay Raval' ,'Rajkot' ,30)


--1. Create table Employee_detail from Employee with all the columns and data.
	select * into Employee_detail from Employee

--2. Create table Employee_data from Employee with first two columns with no data.
	select Name, City into Employee_data from Employee where 1 = 2

--3. Create table Employee_info from Employee with no Data
	select * into Employee_info from Employee where 1 = 2


--                    Part – C:

--1. Insert the Data into Employee_info from Employee whose CITY is Rajkot
	insert into Employee_info select * from EMPLOYEE where City = 'Rajkot'

--2. Insert the Data into Employee_info from Employee whose age is more than 32.
	insert into Employee_info select * from EMPLOYEE where age > 32

	select * from Employee_info


--                         Update Operation


--                     Part – A:

--1. Update deposit amount of all customers from 3000 to 5000. (Use Deposit Table)
	update DEPOSIT set AMOUNT = 5000 where AMOUNT = 3000

--2. Change branch name of ANIL from VRCE to C.G. ROAD. (Use Borrow Table)
	update BORROW set BNAME = 'C.G.Road' where CNAME = 'ANIL' and BNAME = 'VRCE'

--3. Update Account No of SANDIP to 111 & Amount to 5000. (Use Deposit Table)
	update DEPOSIT set ACTNO = 111 , AMOUNT = 5000 where CNAME = 'SANDIP'

--4. Update amount of KRANTI to 7000. (Use Deposit Table)
	update DEPOSIT set AMOUNT = 7000 where CNAME = 'KRANTI'

--5. Update branch name from ANDHERI to ANDHERI WEST. (Use Branch Table)
	update BRANCH set BNAME = 'ANDHERI' where BNAME = 'ANDHERI WEST'

--6. Update branch name of MEHUL to NEHRU PALACE. (Use Deposit Table)
	update DEPOSIT set BNAME = 'NEHRU PALACE' where CNAME = 'MEHUL'

--7. Update deposit amount of all depositors to 5000 whose account no between 103 & 107. (Use Deposit Table)
	update DEPOSIT set AMOUNT = 5000 where ACTNO between 103 and 107

--8. Update ADATE of ANIL to 1-4-95. (Use Deposit Table)
	update DEPOSIT set ADATE = '1995-4-1' where CNAME = 'ANIL'

--9. Update the amount of MINU to 10000. (Use Deposit Table)
	update DEPOSIT set AMOUNT = 10000 where CNAME = 'MINU'

--10. Update deposit amount of PRAMOD to 5000 and ADATE to 1-4-96 (Use Deposit Table)
	update DEPOSIT set AMOUNT = 5000, ADATE = '1996-4-1' where CNAME = 'PRAMOD'


--	                  Part – B:

--1. Give 10% Increment in Loan Amount. (Use Borrow Table)
	update BORROW set AMOUNT = AMOUNT * 1.1 
	select * from BORROW

--2. Customer deposits additional 20% amount to their account, update the same. (Use Deposit Table)
	update DEPOSIT set AMOUNT = AMOUNT * 1.2 
	select * from DEPOSIT	

	
--	                   Part – C:

--1. Update amount of loan no 321 to NULL. (Use Borrow Table)
	update BORROW set AMOUNT = null where LOANNO = 321

--2. Update branch name of KRANTI to NULL (Use Borrow Table)
	update BORROW set BNAME = null where CNAME = 'KRANTI'

--3. Display the name of borrowers whose amount is NULL. (Use Borrow Table)
	select CNAME from BORROW where AMOUNT is null

--4. Display the Borrowers whose having branch. (Use Borrow Table)
	select CNAME from BORROW where BNAME is not null

--5. Update the Loan Amount to 5000, Branch to VRCE & Customer Name to Darshan whose loan no is 481. (Use Borrow Table)
	update BORROW set AMOUNT = 5000, bname = 'VRCE', cname = 'Darshan' where LOANNO = 481

--6. Update the Deposit table and set the date to 01-01-2021 for all the depositor whose amount is less than 2000.
	update Deposit set ADATE = '2021-1-1' where amount < 2000

--7. Update the Deposit table and set the date to NULL & Branch name to ‘ANDHERI whose Account No is 110.
	update Deposit set ADATE = null, BNAME = 'ANDHERI' where ACTNO = 110