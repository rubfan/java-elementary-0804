# Предположим что каждый продавец имеет 12% комиссионных. 
# Напишите запрос к таблице заказов, который мог бы вывести номер заказа, номер продавца, и сумму комиссионных продавца для этого заказа.
SELECT onum, snum, (amt * 0.12) FROM Orders;
