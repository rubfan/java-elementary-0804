# Напишите запрос который выберет всех заказчиков обслуживаемых продавцами Peel или Motika.
SELECT cname FROM Customers
INNER JOIN Salespeople
ON Customers.snum = Salespeople.snum
WHERE sname = 'Peel' or sname = 'Motika';
