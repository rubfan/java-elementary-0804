# Напишите команду SELECT, использующую подзапрос, которая выберет имена и номера всех заказчиков с максимальными для их городов оценками.
# SELECT cname, cnum FROM Customers WHERE city = (SELECT city, cname WHERE MAX(rating))
SELECT cname, cnum FROM Customers external
WHERE rating = (
	SELECT MAX(rating) 
	FROM Customers internal 
	WHERE external.city = internal.city);
