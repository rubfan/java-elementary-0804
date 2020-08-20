# Напишите запрос, который выбрал бы наименьшую сумму для каждого заказчика.
SELECT cname, MIN(amt) FROM Customers
INNER JOIN Orders
ON Customers.cnum = Orders.cnum
GROUP BY cname;
