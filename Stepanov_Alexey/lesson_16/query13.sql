# Напишите запрос, который может вывести всех заказчиков, чьи имена начинаются с буквы попадающей в диапазон от A до G.
SELECT cname FROM Customers WHERE cname REGEXP '^[A-G]';
# or 
SELECT cname FROM Customers WHERE cname BETWEEN 'A' AND 'H';
