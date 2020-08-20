/*
1) Напишите программу которая выводит на экран информацию о животном имя котрого введено с клавиатуры.
Постройте иерархию классов животных используйте абстакцию и наследование.
Вся информация о животном должна быть получена с помошью полей и методов класса который ассоциируется с этим животным.
Вся иерархия классов должна быть построена от класса AnimalInfo в котором есть единственный публичный абстрактный метод getInfo
Все остальные методы должны быть сокрыты от использования извне (из класа Main например)
Постройте иерархию минимум на 5 уровней, желательно чтобы все методы и поля которые повторяются должны выностится на уровень вверх по иерархии,
тоесть стать более абстрактными. Используйте ключевое слово abstract.
Используя наследование стремитесь максимально избавится от повторяющегося кода.

2) Покройте программу тестами

3) Напишите метод который выводит всю иерархию подвидов животного.(таким образом будет видна цепочка наследования)
 */

public abstract class AnimalInfo {

    public abstract String getInfo();
}