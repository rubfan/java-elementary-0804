CREATE DATABASE Homework16;
USE Homework16;

# 1.�������� SQL ������ �������� � ���������� ������ ������� � ��������

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

# 2. �������� ������� SELECT, ������� �� ������ ����� ������, �����, � ���� ��� ���� ����� �� ������� �������.
SELECT onum, amt, odate
FROM orders;

# 3. �������� ������, ������� ����� �� ��� ������ �� ������� ����������, ��� ������� ����� �������� ����� 1001.
SELECT *
FROM orders
WHERE snum = 1001;

# 4. �������� ������, ������� ����� �� ������� �� ��������� � ��������� �������: city, sname, snum, comm.
SELECT city, sname, snum, comm
FROM salespeople;

# 5. �������� ������� SELECT ������� ������ �� ������ (rating), �������������� ������ ������� ��������� � San Jose.
SELECT rating, cname
FROM customers
WHERE city = 'SanJose';

# 6. �������� ������, ������� ����� �� �������� snum ���� ��������� � ������� ������� �� ������� ������� ��� ����� �� �� �� ���� ����������.
SELECT snum
FROM orders
GROUP BY snum;

# 7. �������� ������, ������� ���������� ��� ������ �� ���������� ����� ���� ��� $1,000.
SELECT *
FROM orders
WHERE amt > 1000;

# 8. �������� ������, ������� ������� sname � city ��� ���� ��������� � ������� � ������������� ���� 0.1.
SELECT sname, city
FROM salespeople
WHERE comm > 0.1
  AND city = 'London';

# 9. �������� ������ � ������� ���������� ��� ����������� ���� ���������� � ��������� �� ����� 100, ���� ��� �� ��������� � ����.
SELECT cname
FROM customers
WHERE rating <= 100
  AND city != 'Rome';

# 10. ��� ����� �������� � ���������� �������: (9.?)
Hoffman
Clemens

# 11. �������� ��� ������� ������� ����� �� ������� ��� ������ �� 3 ��� 4 ������� 2015.
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

# 12. �������� ������ ������� ������� ���� ���������� ������������� ���������� Peel ��� Motika.
SELECT *
FROM Customers
WHERE snum IN (1001, 1004);

# 13. �������� ������, ������� ����� ������� ���� ����������, ��� ����� ���������� � ����� ���������� � �������� �� A �� G.
SELECT *
FROM Customers
WHERE cname BETWEEN 'A' AND 'G';

SELECT *
FROM Customers
WHERE cname BETWEEN 'A' AND 'G';
    (���� G ������������)

    14. �������� ������ ������� ������� ���� ������������� ��� ����� ���������� � ����� C.
SELECT * FROM Customers WHERE cname LIKE 'C%';

# 15. �������� ������ ������� ������� ��� ������� ������� ������� �������� ��� NULL � ���� amt (�����).
SELECT *
FROM Orders
WHERE amt = 0
   OR amt IS NULL;

# 16. �������� ������, ������� �������� �� ��� ����� ������������ �� 3 �������.
SELECT SUM(amt), COUNT(*)
FROM Orders
WHERE odate = '2015-03-10';

# 17. �������� ������, ������� �������� �� ����� ��������� ��-NULL �������� ���� city � ������� ����������.
SELECT COUNT(DISTINCT city)
FROM customers
WHERE city IS NOT NULL;

# 18. �������� ������, ������� ������ �� ���������� ����� ��� ������� ���������.
SELECT snum, MIN(amt)
FROM orders
GROUP BY snum;

# 19. �������� ������, ������� �� ������� ���������� � ���������� �������, ��� ����� ���������� � ����� G.
SELECT cname
FROM customers
WHERE cname LIKE 'G%'
ORDER BY cname;

# 20. �������� ������, ������� ������ �� ������ ������ � ������ ������.
SELECT MAX(rating), city
FROM customers
GROUP BY city;

# 21. �������� ������, ������� �������� �� ����� ����������, �������������� ������ ���� ���� ������. (���� �������� ���� ����� ������ ������ � ������ ����, �� ������ ����������� ������ ���� ���.)
SELECT odate, COUNT(DISTINCT cnum)
FROM orders
GROUP BY odate;

# 22. ����������� ��� ������ �������� ����� 12% ������������. �������� ������ � ������� �������, ������� ��� �� ������� ����� ������, ����� ��������, � ����� ������������ �������� ��� ����� ������.
SELECT onum, snum, ROUND(amt * .12, 3)
FROM orders;

# 23. �������� ������ � ������� ���������� ������� ��� �� ����� ������ ������ � ������ ������. ����� ������ ���� � ����� �����: For the city [city], the highest rating is: [rating].
SELECT 'For the city ', city, ', the highest rating is: ', MAX(rating)
FROM customers
GROUP BY city;

# 24. �������� ������, ������� ������� �� ������ ���������� � ���������� �������. ����� ���� ������ (rating) ������ �������������� ������ ��������� � ��� �������.
SELECT rating, cname, cnum
FROM Customers
ORDER BY rating DESC;

# 25. �������� ������, ������� �� ����� ������ ������� �������, ���������������� ������ ���������, ������� �������� ��� ������.
SELECT onum, cname
FROM orders,
     Customers
WHERE orders.cnum = customers.cnum;

# 26. �������� ������, ������� �� ������� ����� �������� � ��������� ��� ������� ������ ����� ������ ������.
SELECT onum, cname, sname
FROM orders,
     customers,
     salespeople
WHERE customers.cnum = orders.cnum
  AND salespeople.snum = orders.snum;

# 27. �������� ������, ������� �� ������� ���� ����������, ������������� ��������� � ������������� ���� 12%. �������� ��� ���������, ��� �������� � ������ ������������ ��������.
SELECT cname, sname, comm
FROM customers,
     salespeople,
     orders
WHERE customers.snum = salespeople.snum
  AND comm > 0.12;

# 28. �������� ������, ������� �������� �� ����� ������������ �������� ��� ������� ������ ��������� � ������� ���� 100.
SELECT onum, comm * amt
FROM Salespeople,
     Orders,
     Customers
WHERE Orders.cnum = Customers.cnum
  AND Orders.snum = Salespeople.snum
  AND rating > 100;

# 29. �������� ������, ������� �� ����� ��� ���� ���������, ������� � ����� � ��� �� ������. ��������� ���������� ��������� � ���� ��, � ����� ��������� �����, ��������� � �������� �������.
SELECT first.sname, second.sname
FROM Salespeople first,
     Salespeople second
WHERE first.city = second.city
  AND first.sname < second.sname;

# 30. �������� ������, ������� ����� �� ��� ���� �������� �� ������ ����������, ������ ���� ����������, � �������� ��������� �� ������, ��� � ���������� �������.
SELECT first.onum, second.onum, cname
FROM orders first,
     orders second,
     customers
WHERE first.cnum = second.cnum
  AND first.onum < second.onum
  AND customers.cnum = first.cnum;

# 31. �������� ������, ������� ����� �� ����� (cname) � ������ (city) ���� ���������� � ����� �� ������� (rating) ��� � Hoffman�. �������� ������, ������������ ���� cnum Hoffman�, � �� ��� ������, ��� ����� ��� ����� ���� ������������, ���� ��� ������ ����� ���������.
SELECT first.cname, first.city
FROM customers first,
     customers second
WHERE first.rating = second.rating
  AND second.cname = 'Hoffman'
  AND first.cname != 'Hoffman';

# 32. �������� ������, ������� �� ����������� ��������� ��� ��������� ���� ������� ��� ��������� � ������ Cisneros. �����������, ��� �� �� ������ ������ ����� ���������, ������������ � ���� cnum.
SELECT *
FROM orders
WHERE cnum =
      (SELECT cnum
       FROM customers
       WHERE cname = 'Cisneros');

# 33. �������� ������, ������� ����� �� ����� � ������ ���� ����������, ������� ����� ����������� ������.
SELECT DISTINCT cname, rating
FROM customers,
     orders
WHERE amt >
      (SELECT AVG(amt)
       FROM orders)
  AND orders.cnum = customers.cnum;

# 34. �������� ������, ������� �� ������ ����� ����� ���� ������������ � �������� ��� ������� ��������, � �������� ��� ����� ����� ������, ��� ����� ����������� ������ � �������.
SELECT snum, SUM(amt)
FROM Orders
GROUP BY snum
HAVING SUM(amt) >
       (SELECT MAX(amt)
        FROM Orders);

# 35. �������� ������� SELECT, ������������ ���������, ������� ������� ����� � ������ ���� ���������� � ������������� ��� �� ������� ��������.
SELECT cnum, cname
FROM Customers offside
WHERE rating =
      (SELECT MAX(rating)
       FROM Customers inside
       WHERE inside.city = offside.city);

# 36. �������� ��� �������, ������� ������� ���� ��������� (�� �� ����� � ������) �������, � ����� ������� ����� ����������, ������� ��� �� �����������. ���� ������ � � �������������� ����������� � ���� � � �����������.
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



