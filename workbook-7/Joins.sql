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
					ON p.SupplierID = s.SupplierID
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
SELECT p.ProductName, c.CategoryName AS Category
FROM products p
			INNER JOIN categories c
            ON p.CategoryID = c.CategoryID
            WHERE p.UnitPrice =(SELECT MAX(UnitPrice)
											FROM products p);
            
-- Question 5:
SELECT o.OrderID, o.shipName, o.ShipAddress,ship.CompanyName
FROM Orders o
INNER JOIN shippers ship ON o.ShipVia = ship.ShipperID
WHERE o.ShipCountry LIKE 'Germany';


-- Question 6:
SELECT o.orderID, o.orderDate,o.shipName, o.ShipAddress
FROM Orders o
INNER JOIN `order details` od ON o.orderID = od.OrderID
INNER JOIN products p ON od.ProductID = p.productID
WHERE p.productName = 'Sasquatch Ale';