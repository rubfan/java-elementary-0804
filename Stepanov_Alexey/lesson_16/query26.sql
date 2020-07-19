# Напишите запрос, который бы выдавал имена продавца и заказчика для каждого заказа после номера заказа.
SELECT onum, sname, cname FROM Orders
INNER JOIN Customers ON Orders.cnum = Customers.cnum 
INNER JOIN Salespeople ON Orders.snum = Salespeople.snum;
