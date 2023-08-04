package seminar1;

public class Task2 {
    /*
    Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
    Необходимо посчитать и вернуть сумму элементов этого массива.

    При этом накладываем на метод 2 ограничения:
    1. метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
    2. в каждой ячейке может лежать только значение 0 или 1.

    Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
     */
    public static void main(String[] args) {
        Integer[][] array = {{1,0,1}, {1,0,0}, {1,1,1}};
        System.out.println(checkArr(array));
    }
    public static Integer checkArr (Integer[][] array) {
        int sum = 0;

        if (array.length != array[0].length) {
            throw new RuntimeException("Количество строк не равно количеству столбцов");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if(array[i][j] != 0 && array[i][j] != 1){
                    throw new RuntimeException("В ячейках с индексами: " + i + " " + j + " не содержатся 0 и 1");
                }
                sum += array[i][j];
            }
        }
        return sum;
    }
}
