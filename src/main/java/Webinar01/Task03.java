package Webinar01;
//Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
// Метод должен пройтись по каждому элементу и проверить что он не равен null. А теперь реализуйте следующую логику:
//        1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//        2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
import java.util.Random;
public class Task03 {
    public static void checkArray(Integer[] array){
        StringBuilder nullval = new StringBuilder(new String());
        for (int i = 0; i < array.length; i++){
            if (array[i] == null){
                nullval.append(i + " ");
            }
        }
        if (!nullval.isEmpty()) throw new RuntimeException(String.valueOf(nullval));
    }
    public static void main(String[] args) {
        Random rand = new Random();
        Integer[] array = new Integer[17];
        for (int i = 0; i < array.length; i++){
                array[i] = rand.nextInt(10);
                System.out.print(" " + array[i]);
        }
        array[0] = null;
        array[4] = null;
        array[5] = null;
        array[11] = null;
        array[15] = null;
        checkArray(array);
    }
}
