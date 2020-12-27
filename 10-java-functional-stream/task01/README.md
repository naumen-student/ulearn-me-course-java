# Задание 01 ternaryOperator

Давайте научимся комбинировать функции в более сложные функции. 
Для примера построим следующую комбинацию. 
Дан предикат condition и две функции ifTrue и ifFalse. 
Напишите метод ternaryOperator, который из них построит новую функцию, 
возвращающую значение функции ifTrue, если предикат выполнен, и значение ifFalse иначе.

Пример использования метода (можно было все свернуть в одну строчку, 
но для наглядности все элементы вынесены в отдельные переменные):

```
Predicate<Object> condition = Objects::isNull;
Function<Object, Integer> ifTrue = obj -> 0;
Function<CharSequence, Integer> ifFalse = CharSequence::length;
Function<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);
```

Результирующая функция будет для нулевых ссылок на String возвращать 0, 
а для ненулевых ссылок возвращать длину строки.

В качестве дополнительного задания самостоятельно разберите, 
почему у метода ternaryOperator такая сложная сигнатура.

