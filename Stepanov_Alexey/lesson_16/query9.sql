# Напишите запрос к таблице Заказчиков для отображения всех заказчиков с рейтингом не более 100, если они не находятся в Риме.
SELECT cname FROM Customers WHERE rating <= 100 and city <> 'Rome';
