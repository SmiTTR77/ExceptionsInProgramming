package seminar1;

public class Task4 {
    /*
    Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
    Метод должен пройтись по каждому элементу и проверить что он не равен null.
    А теперь реализуйте следующую логику:

    Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя

    Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
     */
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, null, 4, null};
        checkArr(intArr);
    }
    public static void checkArr (Integer[] array) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) sb.append(i).append(", ");
        }
        if (sb.length() > 0) throw new RuntimeException("На индексах :"+ sb + " находятся null");
    }

}
