CREATE TABLE `salespeople` (
  `snum` SMALLINT PRIMARY KEY,
  `sname` VARCHAR(20) NOT NULL,
  `city` VARCHAR(20) NOT NULL,
  `comm` FLOAT(3,2) NOT NULL
);
CREATE TABLE `customers` (
  `cnum` SMALLINT PRIMARY KEY,
  `cname` VARCHAR(20) NOT NULL,
  `city` VARCHAR(20) NOT NULL,
  `rating` SMALLINT NOT NULL,
  `snum` SMALLINT NOT NULL
);
CREATE TABLE `orders` (
  `onum` SMALLINT PRIMARY KEY,
  `amt` FLOAT(6,2) NOT NULL,
  `odate` DATE NOT NULL,
  `cnum` SMALLINT NOT NULL,
  `snum` SMALLINT NOT NULL
);

insert into salespeople(snum, sname, city, comm)
values
(1002, 'Serres', 'SanJose', 0.13),
(1007, 'Rifkin', 'Barcelona', 0.15),
(1001, 'Peel', 'London', 0.12),
(1004, 'Motika', 'London', 0.11),
(1003, 'Axelrod', 'New York', 0.1);


insert into customers(cnum, cname, city, rating, snum)
values
(2001, 'Hoffman', 'London', 100, 1001),
(2002, 'Giovani', 'Rome', 200, 1003),
(2003, 'Liu', 'SanJose', 200, 1002),
(2004, 'Grass', 'Berlin', 300, 1002),
(2006, 'Pereira', 'London', 100, 1001),
(2007, 'Cisneros', 'Rome', 100, 1004),
(2008, 'Hoffman', 'SanJose', 300, 1007);

insert into orders(onum, amt, odate, cnum, snum)
values
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


Напишите команду SELECT, которая бы вывела номер заказа, сумму, и дату для всех строк из таблицы Заказов.
select onum, amt, odate from orders;
Напишите запрос, который вывел бы все строки из таблицы Заказчиков, для которых номер продавца равен 1001.
select * from orders where snum = 1001;
Напишите запрос, который вывел бы таблицу со столбцами в следующем порядке: city, sname, snum, comm.
select city, sname, snum, comm from salespeople;
Напишите команду SELECT которая вывела бы оценку (rating), сопровождаемую именем каждого заказчика в San Jose.
select rating, cname from customers where city = 'SanJose';
Напишите запрос, который вывел бы значения snum всех продавцов в текущем порядке из таблицы Заказов без каких бы то ни было повторений
select distinct snum from orders;
Напишите запрос, который отображает все заказы со значениями суммы выше чем $1,000.
select * from orders where amt > 1000;
Напишите запрос, который находит sname и city для всех продавцов в Лондоне с комиссионными выше 0.1.
select sname, city from salespeople where comm > 0.1;
Напишите запрос к таблице Заказчиков для отображения всех заказчиков с рейтингом не более 100, если они не находятся в Риме.
select cname from customers where rating <= 100 and city != 'Rome';
Напишите два запроса которые могли бы вывести все заказы за 3 или 4 Октября 2015.
select * from orders where odate = '2015-03-10'  or  odate = '2015-04-10';
select * from orders where odate  between  '2015-03-10' and '2015-04-10';
Напишите запрос который выберет всех заказчиков обслуживаемых продавцами Peel или Motika.
select * from customers 
inner join salespeople 
on customers.snum = salespeople.snum 
where salespeople.sname = 'Motika' or salespeople.sname = 'Peel';
Напишите запрос, который может вывести всех заказчиков, чьи имена начинаются с буквы попадающей в диапазон от A до G.
select cname from customers where cname between 'A%' and 'G%';
Напишите запрос который выберет всех пользователей чьи имена начинаются с буквы C.
select cname from customers where cname like 'C%';
Напишите запрос который выберет все порядки имеющие нулевые значения или NULL в поле amt (сумма).
select amt from orders where amt like '%0%';
Напишите запрос, который сосчитал бы все суммы приобретений на 3 Октября.
select sum(amt) from orders where odate = '2015-03-10';
Напишите запрос, который сосчитал бы число различных не-NULL значений поля city в таблице Заказчиков.
select count(city) from customers where city != '%null%';
Напишите запрос, который выбрал бы наименьшую сумму для каждого заказчика.
select distinct min(amt), cnum from orders group by cnum;
Напишите запрос, который бы выбирал заказчиков в алфавитном порядке, чьи имена начинаются с буквы G.
select cname from customers where cname like 'G%' order by cname;
Напишите запрос, который выбрал бы высшую оценку в каждом городе.
select distinct max(rating), city from customers group by city;
Напишите запрос, который сосчитал бы число заказчиков, регистрирующих каждый день свои заказы.
 (Если продавец имел более одного заказа в данный день, он должен учитываться только один раз.)
select count(distinct cnum), odate from orders group by odate;
Предположим что каждый продавец имеет 12% комиссионных. Напишите запрос к таблице заказов,
 который мог бы вывести номер заказа, номер продавца, и сумму комиссионных продавца для этого заказа.
select onum, snum, ((amt*12)/100) from orders;
Напишите запрос к таблице Заказчиков который мог бы найти высшую оценку в каждом городе.
 Вывод должен быть в такой форме: For the city [city], the highest rating is: [rating].
SELECT concat('For the city ', city, ', the highest rating is: ', MAX(rating)) FROM Customers GROUP BY city;
Напишите запрос, который выводил бы список заказчиков в нисходящем порядке.
 Вывод поля оценки (rating) должен сопровождаться именем заказчика и его номером.
SELECT rating, cname, cnum FROM Customers ORDER BY cname DESC;
Напишите запрос, который бы вывел список номеров заказов, сопровождающихся именем заказчика, который создавал эти заказы.
SELECT onum, cname FROM Orders
INNER JOIN Customers
ON Orders.cnum = Customers.cnum;
Напишите запрос, который бы выдавал имена продавца и заказчика для каждого заказа после номера заказа.
SELECT onum, sname, cname FROM Orders
JOIN Customers ON Orders.cnum = Customers.cnum 
JOIN Salespeople ON Orders.snum = Salespeople.snum;
Напишите запрос, который бы выводил всех заказчиков, обслуживаемых продавцом с комиссионными выше 12%.
 Выведите имя заказчика, имя продавца и ставку комиссионных продавца.
SELECT cname, sname, comm FROM Customers
INNER JOIN Salespeople
ON Customers.snum = Salespeople.snum
WHERE comm > 0.12;
Напишите запрос, который вычислил бы сумму комиссионных продавца для каждого заказа заказчика с оценкой выше 100.
SELECT onum, sname, cname, (comm * amt) FROM Orders
JOIN Salespeople ON Orders.snum = Salespeople.snum
JOIN Customers ON Orders.cnum = Customers.cnum
WHERE customers.rating > 100;
Напишите запрос, который бы вывел все пары продавцов, живущих в одном и том же городе.
 Исключите комбинации продавцов с ними же, а также дубликаты строк, выводимых в обратным порядке
SELECT s1.sname, s2.sname 
FROM Salespeople s1, Salespeople s2 
WHERE s1.city = s2.city 
AND s1.sname < s2.sname;
Напишите запрос, который вывел бы все пары порядков по данным заказчикам, именам этих заказчиков,
 и исключал дубликаты из вывода, как в предыдущем вопросе.
SELECT c1.cname, c2.cname, c2.rating, c2.rating 
FROM customers c1, customers c2 
WHERE c1.city < c2.city
AND c1.rating < c2.rating 
AND c1.cname < c2.cname;
Напишите запрос, который вывел бы имена (cname) и города (city) всех заказчиков
 с такой же оценкой (rating) как у Hoffmanа. Напишите запрос, использующий поле cnum Hoffmanа, а не его оценку,
 так чтобы оно могло быть использовано, если его оценка вдруг изменится.
select cname, city from customer
where rating in (select rating from customers where cnum in 
(select cnum from customers where cname = 'Hoffman'));
Напишите запрос, который бы использовал подзапрос для получения всех заказов для заказчика с именем Cisneros. Предположим, что вы не знаете номера этого заказчика, указываемого в поле cnum.
select * from orders 
where cnum = (select cnum from customers where cname = 'Cisneros');
Напишите запрос, который вывел бы имена и оценки всех заказчиков, которые имеют усредненные заказы.
select cname, rating from customers
join orders
on customers.cnum = orders.cnum
where amt = (select avg(amt) from orders);
Напишите запрос, который бы выбрал общую сумму всех приобретений в порядках для каждого продавца, у которого эта общая сумма больше, чем сумма наибольшего заказа в таблице.
select sname, sum(amt) from salespeople
join orders
on salespeople.snum = orders.snum
group by sname
having sum(amt) > (select max(amt) from orders);
Напишите команду SELECT, использующую подзапрос, которая выберет имена и номера всех заказчиков с максимальными для их городов оценками.
select cname, cnum from customers c1
where rating = (select max(rating) from customers c2 where c1.city = c2.city);
Напишите два запроса, которые выберут всех продавцов (по их имени и номеру) которые, в своих городах имеют заказчиков,
 которых они не обслуживают. Один запрос — с использованием объединения и один — с подзапросом.
select sname, snum from salespeople
where city in (
select city from customers
where salespeople.city = (select customers.city where customers.cnum <> customers.snum)
);

select distinct salespeople.sname, salespeople.snum from salespeople
join customers
on customers.city = salespeople.city
where customers.city = salespeople.city
and customers.cnum <> salespeople.snum;

