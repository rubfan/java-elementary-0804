# Напишите запрос, который находит sname и city для всех продавцов в Лондоне с комиссионными выше 0.1.
SELECT sname, city FROM Salespeople WHERE city = 'London' and comm > 0.1;
