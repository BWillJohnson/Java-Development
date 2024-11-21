-- Question 1: 
SELECT p.ProductID,p.ProductName, p.UnitPrice, c.CategoryName
From products p
INNER JOIN categories c
                   ON p.CategoryID = c.CategoryID
                   ORDER  BY c.CategoryName, p.ProductName;
-- Question 2:
SELECT p.ProductID, p.ProductName, p.UnitPrice, s.CompanyName AS SupplierName
FROM products p
RIGHT JOIN suppliers s
					ON p.ProductID = s.SupplierID
                    WHERE p.UnitPrice > 75
                    ORDER BY p.ProductName;
-- Question 3:
SELECT p.ProductID, p.ProductName, p.UnitPrice, c.CategoryName, s.CompanyName AS SupplierName 
FROM products p
				INNER JOIN categories c
				ON p.CategoryID = c.CategoryID
				INNER JOIN suppliers s
                ON p.SupplierID = s.SupplierID
                ORDER BY p.ProductName;
-- Question 4:
SELECT p.ProductName, p.UnitPrice, c.Description AS Category
FROM products p
			INNER JOIN categories c
            ORDER BY p.UnitPrice DESC;
            
-- Question 5:
SELECT o.OrderID, o.shipName, o.ShipAddress,
FROM Orders o;


-- Question 6: