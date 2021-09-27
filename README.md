# Домашнее задание к занятию «2.2. Testability, автотесты, введение в ООП: объекты и методы»
## Задача №1 - Мили (модернизация)

### Легенда
Необходимо модернизировать приложение для рассчёта миль. Теперь сама логика рассчёта будет находиться в специальном выделеном классе сервиса, а в Main нужно лишь создавать объект этого сервиса и вызывать его метод, передавая аргументами все необходимые данные для рассчёта. Получив от вызова метода рассчитанный результат, выводим его на экран.

Для этого нужно:
1. Создать класс `BonusMilesService` 
1. Определить в нём метод `calculate`, который:
    1. Принимает на вход один параметр: `cost` типа `int`
    1. Анализируя значение переданного параметра, возвращает рассчитанное количество миль (тип - `int`)
    
Разместите следующий код в классе `Main`:

```java
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}
```

Убедитесь, что выводимое в консоль значение соответствует результатам предыдущей версии приложения.

Условия рассчёта:

```
Авиаперевозчики предлагают различные бонусные программы, начисляющие бесплатные мили за перелёты. Формула следующая: за каждые 20 рублей, потраченные на билет, начисляется 1 миля.

Что нужно: создать базовое приложение, рассчитывающее количество начисленных мили за купленный билет.
```

Итого: должен быть репозиторий на GitHub, в котором расположен ваш Java-код.
