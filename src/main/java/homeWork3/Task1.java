package homeWork3;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    /*
    1. Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные пробелом:

    Фамилия Имя Отчество датарождения номертелефона пол

    Форматы данных:
    фамилия, имя, отчество - строки
    датарождения - строка формата dd.mm.yyyy
    номертелефона - целое беззнаковое число без форматирования
    пол - символ латиницей f или m.

    2. Приложение должно проверить введенные данные по количеству.
    Если количество не совпадает с требуемым, вернуть код ошибки, обработать его и показать пользователю сообщение,
    что он ввел меньше и больше данных, чем требуется.

    3. Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры.
    Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы.
    Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано,
    пользователю выведено сообщение с информацией, что именно неверно.

    4. Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии,
    в него в одну строку должны записаться полученные данные, вида

            <Фамилия><Имя><Отчество><датарождения><номертелефона><пол>

    Однофамильцы должны записаться в один и тот же файл, в отдельные строки.

    Не забудьте закрыть соединение с файлом.

    5. При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано,
    пользователь должен увидеть стектрейс ошибки.
     */


    public static String lastName = null;
    public static String firstName = null;
    public static String patronymic = null;
    public static String dateOfBirth = null;
    public static Long phone = null;
    public static Character sex = null;
    public static String newData;


    public static void main(String[] args) {
        inputData();
    }

    public static void inputData () {
        Scanner sc = new Scanner(System.in);

        String infoMsg = """
                Введите:\s
                Фамилию Имя Отчество,\s
                дату рождения(в формате dd.mm.yyyy),\s
                номертелефона(число без форматирования),\s
                пол(один символ f (женьщина) или m (мужчина)\s
                в произвольном порядке, через пробел

                Пример:
                Иванов Иван Иванович 01.11.2000 89007777777 m\s
                Петрова Нина Петровна 02.12.1999 89008888888 f""";
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println(infoMsg);
        System.out.println("---------------------------------------------------------------------------------");
        System.out.print("Ввод: ");

        String[] newData = sc.nextLine().split(" ");

        if(checkingValidationData(newData)){
            sc.close();
        }
    }

// Проверки:
    public static boolean checkingString(String inputString) {
        try {
            Long.valueOf(inputString);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static boolean checkingValidationData(String[] newData) {
        try {
            if (newData.length == 6) {
                System.out.println("[ Данные прошли проверку по количеству заполненых полей ]\n");
                String inputFIO = newData[0] + " " + newData[1] + " " + newData[2];

                if(checkingForFIO(inputFIO)) System.out.println(inputFIO);
                else inputData();
                if(checkingDate(newData[3])) System.out.println(dateOfBirth);
                else inputData();
                if(checkingPhone(newData[4])) System.out.println(phone);
                else inputData();
                if(checkingSex(newData[5])) System.out.println(sex);
                else inputData();
                getWriteToFile();
                return true;
            }
            else throw new SourceDataSizeException();
        }catch (SourceDataSizeException e){
            if(newData.length > 6) {
                System.out.println("---------------------------------------------------------------------------------");
                System.out.println("Вы ввели данных больше, чем необходимо");
            }
            if(newData.length < 6) {
                System.out.println("---------------------------------------------------------------------------------");
                System.out.println("Вы ввели данных меньше, чем необходимо");
            }
            inputData();
        }
        return false;
    }

    public static boolean checkingForFIO(String inputFIO){
        try {
            String[] tmp = inputFIO.split(" ");
            if(tmp.length == 3 && !checkingString(tmp[0]) && !checkingString(tmp[1]) && !checkingString(tmp[2])) {
                lastName = tmp[0];
                firstName = tmp[1];
                patronymic = tmp[2];
                System.out.println("Вы ввели Фамилию Имя Отчество:");
                return true;
            }
            else throw new WrongFormatException();
        }catch (WrongFormatException e){
            System.out.println("Неверный формат ФИО");
        }
        return false;
    }

    public static boolean checkingDate (String inputDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(inputDate);
            dateOfBirth = inputDate;
            System.out.println("Вы ввели Дату рождения:");
            return true;
        } catch (Exception e) {
            System.out.println("Не правильный формат даты");
            return false;
        }
    }

    public static boolean checkingPhone(String inputPhone) {
        try {
            if (inputPhone.length() != 1) {
                phone = Long.parseLong(inputPhone);
                System.out.println("Вы ввели Телефон:");
                return true;
            }
        }catch (NumberFormatException e){
            System.out.println("Неверный формат телефона");
        }
        return false;
    }

    public static boolean checkingSex (String inputSex){
        try {
            if(inputSex.length() == 1 && inputSex.equals("f") || inputSex.equals("m")){
                sex = inputSex.charAt(0);
                System.out.println("Вы ввели Пол");
                return true;
            }
            else throw new SexException();
        }catch (SexException e){
            System.out.println("неверный формат Пола");
        }
        return false;
    }

    // Запись в файл:
    public static void getWriteToFile(){
        newData = "<"+lastName+">"+"<"+firstName+">"+"<"+patronymic+">"+"<"+dateOfBirth+">"+"<"+phone+">"+"<"+sex+">";
        String path = "src/main/java/homeWork3/" + lastName + ".txt";
        File file = new File(path);

        if(fileReWriter(newData, file)){
            System.out.println("[ Данные добавлены в файл " + lastName + ".txt" + " ]");
        }
        else{
            fileWriter(newData, file);
            System.out.println("[ Данные записаны в новый файл " + lastName + ".txt" + " ]");
        }
    }

    public static void fileWriter (String newData, File file){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(newData);
            bw.newLine();
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static boolean fileReWriter (String newData, File file){
        List<String> fileData = new ArrayList<>();
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null){
                fileData.add(line);
            }
            fileData.add(newData);

            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (String s :fileData) {
                bw.write(s);
                bw.newLine();
            }
            bw.newLine();
            bw.close();
            return true;
        }catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

}

// Exceptions:
class WrongFormatException extends NumberFormatException{
    public WrongFormatException(){
        super();
    }
}
class SourceDataSizeException extends Exception{
    public SourceDataSizeException(){
        super();
    }
}

class SexException extends Exception {
    public SexException (){
        super();
    }
}