package lessons_4;

import java.util.Scanner;

/**
 * Задание 1
 * Ввести с клавиатуры два числа m и n.
 * Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
 *
 * Пример: m=2, n=4
 * 8888
 * 8888
 */
public class HomeWorks1 {
    public static void main(String[] args) {
        System.out.println("Введите 1 размер");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println("Введите 2 размер");
        int n = scanner.nextInt();
        for (int i = 1; i <= m ; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
