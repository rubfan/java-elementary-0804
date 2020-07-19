# Напишите запрос, который сосчитал бы число различных не-NULL значений поля city в таблице Заказчиков.
SELECT COUNT(DISTINCT city) FROM Customers WHERE city IS NOT NULL;
