package lessons_4;

import java.util.Scanner;

/**
 * Задание 4
 * Вводить с клавиатуры числа.
 * Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
 * -1 должно учитываться в сумме.
 *
 * Подсказка: один из вариантов решения этой задачи, использовать конструкцию:
 *
 * while (true) {
 *     int number = считываем число;
 *     if (проверяем, что number -1)
 *         break;
 * }
 */
public class HomeWorks4 {
    public static void main(String[] args) {
        int sum = 0;
        while (true) {
            System.out.println("Введите число");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number != -1) {
                sum = sum + number;
            }else{
                sum = sum + number;
                System.out.println(sum);
                break;
            }
        }
    }
}
