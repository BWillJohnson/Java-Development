-- ReinForcement LAB: BrandonJohnson

-- Challenge 1:
Select title
From books b
WHERE  b.BookID = 'B102';

-- Challenge 2:
SELECT c.CategoryName, COUNT(*) AS NumOfBooks
FROM books b
INNER JOIN categories c ON b.CategoryID = c.CategoryID
GROUP BY c.CategoryName
LIMIT 1;

-- Challenge 3:
SELECT a.Name, COUNT(*) AS NumOfBooksWritten
FROM authors a
INNER JOIN Books b ON a.AuthorID = b.AuthorID
GROUP BY a.AuthorID
ORDER BY NumOfBooksWritten DESC
LIMIT 1;

-- Challenge 4:
SELECT *
FROM Books b
INNER JOIN categories c ON b.categoryID
WHERE c.CategoryName = 'Adventure';
-- Challenge 5:
Select b.title
FROM Orders o
INNER JOIN 

SELECT 