# Напишите запрос к таблице Заказчиков который мог бы найти высшую оценку в каждом городе. 
# Вывод должен быть в такой форме: For the city [city], the highest rating is: [rating].
SELECT CONCAT('For the city ', city, ', the highest rating is: ', MAX(rating)) FROM Customers GROUP BY city;
