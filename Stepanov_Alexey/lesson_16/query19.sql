# Напишите запрос, который бы выбирал заказчиков в алфавитном порядке, чьи имена начинаются с буквы G.
SELECT cname FROM Customers WHERE cname LIKE 'G%' ORDER BY cname ASC;
