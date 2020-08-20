# Написать SQL скрипт создания и заполнения таблиц данными с каптинки
CREATE DATABASE homework16;
USE homework16;

CREATE TABLE Salespeople (
snum BIGINT NOT NULL,
sname VARCHAR(20) NOT NULL,
city VARCHAR(20) NOT NULL,
comm DOUBLE DEFAULT 0,
PRIMARY KEY (snum)
);

INSERT INTO Salespeople (snum, sname, city, comm)
VALUES (1002, 'Serres', 'San Jose', 0.13),
(1007, 'Rifkin', 'Barselona', 0.15),
(1001, 'Peel', 'London', 0.12),
(1004, 'Motika', 'London', 0.11),
(1003, 'Alexrod', 'New York', 0.1);

CREATE TABLE Customers (
cnum BIGINT NOT NULL,
cname VARCHAR(20) NOT NULL,
city VARCHAR(20) NOT NULL,
rating BIGINT DEFAULT 0,
PRIMARY KEY (cnum),
snum BIGINT,
FOREIGN KEY (snum) REFERENCES Salespeople (snum)
);

INSERT INTO Customers (cnum, cname, city, rating, snum)
VALUES (2001, 'Hoffman', 'London', 100, 1001),
(2002, 'Giovanni', 'Rome', 200, 1003),
(2003, 'Liu', 'SanJose', 200, 1002),
(2004, 'Grass', 'Berlin', 300, 1002),
(2006, 'Clemens', 'London', 100, 1001),
(2007, 'Pereira', 'Rome', 100, 1004),
(2008, 'Cisneros', 'SanJose', 300, 1007);

CREATE TABLE Orders (
onum BIGINT NOT NULL,
amt DOUBLE DEFAULT 0,
odate DATE NOT NULL,
cnum BIGINT,
snum BIGINT,
PRIMARY KEY (onum),
FOREIGN KEY (snum) REFERENCES Salespeople (snum),
FOREIGN KEY (cnum) REFERENCES Customers (cnum)
);

INSERT INTO Orders (onum, amt, odate, cnum, snum)
VALUES
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
