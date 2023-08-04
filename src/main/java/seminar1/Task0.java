package seminar1;

public class Task0 {
    /*
    Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
    Если длина массива меньше некоторого заданного минимума, метод возвращает -1,
    в качестве кода ошибки, иначе - длину массива.
     */
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4, 5};
        int min = 8;
        System.out.println(checkArr(intArr, min));
    }
    public static Integer checkArr (Integer[] array, int min){
        if (array.length < min) return -1;
        return array.length;
    }
}
