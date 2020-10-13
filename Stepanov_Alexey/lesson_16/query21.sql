# Напишите запрос, который сосчитал бы число заказчиков, регистрирующих каждый день свои заказы. 
# (Если продавец имел более одного заказа в данный день, он должен учитываться только один раз.)
SELECT odate, COUNT(DISTINCT cnum) FROM Orders GROUP BY odate;