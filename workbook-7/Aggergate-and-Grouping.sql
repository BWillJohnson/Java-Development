-- Question 1:
SELECT COUNT(*)
FROM Suppliers;
-- Question 2:
SELECT SUM(Salary)
FROM employees;
-- Question 3:
SELECT  MIN(UnitPrice)
FROM products;
-- Question 4:
SELECT AVG(UnitPrice)
FROM products;
-- Question 5:
SELECT MAX(UnitPrice)
FROM Products;
-- Question 6:
SELECT SupplierID, count(*) AS NumProducts
FROM products
group by SupplierID;
-- Question 7:
SELECT CategoryID,AVG(UnitPrice)
FROM products
group by CategoryID;
-- Question 8:
SELECT SupplierID, count(*) AS NumProducts
FROM products
GROUP BY SupplierID
HAVING NumProducts >= 5;
-- Question 9:
SELECT ProductID, ProductName, UnitPrice * UnitsInStock AS InventoryValue
FROM Products
ORDER BY InventoryValue DESC, ProductName;