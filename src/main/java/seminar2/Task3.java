package seminar2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    /*Запишите в файл следующие строки:
    Анна=4
    Елена=5
    Марина=6
    Владимир=?
    Константин=?
    Иван=4

    Реализуйте метод, который:
    считывает данные из файла и сохраняет в двумерный массив (либо HashMap, если студенты с ним знакомы).
    В отдельном методе:
    нужно будет пройти по структуре данных, если сохранено значение ?, заменить его на соответствующее число.
    Если на каком-то месте встречается символ, отличный от числа или ?, бросить подходящее исключение.
    Записать в тот же файл данные с замененными символами ?.
     */
    public static void main(String[] args) {
        File file = new File("/Users/smitt/Desktop/GitHub/ExceptionsInProgramming/src/main/java/seminar2/names.txt");
        List <String[]> fileList = fileReader(file);
        changeChar(fileList);
        fileWriter(fileList, file);
    }

    public static List<String[]> fileReader (File file){
        List<String[]> fileList = new ArrayList<>();
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null){
                fileList.add(line.split("="));
            }
        }catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fileList;
    }

    public static void changeChar(List<String[]> fileList){
        for (String[] elements: fileList) {
            if (!checkException(elements[1]) && !elements[1].equals("?")) throw new RuntimeException("Элемент " + elements[1] + " отличен от числа или '?'");
            if (elements[1].equals("?")) elements[1] = String.valueOf(elements[0].length());
        }
    }

    public static boolean checkException (String line){
        try {
            Integer.valueOf(line);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    public static void fileWriter (List<String[]> fileList, File file){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (String[] elements: fileList) {
                bw.write(elements[0] + "=" + elements[1]);
                bw.newLine();
            }
            bw.close();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

}
