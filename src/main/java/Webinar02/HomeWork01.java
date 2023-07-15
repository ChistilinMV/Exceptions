package Webinar02;

import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
        float input = getFloatFromUser();
        System.out.println("Вы ввели число: " + input);
    }

    public static float getFloatFromUser() {
        Scanner scanner = new Scanner(System.in);
        float result = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.print("Введите дробное число: ");
            String input = scanner.nextLine();

            try {
                result = Float.parseFloat(input);
                isValidInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введено не число. Пожалуйста, попробуйте еще раз.");
            }
        }

        return result;
    }
}
