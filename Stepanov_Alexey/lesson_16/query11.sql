# Напишите два запроса которые могли бы вывести все заказы за 3 или 4 Октября 2015.
SELECT * FROM Orders WHERE odate = '2015-03-10';
SELECT * FROM Orders WHERE odate = '2015-04-10';
