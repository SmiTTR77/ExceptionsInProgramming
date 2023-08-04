package homeWork2;

public class Task2 {
//    Если необходимо, исправьте данный код
    public static void main(String[] args) {
        Integer[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8}; // добавил массив
        System.out.println("вариант 1:");
        test(intArray);

        System.out.println("вариант 2: с if");
        int valueD = 2;
        int indexArray = 8;

        test2(intArray, valueD, indexArray);
    }

    public static void test(Integer[] intArray){
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e); // добавил проверку на выход за пределы массива
        }

    }

    public static void test2(Integer[] intArray, int valueD, int indexArray){
        int d = valueD;
        if(d == 0) throw new RuntimeException("Не дели на 0");
        if(intArray.length < indexArray ) throw new RuntimeException("Значение indexArray: " + indexArray + ", выходит за пределы массива");
        else {
            double catchedRes1 = intArray[indexArray] / d;
            System.out.println(catchedRes1); // добавил для наглядности
        }

    }

}
