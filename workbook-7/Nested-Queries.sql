-- Question 1:
SELECT ProductName, UnitPrice
FROM Products
Where UnitPrice = (SELECT MAX(UnitPrice) AS MostExpensive
                          FROM products);
-- Question 2:
SELECT OrderID, ShipName, ShipAddress
FROM orders
WHERE ShipVia = (SELECT ShipperID
FROM Shippers
WHERE CompanyName = 'Federal Shipping');
-- Question 3:
SELECT OrderID
FROM `order details`
WHERE ProductID =(SELECT ProductID
						FROM products
						WHERE ProductName = 'Sasquatch Ale');
-- Question 4:
SELECT FirstName,LastName
FROM employees
WHERE EmployeeID = (
SELECT EmployeeID
FROM orders
WHERE OrderID = 10266);
-- Question 5:
SELECT CompanyNAme
FROM customers
WHERE CustomerID= (
SELECT CustomerID
FROM orders
WHERE OrderID = 10266);
