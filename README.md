# java_hw Задание
Описание задания к task1 <br>
<br>
Создать класс, который содержит 3 параметра: <br>
	● целочисленное значение - количество товаров <br>
	● вещественное значение - цена товара <br>
	● вещественное значение - скидка на товар <br>
 <br>
Сам класс должен иметь описание с многострочным комментарием. Каждое поле должно содержать однострочный комментарий с коротким описанием.
 <br>
Сделать метод, который принимает объект на вход и выполняет подсчеты: вывести на экран общую сумму покупки без скидки и сумму со скидкой.  <br>
 <br>
Создать второй класс, который будет содержать метод main. Сделать 3 вызова метода с различными объектами (количество товаров и сумма должны быть больше нуля) и скидками:	 <br>
0,75% <br>
42,575% <br>
59,1% <br>
 <br>
Итоговая сумма должна быть округлена до 2 знаков после запятой.
 <br>
Описание задания к task1 <br>
Часть 1. Тема: ООП + основные конструкции <br>
Построить иерархию животных в виде наследуемых классов. 
<br>
Пример:
<br>
Наследники Predator и Pet могут отличаться, остальная иерархия должна соблюдаться. <br>
● ИнтерфейсAnimalимеет4метода ○ getBreed(); <br>
○ getName(); <br>
○ getCost(); <br>
○ getCharacter(); <br>
● АбстрактныйклассAbstractAnimalимеет5полей: <br> 
○ protectedStringbreed;//порода <br>
○ protected String name; // имя <br>
○ protectedDoublecost;//ценавмагазине <br>
○ protectedStringcharacter;//характер <br>
 <br>
 Создаем CreateAnimalService c default методом по созданию 10 уникальных животных при помощи метода while.  <br> В CreateAnimalServiceImpl создать перегруженный метод, который создает N животных с помощью цикла for (где N - параметр, передаваемый в метод). Помимо перегруженного метода сделать переопределенный метод, который использует цикл do-while.
Во всех трех методах сделать вывод на консоль результат создания нового животного (через System.out.println).<br>
В классе Main вызвать все три метода.<br>
 <br>
 <br>
Часть 2. Массивы и Date-Time  <br>
Дорабатываем интерфейс Animal + всех наследников, добавляя новое поле: <br>
● protectedLocalDatebirthDate;//Деньрожденияживотногов формате dd-MM-yyyy. <br>
Генерируются любые даты, а не только текущие <br>
Переопределить метод equals() у всех наследников Animal. Создаем новый интерфейс SearchService и его наследника, в котором будут реализованы методы. <br>
1. findLeapYearNames; На вход подается массив животных. При помощи цикла (любой по желанию) найти всех животных, которые родились в високосный год. По итогу работы вернуть массив из имен животных. <br>
2. findOlderAnimal; На вход подается массив животных. При помощи цикла for найти всех животных, возраст которых старше N лет, где N аргумент метода. Результат работы метода - массив животных. <br>
3. findDuplicate; На вход подается массив животных. Метод выводит на экран дубликаты животных. (Дубликатом считается объект, у которого все поля совпадают).
<br>
Для корректной работы методов требуется убедиться, что входные массивы будут содержать необходимые данные для корректного исполнения методов. <br>
Все публичные методы имеют описание по JavaDoc. <br>
В методе main переделать код на вызов CreateService, который подготавливает данные для передачи их в SearchService. Результаты работы SearchService вывести на экран. <br>
 <br>
Часть 3. Задачи для самых продвинутых <br>
1. В CreateService для методов генерации новых животных нужно изучить и применить паттерн фабрика (Factory). Сами методы должны возвращать массив сгенерированных животных. <br>
2. Заменить работу с массивами на списки (ArrayList). <br>
3. Для методов findLeapYearNames, findOlderAnimal, <br>
findDuplicate использовать Stream API.
