package Webinar01;
//Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
//Необходимо посчитать и вернуть сумму элементов этого массива. При этом накладываем на метод 2 ограничения:
//метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может
//лежать только значение 0 или 1. Если нарушается одно из условий, метод должен бросить RuntimeException
//с сообщением об ошибке.
import java.util.Random;
public class Task02 {
    public static int sumArray(int[][] array){
        if (array.length != array[0].length)
            throw new RuntimeException("Array size " + array.length + "x" + array[0].length + " not square");
        int summ = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (array[i][j] != 0 && array[i][j] != 1)
                    throw new RuntimeException("Value not in [0,1] at index " + i + "." + j);
                summ += array[i][j];
            }
        }
        return summ;
    }
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] array = new int[7][7];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = rand.nextInt(2);
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
        array[0][0] = 5;
        System.out.println(sumArray(array));
    }
}
