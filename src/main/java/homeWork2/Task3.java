package homeWork2;

public class Task3 {
//    Дан следующий код, исправьте его там, где требуется
    public static void main(String[] args) { //throws Exception - как будто было лишнее
        try {
            int a = 90;
            int b = 3;

            System.out.println(a / b);

//            printSum(null, 234); // NullPointerException
            printSum(23, 234);


            int[] abc = { 1, 2 };
            abc[1] = 9;
//            abc[3] = 9; // IndexOutOfBoundsException
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) { //throws FileNotFoundException - точно лишнее
        System.out.println(a + b);
    }
}
