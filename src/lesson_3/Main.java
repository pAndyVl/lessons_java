package lesson_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число дня недели");

        Scanner scanner = new Scanner(System.in);
        int dayOfWeek = scanner.nextInt();
//        if (dayOfWeek == 1) {
//            System.out.println("Сегодня понедельник");
//        } else if (dayOfWeek == 2){
//            System.out.println("Сегодня вторник");
//        }else if (dayOfWeek == 3){
//            System.out.println("Сегодня среда");
//        }else if (dayOfWeek == 4){
//            System.out.println("Сегодня четверг");
//        }else if (dayOfWeek == 5){
//            System.out.println("Сегодня пятница");
//        }else if (dayOfWeek == 6){
//            System.out.println("Сегодня суббота");
//        }else if (dayOfWeek == 7){
//            System.out.println("Сегодня воскресенье");
//        }else {
//            System.out.println("Эй, там за монитором, головой думай! Нет такого дня недели!");
//        }

        switch (dayOfWeek) {
            case (1) :
                System.out.println("Сегодня понедельник");
                break;
            case (2) :
                System.out.println("Сегодня вторник");
                break;
            case (3) :
                System.out.println("Сегодня среда");
                break;
            case (4) :
                System.out.println("Сегодня четверг");
                break;
            case (5) :
                System.out.println("Сегодня пятница");
                break;
            case (6) :
                System.out.println("Сегодня суббота");
                break;
            case (7) :
                System.out.println("Сегодня воскресенье");
                break;
            default:
                System.out.println("Эй, там за монитором, головой думай! Нет такого дня недели!");
        }
    }
}
