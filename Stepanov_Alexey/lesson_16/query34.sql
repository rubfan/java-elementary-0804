# Напишите запрос, который бы выбрал общую сумму всех приобретений в порядках для каждого продавца, 
# у которого эта общая сумма больше, чем сумма наибольшего заказа в таблице.
SELECT snum, SUM(amt) FROM Orders GROUP BY snum 
HAVING SUM(amt) > (SELECT MAX(amt) FROM Orders);
