package lessons_5;

import java.util.Scanner;

/**
 * Задание 6
 *
 * Создать массив на 20 чисел.
 * Заполнить его числами с клавиатуры.
 * Найти максимальное и минимальное числа в массиве.
 * Вывести на экран максимальное и минимальное числа через пробел.
 */
public class HomeWorks6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Введите "+ i +" число");
            array[i] = console.nextInt();
        }
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > max)max = array[i];
            if (array[i] < min)min = array[i];
        }
        System.out.println("Самое большое число в массиве "+ max);
        System.out.println("Самое малое число в массиве "+ min);

    }
}
