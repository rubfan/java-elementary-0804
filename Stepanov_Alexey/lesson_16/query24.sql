# Напишите запрос, который выводил бы список заказчиков в нисходящем порядке. 
# Вывод поля оценки (rating) должен сопровождаться именем заказчика и его номером.
SELECT rating, cname, cnum FROM Customers ORDER BY cname DESC;
