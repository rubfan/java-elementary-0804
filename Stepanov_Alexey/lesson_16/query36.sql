# Напишите два запроса, которые выберут всех продавцов (по их имени и номеру) которые, в своих городах имеют заказчиков, которых они не обслуживают. 
# Один запрос — с использованием объединения и один — с подзапросом.

# Join solution:
SELECT DISTINCT sname, Salespeople.snum FROM Salespeople 
INNER JOIN Customers
ON Salespeople.city = Customers.city
WHERE Salespeople.city = Customers.city
AND Salespeople.snum <> Customers.snum;

# Subquery solution
SELECT sname, snum FROM Salespeople external 
WHERE city IN (
	SELECT city FROM Customers internal 
	WHERE external.snum <> internal.snum);
