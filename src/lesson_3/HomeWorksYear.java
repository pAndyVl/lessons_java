package lesson_3;

import java.util.Scanner;

public class HomeWorksYear {
    public static void main(String[] args) {
        System.out.println("Введите число года");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 400 == 0) {
            System.out.println("Этот год високосный");
        }else if (year % 100 == 0) {
            System.out.println("Этот год не високосный");
        }
        else if (year % 4 == 0) {
            System.out.println("Этот год високосный");
        }else {
            System.out.println("Этот год не високосный");
        }
    }
}
