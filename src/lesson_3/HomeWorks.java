package lesson_3;

import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Введите любое число");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a > 5) {
            System.out.println("Ваше число " + a + " больше 5");
        } else if (a < 5) {
            System.out.println("Ваше число " + a + " меньше 5");
        } else if (a == 5){
            System.out.println("Ваше число равно 5");
        }
    }
}
