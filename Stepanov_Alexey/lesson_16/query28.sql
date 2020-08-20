# Напишите запрос, который вычислил бы сумму комиссионных продавца для каждого заказа заказчика с оценкой выше 100.
SELECT onum, sname, cname, (comm * amt) FROM Orders
INNER JOIN Salespeople ON Orders.snum = Salespeople.snum
INNER JOIN Customers ON Orders.cnum = Customers.cnum;
