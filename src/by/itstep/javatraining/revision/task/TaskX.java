package by.itstep.javatraining.revision.task;

/*  Task X. Snow and Towers [снег и башни]
 *
 *  В городе есть 999 башен, высоты которых (справа налево) равны соответственно (1), (1+2), (1+2+3),
 *  (1+2+3+4), ..., (1+2+3+...+998+999). Башни стоят в один ряд, расстояние между башнями не меньше метра.
 *  Некоторое время в городе шёл сильны снег, а затем прекратился.
 *  Для каких-то двух соседних башен были измерены длины тех частей башен, которые не покрыты снегом,
 *  и получены следующие результаты: для левой башни a-метров, для правой башни b-метров.
 *  Считая, что высота снежного покрова по всему городу одинакова, найдите величину снежного покрова.
 *
 *  Примечание
 *  1) Не забудьте про "защиту от дурака": входные данные должны быть больше нуля.
 *  В случае неверных данных необходимо возвратить значение -1.
 *  2) Длины башен, которые не покрыты снегом, могут передаваться в любом порядке
 *  (используйте активную "защиту от дурака").
 *  3) Для решения задачи рекомендуется использовать встроенные в язык Java операции
 *  и сокращённую условную конструкцию if-else.
 *
 *	Формат входных данных [input]
 *	Метод принимает на вход два целых числа в диапазоне типа int.
 *
 *	Формат выходных данных [output]
 *	Метод должен возвратить одно целое число - ответ на задачу.
 *
 *	[Sample method input  1]: 8 13
 *	[Sample method output 1]: 2     // в примере высоты башен равны 10 и 15 (четвёртая и пятая башни),
 *                                  // а следовательно высота снежного покрова равна 2 метрам
 *  [ input 2]: 45 55
 *	[output 2]: 0
 *
 *	[ input 3]: 2 4
 *	[output 3]: 1
 *
 * 	[ input 4]: 5000 5101
 *	[output 4]: 50
 *
 * 	[ input 5]: -1 2
 *	[output 5]: -1
 *
 * 	[ input 6]: 0 2
 *	[output 6]: -1
 */

public class TaskX {
    public static int start(int a, int b) {return 0;}
}