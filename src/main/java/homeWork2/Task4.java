package homeWork2;

import java.util.Scanner;

public class Task4 {
    /*
     Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
     Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
      */
    public static void main(String[] args) {
        inputLine();
    }
    public static void inputLine() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String line = sc.nextLine();

        if(line.isEmpty()) throw new RuntimeException("Пустые строки вводить нельзя.");
        else System.out.println(line);
    }

}
