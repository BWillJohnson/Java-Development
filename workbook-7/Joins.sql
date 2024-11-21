-- Question 1: 
SELECT p.ProductID,p.ProductName,p.UnitPrice, c.CategoryName
From products p
INNER JOIN categories c
                   ON p.CategoryID = c.CategoryID
                   ORDER  BY c.CategoryName, p.ProductName;
-- Question 2:
SELECT p.ProductID, p.ProductName, p.UnitPrice, s.ContactName
FROM products p
RIGHT JOIN suppliers s
					ON p.ProductName = s.ContactName
                    WHERE p.UnitPrice < 75
                    ORDER BY p.ProductName;
-- Question 3:

-- Question 4:

-- Question 5:

-- Question 6: