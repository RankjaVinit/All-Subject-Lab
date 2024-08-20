--                                              Lab 8 
create table SALES_DATA(
	Region varchar(20), 
	Product varchar(20),
	Sales_Amount int,
	Year int
)

insert into SALES_DATA values 
	('North America' , 'Watch' , 1500, 2023),
	('Europe'        , 'Mobile', 1200, 2023),
	('Asia'          , 'Watch' , 1800, 2023),
	('North America' , 'TV'    , 900 , 2024),
	('Europe'        , 'Watch' , 2000, 2024),
	('Asia'          , 'Mobile', 1000, 2024),
	('North America' , 'Mobile', 1600, 2023),
	('Europe'        , 'TV'    , 1500, 2023),
	('Asia'          , 'TV'    , 1100, 2024),
	('North America' , 'Watch' , 1700, 2024) 

select * from SALES_DATA

--                                   Part – A:
--1. Display Total Sales Amount by Region.
select region, sum(sales_Amount) as 'Total Amount' from Sales_data 
group by region

--2. Display Average Sales Amount by Product
select Product, avg(sales_Amount) as 'Avg Amount' from Sales_data 
group by product

--3. Display Maximum Sales Amount by Year
select year, max(sales_Amount) as 'Max Amount' from Sales_data 
group by year

--4. Display Minimum Sales Amount by Region and Year
select region, year, max(sales_Amount) as 'Max Amount' from Sales_data 
group by region, year

--5. Count of Products Sold by Region
select region, count(Product) as 'number of Amount' from Sales_data 
group by region

--6. Display Sales Amount by Year and Product
select year, product, max(sales_Amount) as 'Max Amount' from Sales_data 
group by year, product

--7. Display Regions with Total Sales Greater Than 5000
select region, sum(sales_Amount) as 'Total Amount' from Sales_data 
group by region
having sum(sales_Amount) > 5000

--8. Display Products with Average Sales Less Than 10000
select Product, avg(sales_Amount) as 'Avg Amount' from Sales_data 
group by Product
having avg(sales_Amount) < 10000

--9. Display Years with Maximum Sales Exceeding 500
select year, max(sales_Amount) as 'Max Amount' from Sales_data 
group by year
having max(sales_Amount) > 500

--10. Display Regions with at Least 3 Distinct Products Sold.
select region, count(Product) as 'Number of Product' from Sales_data 
group by region
having count(Product) >= 3

--11. Display Years with Minimum Sales Less Than 1000
select year, min(sales_Amount) as 'Min Amount' from Sales_data 
group by year
having min(sales_Amount) < 1000

--12. Display Total Sales Amount by Region for Year 2023, Sorted by Total Amountnt
select region, sum(Sales_Amount) as 'Total Amount' from Sales_data 
where year = 2023
group by region
order by sum(sales_Amount) 



--                                Part – B:
--1. Display Count of Orders by Year and Region, Sorted by Year and Region
select year , region , count(Product) from SALES_DATA
group by year , region 
order by year , region 

--2. Display Regions with Maximum Sales Amount Exceeding 1000 in Any Year, Sorted by Region
select region , max(Sales_Amount) as 'Max Amount' from SALES_DATA
group by Region
having max(Sales_Amount) > 1000
order by Region

--3. Display Years with Total Sales Amount Less Than 1000, Sorted by Year Descending
select year , sum(Sales_Amount) as 'Total Amount' from SALES_DATA
group by year
having sum(Sales_Amount) < 1000
order by year desc

--4. Display Top 3 Regions by Total Sales Amount in Year 2024
select top 3 region , sum(sales_amount) from SALES_DATA
where year = 2024
group by Region




--                                   Part – C:
--1. Display Products with Average Sales Amount Between 1000 and 2000, Ordered by Product Name
select product , avg(Sales_Amount) as 'avg Amount' from SALES_DATA
where Sales_Amount between 1000 and 2000
group by Product
order by Product

--2. Display Years with More Than 5 Orders from Each Region
select year , region , count(Product) as 'Total Product' from SALES_DATA
group by year , region 
having count(product) > 5
order by region


--3. Display Regions with Average Sales Amount Above 1500 in Year 2023 sort by amount in descending.
select region , avg(Sales_Amount) as 'avg Amount' from SALES_DATA
where year = 2023
group by region
having avg(Sales_Amount) > 1500
order by region

--4. Find out region wise duplicate product.
select region , product from SALES_DATA
group by region , product 
having count(Product) > 1

--5. Find out region wise highest sales amount.
select region , max(Sales_Amount) from SALES_DATA
group by Region