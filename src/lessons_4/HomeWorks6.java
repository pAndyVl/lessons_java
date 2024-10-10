package lessons_4;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Задание 6
 * Ввести с клавиатуры строку name.
 * Ввести с клавиатуры дату рождения (три числа): y, m, d.
 *
 * Вывести на экран текст:
 * "Меня зовут name.
 * Я родился d.m.y"
 *
 * Пример вывода:
 * Меня зовут Вася.
 * Я родился 15.2.1988
 */
public class HomeWorks6 {
    public static void main(String[] args) {
        System.out.println("Введите своё имя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Введите день рождения");
        int day = scanner.nextInt();
        System.out.println("Введите месяц рождения");
        int month = scanner.nextInt();
        System.out.println("Введите год рождения");
        int year = scanner.nextInt();
        System.out.println("Меня зовут " +  name);
        String formatted = String.format("Меня зовут %s. \nЯ родился  %d.%d.%d", name, day, month, year);
        System.out.println(formatted);
    }
}
