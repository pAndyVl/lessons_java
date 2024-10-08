package lesson_3;

import java.util.Scanner;

public class HomeWorks2 {
    public static void main(String[] args) {
        //Задание 3
        System.out.println("Введите число месяца");

        Scanner scanner = new Scanner(System.in);
        int may = scanner.nextInt();
        switch (may) {
            case 1,2,12 -> System.out.println("Это зима");
            case 3,4,5 -> System.out.println("Да это ж весна, моя любимая!");
            case 6,7,8 -> System.out.println("Лето, ах лето!");
            case 9,10,11 -> System.out.println("Вот опять наступила осень...");
            default -> System.out.println("Полегче! Такого месяца ещё не придумали!");
        }
    }
}
