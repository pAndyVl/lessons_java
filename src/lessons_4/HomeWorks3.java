package lessons_4;
/**
 * Задание 3
 * Ввести с клавиатуры три числа, вывести на экран среднее из них.
 * Т.е. не самое большое и не самое маленькое.
 * Если все числа равны, вывести любое из них.
 */

import java.util.Scanner;

public class HomeWorks3 {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println("Введите третье число");
        int c = scanner.nextInt();
        int sum = a + b + c;
        double avg = sum / 3;
        System.out.println(avg);
    }
}
