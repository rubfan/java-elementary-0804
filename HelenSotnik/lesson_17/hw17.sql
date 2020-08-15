# 1.Написать SQL скрипт создания и заполнения таблиц данными с каптинки

CREATE DATABASE hw17;

USE hw17;

CREATE TABLE Salespeople (
snum BIGINT NOT NULL, 
sname VARCHAR(50) NOT NULL,
city VARCHAR(50) NOT NULL,
comm DOUBLE NOT NULL DEFAULT 0,
PRIMARY KEY (snum)
);

INSERT INTO Salespeople 
(snum, sname, city, comm)
VALUES  (1002, 'Serres', 'San Jose', 0.13),
		(1007, 'Rifkin', 'Barselona', 0.15),
		(1001, 'Peel', 'London', 0.12),
		(1004, 'Motika', 'London', 0.11),
		(1003, 'Axelrod', 'New York', 0.1);

CREATE TABLE Customers (
cnum BIGINT NOT NULL,
cname VARCHAR(50) NOT NULL,
city VARCHAR(50) NOT NULL,
rating BIGINT NOT NULL,
snum BIGINT NOT NULL,
PRIMARY KEY (cnum),
FOREIGN KEY (snum) REFERENCES Salespeople (snum)
);

INSERT INTO Customers 
(cnum, cname, city, rating, snum)
VALUES  (2001, 'Hoffman', 'London', 100, 1001),
		(2002, 'Giovanni', 'Rome', 200, 1003),
		(2003, 'Liu', 'SanJose', 200, 1002),
		(2004, 'Grass', 'Berlin', 300, 1002),
		(2006, 'Clemens', 'London', 100, 1001),
		(2007, 'Pereira', 'Rome', 100, 1004),
		(2008, 'Cisneros', 'SanJose', 300, 1007);

CREATE TABLE Orders (
onum BIGINT NOT NULL,
amt DOUBLE NOT NULL DEFAULT 0,
odate DATE NOT NULL,
cnum BIGINT NOT NULL,
snum BIGINT NOT NULL,
PRIMARY KEY (onum),
FOREIGN KEY (snum) REFERENCES Salespeople (snum),
FOREIGN KEY (cnum) REFERENCES Customers (cnum)
);

INSERT INTO Orders 
(onum, amt, odate, cnum, snum)
VALUES  (3001, 18.69, '2015-03-10', 2008, 1007),
		(3007, 75.75, '2015-04-10', 2004, 1002),
		(3003, 767.19, '2015-03-10', 2001, 1001),
		(3006, 1098.16, '2015-03-10', 2008, 1007),
		(3010, 1309.95, '2015-06-10', 2004, 1002),
		(3009, 1713.23, '2015-04-10', 2002, 1003),
		(3002, 1900.1, '2015-03-10', 2007, 1004),
		(3008, 4723, '2015-05-10', 2006, 1001),
		(3005, 5160.45, '2015-03-10', 2003, 1002),
		(3011, 9891.88, '2015-06-10', 2006, 1001);

# 2.Напишите команду SELECT, которая бы вывела номер заказа, сумму, и дату для всех строк из таблицы Заказов.

SELECT onum,awt,odate FROM Orders;

# 3.Напишите запрос, который вывел бы все строки из таблицы Заказчиков, для которых номер продавца равен 1001.

SELECT * FROM Customers WHERE snum = 1001;

# 4.Напишите запрос, который вывел бы таблицу со столбцами в следующем порядке: city, sname, snum, comm.

SELECT city, sname, snum, comm FROM Salespeople;

# 5.Напишите команду SELECT которая вывела бы оценку (rating), сопровождаемую именем каждого заказчика в San Jose.

SELECT rating, cname FROM Customers WHERE city = 'SanJose';

# 6.Напишите запрос, который вывел бы значения snum всех продавцов в текущем порядке из таблицы Заказов без каких бы то ни было повторений

SELECT DISTINCT snum FROM Orders;

# 7.Напишите запрос, который отображает все заказы со значениями суммы выше чем $1,000.

SELECT * FROM Orders WHERE awt > 1000;

# 8.Напишите запрос, который находит sname и city для всех продавцов в Лондоне с комиссионными выше 0.1.

SELECT sname, city FROM Salespeople WHERE city = 'London' AND comm > 0.1;

# 9.Напишите запрос к таблице Заказчиков для отображения всех заказчиков с рейтингом не более 100, если они не находятся в Риме. 

SELECT * FROM Customers WHERE NOT city = 'Rome' AND rating < 100;

# 10.
# 11.Напишите два запроса которые могли бы вывести все заказы за 3 или 4 Октября 2015.

SELECT * FROM Orders WHERE odate IN ('2015-03-10', '2015-04-10');

# 12.Напишите запрос который выберет всех заказчиков обслуживаемых продавцами Peel или Motika.

SELECT * FROM Customers WHERE snum = 1001 OR snum = 1004;

# 13.Напишите запрос, который может вывести всех заказчиков, чьи имена начинаются с буквы попадающей в диапазон от A до G.

SELECT * FROM Customers WHERE cname BETWEEN 'A' AND 'G';

# 14.Напишите запрос который выберет всех пользователей чьи имена начинаются с буквы C.

SELECT * FROM Customers WHERE cname LIKE 'C%';

# 15.Напишите запрос который выберет все порядки имеющие нулевые значения или NULL в поле amt (сумма).

SELECT * FROM Orders WHERE amt = 0 OR amt IS NULL;

# 16.Напишите запрос, который сосчитал бы все суммы приобретений на 3 Октября.

SELECT SUM(amt) FROM Orders WHERE odate = '2015-03-10';

# 17.Напишите запрос, который сосчитал бы число различных не-NULL значений поля city в таблице Заказчиков.

SELECT COUNT(DISTINCT city) FROM customers WHERE city IS NOT NULL;

# 18.Напишите запрос, который выбрал бы наименьшую сумму для каждого заказчика.

SELECT cnum, MIN(amt) FROM Orders GROUP BY cnum;

# 19.Напишите запрос, который бы выбирал заказчиков в алфавитном порядке, чьи имена начинаются с буквы G.

SELECT MIN(cname) FROM Customers WHERE cname LIKE 'G%';

# 20.Напишите запрос, который выбрал бы высшую оценку в каждом городе.

SELECT city, MAX(rating) FROM Customers GROUP BY city;

# 21.Напишите запрос, который сосчитал бы число заказчиков, регистрирующих каждый день свои заказы. (Если продавец имел более одного заказа в данный день, он должен учитываться только один раз.)

SELECT odate, COUNT(DISTINCT snum) FROM Orders GROUP BY odate;

# 22.Предположим что каждый продавец имеет 12% комиссионных. Напишите запрос к таблице заказов, который мог бы вывести номер заказа, номер продавца, и сумму комиссионных продавца для этого заказа.

SELECT onum, snum, amt * 0.12 FROM Orders;

# 23.Напишите запрос к таблице Заказчиков который мог бы найти высшую оценку в каждом городе. Вывод должен быть в такой форме: For the city [city], the highest rating is: [rating].

SELECT CONCAT('For the city ', city, ', the highest rating is: ', MAX(rating)) 
FROM Customers GROUP BY city;

# 24.Напишите запрос, который выводил бы список заказчиков в нисходящем порядке. Вывод поля оценки (rating) должен сопровождаться именем заказчика и его номером.

SELECT rating, cname, cnum FROM Customers ORDER BY cname DESC;

# 25.Напишите запрос, который бы вывел список номеров заказов, сопровождающихся именем заказчика, который создавал эти заказы.

SELECT onum, cname FROM Orders, Customers WHERE Customers.cnum = Orders.cnum;

# 26.Напишите запрос, который бы выдавал имена продавца и заказчика для каждого заказа после номера заказа.

SELECT sname, cname, onum FROM Orders, Customers, Salespeople 
WHERE  Salespeople.snum = Orders.snum AND Customers.cnum = Orders.cnum;

# 27.Напишите запрос, который бы выводил всех заказчиков, обслуживаемых продавцом с комиссионными выше 12%. Выведите имя заказчика, имя продавца и ставку комиссионных продавца.

SELECT cname, sname, comm FROM Salespeople, Customers
WHERE Customers.snum = Salespeople.snum AND comm > 0.12;

# 28.Напишите запрос, который вычислил бы сумму комиссионных продавца для каждого заказа заказчика с оценкой выше 100.

SELECT onum, sname, cname, comm * amt FROM Orders, Salespeople, Customers
WHERE Orders.cnum = Customers.cnum AND Orders.snum = Salespeople.snum AND rating > 100;

# 29.Напишите запрос, который бы вывел все пары продавцов, живущих в одном и том же городе. Исключите комбинации продавцов с ними же, а также дубликаты строк, выводимых в обратным порядке

SELECT first.sname, second.sname FROM Salespeople first, Salespeople second
WHERE first.city = second.city AND first.sname < second.sname;

# 30.Напишите запрос, который вывел бы все пары порядков по данным заказчикам, именам этих заказчиков, и исключал дубликаты из вывода, как в предыдущем вопросе.

SELECT first.cname, second.cname FROM Customers first, Customers second
WHERE first.city = second.city AND first.cname < second.cname;

# 31.Напишите запрос, который вывел бы имена (cname) и города (city) всех заказчиков с такой же оценкой (rating) как у Hoffmanа. Напишите запрос, использующий поле cnum Hoffmanа, а не его оценку, так чтобы оно могло быть использовано, если его оценка вдруг изменится.

SELECT cname, city FROM Customers WHERE rating = (SELECT rating FROM Customers WHERE cnum = 2001);

# 32.Напишите запрос, который бы использовал подзапрос для получения всех заказов для заказчика с именем Cisneros. Предположим, что вы не знаете номера этого заказчика, указываемого в поле cnum.

SELECT * FROM Orders WHERE snum = (SELECT snum FROM Customers
WHERE cname = 'Cisneros');

# 33.Напишите запрос, который вывел бы имена и оценки всех заказчиков, которые имеют усредненные заказы.

SELECT cname, rating FROM Customers, Orders 
WHERE amt > (SELECT AVG(amt) FROM Orders) AND Customers.cnum = Orders.cnum;

# 34.Напишите запрос, который бы выбрал общую сумму всех приобретений в порядках для каждого продавца, у которого эта общая сумма больше, чем сумма наибольшего заказа в таблице.

SELECT SUM(amt), snum FROM Orders GROUP BY snum 
HAVING SUM(amt) > (SELECT MAX(amt) FROM Orders);

# 35.Напишите команду SELECT, использующую подзапрос, которая выберет имена и номера всех заказчиков с максимальными для их городов оценками.

SELECT cname, cnum FROM Customers first 
WHERE rating = (SELECT MAX(rating) FROM Customers second WHERE first.city = second.city);

# 36.Напишите два запроса, которые выберут всех продавцов (по их имени и номеру) которые, в своих городах имеют заказчиков, которых они не обслуживают. Один запрос — с использованием объединения и один — с подзапросом.

SELECT sname, snum FROM Salespeople first 
WHERE city IN (SELECT city FROM Customers second WHERE second.snum <> first.snum);

SELECT first.snum, sname FROM Salespeople first, Customers second
WHERE first.city = second.city AND first.snum <> second.snum;