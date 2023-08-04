package seminar3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task3 {
    /*
    1. Создайте класс исключения, который будет выбрасываться при делении на 0.
    Исключение должно отображать понятное для пользователя сообщение об ошибке.

    2. Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве ссылочного типа.
    Исключение должно отображать понятное для пользователя сообщение об ошибке.

    3. Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл.
    Исключение должно отображать понятное для пользователя сообщение об ошибке.
     */
    public static void main(String[] args) throws NotFoundFile {
        //1
//        try {
//            int a = 5/0;
//        }catch (ArithmeticException e){
//            throw new ExceptionByZero();
//        }

        //2
//        try {
//            Integer[] intArray = {1, null, 3};
//            intArray[1] += 1;
//        }catch (NullPointerException){
//            throw new EmptyArrayElement();
//        }

        //3
        try {
            File file = new File("path");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
        } catch (FileNotFoundException e) {
            throw new NotFoundFile();
        }
    }
}

class ExceptionByZero extends ArithmeticException{
    public ExceptionByZero(){
        super("Хватит делить на ноль");
    }

}

class EmptyArrayElement extends NullPointerException{
    public EmptyArrayElement(){
        super("А тут пустой элемент массива");
    }

}

class NotFoundFile extends FileNotFoundException {
    public NotFoundFile(String path){
        super("Файл не найден");
    }

    public NotFoundFile(){
        super("Файл не найден");
    }

}