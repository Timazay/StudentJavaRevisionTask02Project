package by.itstep.javatraining.revision.task;

/*	Task (задание) 01. Maximum Number [наибольшее число]
 *
 *	Даны два целых числа. Выведите значение наибольшего из них.
 *	Если числа равны, выведите любое из них.
 *
 *	Примечание
 *	Для решения задачи рекомендуется использовать только встроенные в язык Java операции.
 *
 *	Формат входных данных [input]
 *	Метод принимает два любых целых числа в диапазоне типа int.
 *
 *	Формат выходных данных [output]
 *	Метод должен вывести наибольшее число.
 *
 *	[Sample method input  1] (пример передаваемых в метод параметров): 10 15
 *	[Sample method output 1] (пример возвращаемого методом результата): 15
 *
 *	[input  2]: 40 25
 *	[output 2]: 40
 *
 *	[input  3]: 7 7
 *	[output 3]: 7
 */

public class Task01 {
    public static int start(int a, int b) {
        int result = b;

        if (a > b){
            result = a;
        }

        return result;
    }
}