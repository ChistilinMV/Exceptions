package Webinar02;
//Запишите в файл следующие строки:
//        Анна=4
//        Елена=5
//        Марина=6
//        Владимир=?
//        Константин=?
//        Иван=4
//        Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap,
//        если студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных,
//        если сохранено значение ?, заменить его на соответствующее число.Если на каком-то месте встречается
//        символ, отличный от числа или ?, бросить подходящее исключение.Записать в тот же файл данные
//        с замененными символами ?.

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Task01 {
    public static void main(String[] args) {
        File myFile = new File("C:\\gb\\git_02\\Exceptions\\src\\main\\java\\Webinar02\\name.txt");
        HashMap <String, String> myHashMap = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(myFile))){
            String stringName = new String();
            while ((stringName= reader.readLine()) != null){
                String[] str = stringName.split("=");
                if (str[1].equals("?")) {
                    str[1] = String.valueOf(str[0].length());
                }
                myHashMap.put(str[0],str[1]);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        writeFile("C:\\gb\\git_02\\Exceptions\\src\\main\\java\\Webinar02\\name1.txt", myHashMap);
    }

    public static void writeFile(String path, HashMap myHashMap){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))){
            myHashMap.forEach((key, value) -> {
                String  result = key+"="+value;
                try {
                    writer.write(result+"\n");

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
