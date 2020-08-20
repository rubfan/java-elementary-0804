# Напишите запрос, который выбрал бы высшую оценку в каждом городе.
SELECT city, MAX(rating) FROM Customers GROUP BY city;
