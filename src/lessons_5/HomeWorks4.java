package lessons_5;

import java.util.Scanner;

/**
 * Задание 4
 * 1. Создать массив на 10 чисел.
 * 2. Ввести с клавиатуры 10 чисел и записать их в массив.
 * 3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
 */
public class HomeWorks4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] arrayN = new int[10];
        for (int i = 0; i < arrayN.length; i++) {
            System.out.println("Введите " + i + " число");
            arrayN[i] = console.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(arrayN[i]);
        }

    }
}
