-- Question 1:
SELECT * FROM products;

-- Question 2:
SELECT ProductID, ProductName,UnitPrice
FROM products;
-- Question 3:
SELECT  ProductID, ProductName,UnitPrice
FROM products
ORDER BY UnitPrice ASC;
-- Question 4:
SELECT  ProductName,UnitPrice
FROM products
WHERE UnitPrice < 7.50 ;
-- Question 5:
SELECT * 
FROM Products
where UnitsInStock >= 100 
ORDER BY UnitPrice DESC;

-- Question 6:
SELECT * 
FROM Products
where UnitsInStock >= 100 
ORDER BY UnitPrice DESC, ProductName;
-- Question 7:
SELECT *
WHERE UnitsInStock = 0 AND UnitsOrder > 0
ORDER BY ProductName;
-- Question 8:
-- Categories
-- Question 9:
SELECT *
FROM categories;
-- CategoryID 8 
-- Question 10:
SELECT ProductName, CategoryID
FROM products
WHERE CategoryID = 8;
-- Question 11:
Select FirstName,LastName
FROM employees;
-- Question 12:
select *
FROM employees
WHERE Title = MANAGER;
-- Question 13:
-- Question 14:
SELECT * 
FROM Employees
WHERE Salary BETWEEN 2000 AND 2500;
-- Question 15:
-- Question 16:
SELECT * 
FROM Products