# Напишите запрос, который бы вывел все пары продавцов, живущих в одном и том же городе. 
# Исключите комбинации продавцов с ними же, а также дубликаты строк, выводимых в обратным порядке
SELECT original.sname, copy.sname 
FROM Salespeople original, Salespeople copy 
WHERE original.city = copy.city 
AND original.sname < copy.sname;
 