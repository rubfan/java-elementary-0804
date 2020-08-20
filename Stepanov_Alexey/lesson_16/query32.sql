# Напишите запрос, который бы использовал подзапрос для получения всех заказов для заказчика с именем Cisneros. 
# Предположим, что вы не знаете номера этого заказчика, указываемого в поле cnum.
SELECT * FROM Orders
WHERE cnum = (SELECT cnum FROM Customers WHERE cname = 'Cisneros'); 
