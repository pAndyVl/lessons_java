package lessons_5;

import java.util.Scanner;

/**
 * Задание 2
 *
 * 1.1. Создай массив на 10 чисел
 * 1.2. Считай с консоли 10 чисел и заполни ими массив
 * 2. Найти максимальное число из элементов массива
 */
public class HomeWorks2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Введите "+ i +" число");
            array[i] = console.nextInt();
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++)
        {
                if (array[i] > max)max = array[i];
        }
        System.out.println("Самое большое число в массиве "+ max);

    }
}
