# Напишите запрос, который бы вывел список номеров заказов, сопровождающихся именем заказчика, который создавал эти заказы.
SELECT onum, cname FROM Orders
INNER JOIN Customers
ON Orders.cnum = Customers.cnum;
