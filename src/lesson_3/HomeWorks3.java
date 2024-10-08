package lesson_3;

import java.util.Scanner;

public class HomeWorks3 {
    public static void main(String[] args) {
        //Задание 4
        System.out.println("Введите любое число");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); //

        if (a > 0) {
            System.out.println("Ваше число " + a + " умножаем на 2. Результат = " + (a * 2));
        } else if (a < 0) {
            System.out.println("к вашему числу " + a + " прибавляем 1. Результат = "+ (a + 1));
        } else if (a == 0){
            System.out.println("Ваше число равно 0. На 0 и суда 0 ))");
        }

    }
}
