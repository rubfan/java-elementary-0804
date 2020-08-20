# Напишите запрос, который вывел бы имена и оценки всех заказчиков, которые имеют усредненные заказы.
SELECT cname, rating FROM Customers
INNER JOIN Orders
ON Customers.cnum = Orders.cnum
WHERE amt = (SELECT AVG(amt) FROM Orders);
