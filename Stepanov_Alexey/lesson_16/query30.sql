# Напишите запрос, который вывел бы все пары порядков по данным заказчикам, именам этих заказчиков, и исключал дубликаты из вывода, как в предыдущем вопросе.
SELECT original.cname, copy.cname 
FROM Customers original, Customers copy
WHERE original.city = copy.city
AND original.cname < copy.cname;
