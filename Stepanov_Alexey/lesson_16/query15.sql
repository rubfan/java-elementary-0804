# Напишите запрос который выберет все порядки имеющие нулевые значения или NULL в поле amt (сумма).
SELECT * FROM Orders WHERE (amt IS NULL) or amt = 0;
