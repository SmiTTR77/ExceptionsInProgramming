package seminar1;

import java.util.Scanner;

public class Task1 {
    /*
    Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
    Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:

    если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.

    если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.

    если вместо массива пришел null, метод вернет -3

    придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.

    Напишите метод, в котором реализуйте взаимодействие с пользователем.
    То есть, этот метод запросит искомое число у пользователя, вызовет первый,
    обработает возвращенное значение и покажет читаемый результат пользователю.

    Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.
     */
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        int minValue = 5;

        System.out.println("Введите искомое значение:");
        int val = sc.nextInt();

        System.out.println(printError(checkArr(intArr, val, minValue)));
    }
    public static Integer checkArr (Integer[] array, int val, int min){
        if (array == null) return -3;
        if (array.length < min) return -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == val) return i;
        }
        return -2;

    }
    public static String printError (int error){
        if (error == -1) return "Длина массива меньша минимального значения";
        if (error == -2) return "Искомый элемент не найден";
        if (error == -3) return "Вместо массива пришел null";
        return "Искомый индекс = " + error;
    }
}
