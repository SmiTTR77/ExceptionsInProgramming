package homeWork2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    /*
    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
    Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
     */

    public static void main(String[] args) {
        getFractionalNumber();
    }

    public static void getFractionalNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите дробное число: ");

        try {
            float number = sc.nextFloat();
            System.out.println("Ваше число: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Значение не является числом");
            getFractionalNumber();
        }
    }
}
