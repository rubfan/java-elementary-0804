CREATE DATABASE Homework16;
USE Homework16;

# 1.Написать SQL скрипт создания и заполнения таблиц данными с картинки

CREATE TABLE Salespeople
(
    snum  INT         NOT NULL,
    sname VARCHAR(50) NOT NULL,
    city  VARCHAR(50) NOT NULL,
    comm  FLOAT       NOT NULL,
    PRIMARY KEY (snum)
);

CREATE TABLE Customers
(
    cnum   INT         NOT NULL,
    cname  VARCHAR(50) NOT NULL,
    city   VARCHAR(50) NOT NULL,
    rating INT         NOT NULL,
    snum   INT         NOT NULL,
    PRIMARY KEY (cnum)
);

CREATE TABLE Orders
(
    onum  INT   NOT NULL,
    amt   FLOAT NOT NULL,
    odate DATE  NOT NULL,
    cnum  INT   NOT NULL,
    snum  INT   NOT NULL,
    PRIMARY KEY (onum)
);

INSERT INTO Salespeople (snum, sname, city, comm)
    VALUE
    (1002, 'Serres', 'San Jose', 0.13),
    (1007, 'Rifkin', 'Barcelona', 0.15),
    (1001, 'Peel', 'London', 0.12),
    (1004, 'Motika', 'London', 0.11),
    (1003, 'Axelrod', 'New York', 0.1);

INSERT INTO Customers (cnum, cname, city, rating, snum)
    VALUE
    (2001, 'Hoffman', 'London', 100, 1001),
    (2002, 'Giovanni', 'Rome', 200, 1003),
    (2003, 'Liu', 'SanJose', 200, 1002),
    (2004, 'Grass', 'Berlin', 300, 1002),
    (2006, 'Clemens', 'London', 100, 1001),
    (2007, 'Pereira', 'Rome', 100, 1004),
    (2008, 'Cisneros', 'SanJose', 300, 1007);

INSERT INTO orders (onum, amt, odate, cnum, snum)
    VALUE
    (3001, 18.69, '2015-03-10', 2008, 1007),
    (3007, 75.75, '2015-04-10', 2004, 1002),
    (3003, 767.19, '2015-03-10', 2001, 1001),
    (3006, 1098.16, '2015-03-10', 2008, 1007),
    (3010, 1309.95, '2015-06-10', 2004, 1002),
    (3009, 1713.23, '2015-04-10', 2002, 1003),
    (3002, 1900.1, '2015-03-10', 2007, 1004),
    (3008, 4723, '2015-05-10', 2006, 1001),
    (3005, 5160.45, '2015-03-10', 2003, 1002),
    (3011, 9891.88, '2015-06-10', 2006, 1001);

# 2. Напишите команду SELECT, которая бы вывела номер заказа, сумму, и дату для всех строк из таблицы Заказов.
SELECT onum, amt, odate
FROM orders;

# 3. Напишите запрос, который вывел бы все строки из таблицы Заказчиков, для которых номер продавца равен 1001.
SELECT *
FROM orders
WHERE snum = 1001;

# 4. Напишите запрос, который вывел бы таблицу со столбцами в следующем порядке: city, sname, snum, comm.
SELECT city, sname, snum, comm
FROM salespeople;

# 5. Напишите команду SELECT которая вывела бы оценку (rating), сопровождаемую именем каждого заказчика в San Jose.
SELECT rating, cname
FROM customers
WHERE city = 'SanJose';

# 6. Напишите запрос, который вывел бы значения snum всех продавцов в текущем порядке из таблицы Заказов без каких бы то ни было повторений.
SELECT snum
FROM orders
GROUP BY snum;

# 7. Напишите запрос, который отображает все заказы со значениями суммы выше чем $1,000.
SELECT *
FROM orders
WHERE amt > 1000;

# 8. Напишите запрос, который находит sname и city для всех продавцов в Лондоне с комиссионными выше 0.1.
SELECT sname, city
FROM salespeople
WHERE comm > 0.1
  AND city = 'London';

# 9. Напишите запрос к таблице Заказчиков для отображения всех заказчиков с рейтингом не более 100, если они не находятся в Риме.
SELECT cname
FROM customers
WHERE rating <= 100
  AND city != 'Rome';

# 10. Что будет выведено в результате запроса: (9.?)
Hoffman
Clemens

# 11. Напишите два запроса которые могли бы вывести все заказы за 3 или 4 Октября 2015.
SELECT *
FROM orders
WHERE odate = '2015-03-10';
SELECT *
FROM orders
WHERE odate = '2015-04-10';

SELECT *
FROM Orders
WHERE odate IN ('2015-03-10', '2015-04-10');

SELECT *
FROM Orders
WHERE odate BETWEEN '2015-03-10' AND '2015-04-10';

# 12. Напишите запрос который выберет всех заказчиков обслуживаемых продавцами Peel или Motika.
SELECT *
FROM Customers
WHERE snum IN (1001, 1004);

# 13. Напишите запрос, который может вывести всех заказчиков, чьи имена начинаются с буквы попадающей в диапазон от A до G.
SELECT *
FROM Customers
WHERE cname BETWEEN 'A' AND 'G';

SELECT *
FROM Customers
WHERE cname BETWEEN 'A' AND 'G';
    (если G включительно)

    14. Напишите запрос который выберет всех пользователей чьи имена начинаются с буквы C.
SELECT * FROM Customers WHERE cname LIKE 'C%';

# 15. Напишите запрос который выберет все порядки имеющие нулевые значения или NULL в поле amt (сумма).
SELECT *
FROM Orders
WHERE amt = 0
   OR amt IS NULL;

# 16. Напишите запрос, который сосчитал бы все суммы приобретений на 3 Октября.
SELECT SUM(amt), COUNT(*)
FROM Orders
WHERE odate = '2015-03-10';

# 17. Напишите запрос, который сосчитал бы число различных не-NULL значений поля city в таблице Заказчиков.
SELECT COUNT(DISTINCT city)
FROM customers
WHERE city IS NOT NULL;

# 18. Напишите запрос, который выбрал бы наименьшую сумму для каждого заказчика.
SELECT snum, MIN(amt)
FROM orders
GROUP BY snum;

# 19. Напишите запрос, который бы выбирал заказчиков в алфавитном порядке, чьи имена начинаются с буквы G.
SELECT cname
FROM customers
WHERE cname LIKE 'G%'
ORDER BY cname;

# 20. Напишите запрос, который выбрал бы высшую оценку в каждом городе.
SELECT MAX(rating), city
FROM customers
GROUP BY city;

# 21. Напишите запрос, который сосчитал бы число заказчиков, регистрирующих каждый день свои заказы. (Если продавец имел более одного заказа в данный день, он должен учитываться только один раз.)
SELECT odate, COUNT(DISTINCT cnum)
FROM orders
GROUP BY odate;

# 22. Предположим что каждый продавец имеет 12% комиссионных. Напишите запрос к таблице заказов, который мог бы вывести номер заказа, номер продавца, и сумму комиссионных продавца для этого заказа.
SELECT onum, snum, ROUND(amt * .12, 3)
FROM orders;

# 23. Напишите запрос к таблице Заказчиков который мог бы найти высшую оценку в каждом городе. Вывод должен быть в такой форме: For the city [city], the highest rating is: [rating].
SELECT 'For the city ', city, ', the highest rating is: ', MAX(rating)
FROM customers
GROUP BY city;

# 24. Напишите запрос, который выводил бы список заказчиков в нисходящем порядке. Вывод поля оценки (rating) должен сопровождаться именем заказчика и его номером.
SELECT rating, cname, cnum
FROM Customers
ORDER BY rating DESC;

# 25. Напишите запрос, который бы вывел список номеров заказов, сопровождающихся именем заказчика, который создавал эти заказы.
SELECT onum, cname
FROM orders,
     Customers
WHERE orders.cnum = customers.cnum;

# 26. Напишите запрос, который бы выдавал имена продавца и заказчика для каждого заказа после номера заказа.
SELECT onum, cname, sname
FROM orders,
     customers,
     salespeople
WHERE customers.cnum = orders.cnum
  AND salespeople.snum = orders.snum;

# 27. Напишите запрос, который бы выводил всех заказчиков, обслуживаемых продавцом с комиссионными выше 12%. Выведите имя заказчика, имя продавца и ставку комиссионных продавца.
SELECT cname, sname, comm
FROM customers,
     salespeople,
     orders
WHERE customers.snum = salespeople.snum
  AND comm > 0.12;

# 28. Напишите запрос, который вычислил бы сумму комиссионных продавца для каждого заказа заказчика с оценкой выше 100.
SELECT onum, comm * amt
FROM Salespeople,
     Orders,
     Customers
WHERE Orders.cnum = Customers.cnum
  AND Orders.snum = Salespeople.snum
  AND rating > 100;

# 29. Напишите запрос, который бы вывел все пары продавцов, живущих в одном и том же городе. Исключите комбинации продавцов с ними же, а также дубликаты строк, выводимых в обратным порядке.
SELECT first.sname, second.sname
FROM Salespeople first,
     Salespeople second
WHERE first.city = second.city
  AND first.sname < second.sname;

# 30. Напишите запрос, который вывел бы все пары порядков по данным заказчикам, именам этих заказчиков, и исключал дубликаты из вывода, как в предыдущем вопросе.
SELECT first.onum, second.onum, cname
FROM orders first,
     orders second,
     customers
WHERE first.cnum = second.cnum
  AND first.onum < second.onum
  AND customers.cnum = first.cnum;

# 31. Напишите запрос, который вывел бы имена (cname) и города (city) всех заказчиков с такой же оценкой (rating) как у Hoffmanа. Напишите запрос, использующий поле cnum Hoffmanа, а не его оценку, так чтобы оно могло быть использовано, если его оценка вдруг изменится.
SELECT first.cname, first.city
FROM customers first,
     customers second
WHERE first.rating = second.rating
  AND second.cname = 'Hoffman'
  AND first.cname != 'Hoffman';

# 32. Напишите запрос, который бы использовал подзапрос для получения всех заказов для заказчика с именем Cisneros. Предположим, что вы не знаете номера этого заказчика, указываемого в поле cnum.
SELECT *
FROM orders
WHERE cnum =
      (SELECT cnum
       FROM customers
       WHERE cname = 'Cisneros');

# 33. Напишите запрос, который вывел бы имена и оценки всех заказчиков, которые имеют усредненные заказы.
SELECT DISTINCT cname, rating
FROM customers,
     orders
WHERE amt >
      (SELECT AVG(amt)
       FROM orders)
  AND orders.cnum = customers.cnum;

# 34. Напишите запрос, который бы выбрал общую сумму всех приобретений в порядках для каждого продавца, у которого эта общая сумма больше, чем сумма наибольшего заказа в таблице.
SELECT snum, SUM(amt)
FROM Orders
GROUP BY snum
HAVING SUM(amt) >
       (SELECT MAX(amt)
        FROM Orders);

# 35. Напишите команду SELECT, использующую подзапрос, которая выберет имена и номера всех заказчиков с максимальными для их городов оценками.
SELECT cnum, cname
FROM Customers offside
WHERE rating =
      (SELECT MAX(rating)
       FROM Customers inside
       WHERE inside.city = offside.city);

# 36. Напишите два запроса, которые выберут всех продавцов (по их имени и номеру) которые, в своих городах имеют заказчиков, которых они не обслуживают. Один запрос — с использованием объединения и один — с подзапросом.
SELECT snum, sname
FROM Salespeople a
WHERE city IN
      (SELECT city
       FROM Customers b
       WHERE b.snum <> a.snum);



SELECT DISTINCT first.snum, sname
FROM Salespeople first,
     Customers second
WHERE first.city = second.city
  AND first.snum <> second.snum;



