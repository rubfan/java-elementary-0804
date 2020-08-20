/*
1. Написать SQL скрипт создания и заполнения таблиц данными с картинки
*/
CREATE TABLE Salespeople
(
    snum  INT PRIMARY KEY NOT NULL UNIQUE,
    sname VARCHAR(50)     NOT NULL,
    city  VARCHAR(20)     NOT NULL,
    comm  DECIMAL(10, 2)  NOT NULL
);

CREATE TABLE  Customers
(
    cnum   INT PRIMARY KEY NOT NULL UNIQUE,
    cname  VARCHAR(50)     NOT NULL,
    city   VARCHAR(20)     NOT NULL,
    rating INT             NOT NULL,
    snum   INT             NOT NULL,
    FOREIGN KEY (snum)
        REFERENCES Salespeople (snum)
);

CREATE TABLE Orders
(
    onum  INT PRIMARY KEY NOT NULL UNIQUE,
    amt   DECIMAL(10, 2)  NOT NULL,
    odate DATE            NOT NULL,
    cnum  INT             NOT NULL,
    snum  INT             NOT NULL,
    FOREIGN KEY (cnum)
        REFERENCES Customers (cnum),
    FOREIGN KEY (snum)
        REFERENCES Salespeople (snum)
);

INSERT INTO Salespeople (snum, sname, city, comm)
VALUES (1002, 'Serres', 'San Jose', 0.13),
       (1007, 'Rifkin', 'Barcelona', 0.15),
       (1001, 'Peel', 'London', 0.12),
       (1004, 'Mokita', 'London', 0.11),
       (1003, 'Alexrod', 'New York', 0.1);

INSERT INTO Customers (cnum, cname, city, rating, snum)
VALUES (2001, 'Hoffman', 'London', 100, 1001),
       (2002, 'Giovanni', 'Rome', 200, 1003),
       (2003, 'Liu', 'SanJose', 200, 1002),
       (2004, 'Grass', 'Berlin', 300, 1002),
       (2006, 'Clemens', 'London', 100, 1001),
       (2007, 'Pereira', 'Rome', 100, 1004),
       (2008, 'Cisneros', 'SanJose', 300, 1007);

INSERT INTO Orders (onum, amt, odate, cnum, snum)
VALUES (3001, 18.69, '2015-03-10', 2008, 1007),
       (3007, 75.75, '2015-04-10', 2004, 1002),
       (3003, 767.19, '2015-03-10', 2001, 1001),
       (3006, 1098.16, '2015-03-10', 2008, 1007),
       (3010, 1309.95, '2015-06-10', 2004, 1002),
       (3009, 1713.23, '2015-04-10', 2002, 1003),
       (3002, 1900.10, '2015-03-10', 2007, 1004),
       (3008, 4723.00, '2015-05-10', 2006, 1001),
       (3005, 5160.45, '2015-03-10', 2003, 1002),
       (3011, 9891.88, '2015-06-10', 2006, 1001);
/*
2. Напишите команду SELECT, которая бы вывела номер заказа, сумму, и дату
для всех строк из таблицы Заказов.
*/
SELECT onum, amt, odate FROM Orders;
/*
3. Напишите запрос, который вывел бы все строки из таблицы Заказчиков, для
которых номер продавца равен 1001.
*/
SELECT * FROM Customers
WHERE snum = 1001;
/*
4. Напишите запрос, который вывел бы таблицу со столбцами в следующем
порядке: city, sname, snum, comm.
*/
SELECT city, sname, snum, comm FROM Salespeople;
/*
5. Напишите команду SELECT которая вывела бы оценку (rating), сопровождаемую
именем каждого заказчика в San Jose.
*/
SELECT rating, cname FROM Customers
WHERE city = 'SanJose';
/*
6. Напишите запрос, который вывел бы значения snum всех продавцов в текущем
порядке из таблицы Заказов без каких бы то ни было повторений
*/
SELECT DISTINCT snum FROM Orders;
/*
7. Напишите запрос, который отображает все заказы со значениями суммы выше чем $1,000.
*/
SELECT * FROM Orders
WHERE amt > 1000;
/*
8. Напишите запрос, который находит sname и city для всех продавцов в Лондоне
с комиссионными выше 0.1.
*/
SELECT sname, city FROM Salespeople
WHERE city = 'London' AND comm > 0.1;
/*
9. Напишите запрос к таблице Заказчиков для отображения всех заказчиков с рейтингом
не более 100, если они не находятся в Риме.
*/
SELECT * FROM Customers
WHERE NOT (rating > 100 AND city <> 'Rome');

/*
11. Напишите два запроса которые могли бы вывести все заказы за 3 или 4 Октября 2015.
*/
SELECT * FROM Orders
WHERE odate IN ('2015-03-10', '2015-04-10');

SELECT * FROM Orders
WHERE odate BETWEEN '2015-03-10' AND '2015-04-10';
/*
12. Напишите запрос который выберет всех заказчиков обслуживаемых продавцами Peel или Motika.
*/
SELECT * FROM Customers
WHERE snum IN (1001,1004);
/*
13. Напишите запрос, который может вывести всех заказчиков, чьи имена начинаются с
буквы попадающей в диапазон от A до G.
*/
SELECT * FROM Customers
WHERE cname BETWEEN 'A' AND 'G';
/*
14. Напишите запрос который выберет всех пользователей чьи имена начинаются с буквы C.
*/
SELECT * FROM Customers
WHERE cname LIKE 'C%';
/*
15. Напишите запрос который выберет все порядки имеющие нулевые значения или NULL
в поле amt (сумма).
*/
SELECT * FROM Orders
WHERE  amt = 0 OR amt IS NULL;
/*
16. Напишите запрос, который сосчитал бы все суммы приобретений на 3 Октября.
*/
SELECT SUM(amt) FROM Orders
WHERE odate = '2015-03-10';
/*
17. Напишите запрос, который сосчитал бы число различных не-NULL значений поля
 city в таблице Заказчиков.
*/
SELECT COUNT(DISTINCT city) FROM Customers;
/*
18. Напишите запрос, который выбрал бы наименьшую сумму для каждого заказчика.
*/
SELECT cnum, MIN(amt) FROM Orders
GROUP BY cnum;
/*
19. Напишите запрос, который бы выбирал заказчиков в алфавитном порядке, чьи
имена начинаются с буквы G.
*/
SELECT MIN(cname) FROM Customers
WHERE cname LIKE 'G%';
/*
20. Напишите запрос, который выбрал бы высшую оценку в каждом городе.
*/
SELECT city, MAX(rating) FROM Customers
GROUP BY city;
/*
21. Напишите запрос, который сосчитал бы число заказчиков, регистрирующих
каждый день свои заказы. (Если продавец имел более одного заказа в данный день,
он должен учитываться только один раз.)
*/
SELECT odate, COUNT(DISTINCT snum) FROM Orders
GROUP BY odate;
/*
22. Предположим что каждый продавец имеет 12% комиссионных. Напишите запрос к
таблице заказов, который мог бы вывести номер заказа, номер продавца, и
сумму комиссионных продавца для этого заказа.
*/
SELECT onum, snum, amt * 0.12 FROM Orders;
/*
23. Напишите запрос к таблице Заказчиков который мог бы найти высшую оценку в
каждом городе. Вывод должен быть в такой форме: For the city [city],
the highest rating is: [rating].
*/
SELECT 'For the city ', city, ', the highest rating is: ', MAX(rating) FROM Customers
GROUP BY city;
/*
24. Напишите запрос, который выводил бы список заказчиков в нисходящем порядке.
Вывод поля оценки (rating) должен сопровождаться именем заказчика и его номером.
*/
SELECT cnum, cname, rating FROM Customers
ORDER BY rating DESC;
/*
25. Напишите запрос, который бы вывел список номеров заказов, сопровождающихся
именем заказчика, который создавал эти заказы.
*/
SELECT onum, cname FROM Orders, Customers
WHERE Customers.cnum = Orders.cnum;
/*
26. Напишите запрос, который бы выдавал имена продавца и заказчика для каждого
заказа после номера заказа.
*/
SELECT onum,  sname, cname FROM Orders, Customers, Salespeople
WHERE Customers.cnum = Orders.cnum
  AND Salespeople.snum = Orders.snum;
/*
27. Напишите запрос, который бы выводил всех заказчиков, обслуживаемых продавцом
с комиссионными выше 12%. Выведите имя заказчика, имя продавца и ставку
комиссионных продавца.
*/
SELECT cname, sname, comm FROM Salespeople, Customers
WHERE Salespeople.snum = Customers.snum
AND comm > 0.12;
/*
28. Напишите запрос, который вычислил бы сумму комиссионных продавца для каждого
заказа заказчика с оценкой выше 100.
*/
SELECT onum, comm * amt FROM Salespeople, Orders, Customers
WHERE rating > 100
  AND Orders.cnum = Customers.cnum
  AND Orders.snum = Salespeople.snum;
/*
29. Напишите запрос, который бы вывел все пары продавцов, живущих в одном и том
же городе. Исключите комбинации продавцов с ними же, а также дубликаты строк,
выводимых в обратным порядке
*/
SELECT a.sname, b.sname FROM Salespeople AS a, Salespeople AS b
WHERE a.city = b.city
  AND a.sname < b.sname;
/*
30. Напишите запрос, который вывел бы все пары порядков по данным заказчикам,
именам этих заказчиков, и исключал дубликаты из вывода, как в предыдущем вопросе.
*/
SELECT cname, a.onum, b.onum FROM Orders AS a, Orders AS b, Customers AS c
WHERE a.cnum = b.cnum
  AND a.cnum = c.cnum
  AND a.onum < b.onum;
/*
31. Напишите запрос, который вывел бы имена (cname) и города (city) всех заказчиков
с такой же оценкой (rating) как у Hoffmanа. Напишите запрос, использующий
поле cnum Hoffmanа, а не его оценку, так чтобы оно могло быть использовано,
если его оценка вдруг изменится.
*/
SELECT a.cname, a.city FROM Customers AS a, Customers AS b
WHERE a.rating = b.rating
  AND b.cnum = 2001;
/*
32. Напишите запрос, который бы использовал подзапрос для получения всех заказов
для заказчика с именем Cisneros. Предположим, что вы не знаете номера этого
заказчика, указываемого в поле cnum.
*/
SELECT * FROM Orders
WHERE cnum =
      (SELECT cnum
       FROM Customers
       WHERE cname = 'Cisneros');
/*
33. Напишите запрос, который вывел бы имена и оценки всех заказчиков, которые
имеют усредненные заказы.
*/
SELECT DISTINCT cname, rating  FROM Customers, Orders
WHERE amt >
      (SELECT AVG (amt)
       FROM Orders)
  AND Orders.cnum = Customers.cnum;
/*
34. Напишите запрос, который бы выбрал общую сумму всех приобретений в порядках
для каждого продавца, у которого эта общая сумма больше, чем сумма наибольшего
заказа в таблице.
*/
SELECT snum, SUM(amt) FROM Orders
GROUP BY snum
HAVING SUM(amt) >
       (SELECT MAX(amt)
        FROM Orders);
/*
35. Напишите команду SELECT, использующую подзапрос, которая выберет имена и номера
всех заказчиков с максимальными для их городов оценками.
*/
SELECT cnum, cname FROM Customers AS a
WHERE rating =
    (SELECT MAX(rating)
    FROM Customers b
    WHERE b.city = a.city);
/*
36. Напишите два запроса, которые выберут всех продавцов (по их имени и номеру) которые,
в своих городах имеют заказчиков, которых они не обслуживают.
Один запрос — с использованием объединения и один — с подзапросом.
*/
SELECT DISTINCT a.snum, sname FROM Salespeople AS a, Customers AS b
WHERE a.city = b.city
  AND a.snum <> b.snum;

SELECT snum, sname FROM Salespeople AS a
WHERE city IN
      (SELECT city
       FROM Customers b
           WHERE b.snum <> a.snum);