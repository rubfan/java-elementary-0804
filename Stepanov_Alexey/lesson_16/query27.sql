# Напишите запрос, который бы выводил всех заказчиков, обслуживаемых продавцом с комиссионными выше 12%. 
# Выведите имя заказчика, имя продавца и ставку комиссионных продавца.
SELECT cname, sname, comm FROM Customers
INNER JOIN Salespeople
ON Customers.snum = Salespeople.snum
WHERE comm > 0.12;
