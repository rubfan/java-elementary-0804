# Напишите запрос, который вывел бы имена (cname) и города (city) всех заказчиков с такой же оценкой (rating) как у Hoffmanа. 
# Напишите запрос, использующий поле cnum Hoffmanа, а не его  оценку, так чтобы оно могло быть использовано, если его оценка вдруг изменится.
SELECT cname, city FROM Customers
WHERE rating = (SELECT rating FROM Customers WHERE cnum = 2001);
