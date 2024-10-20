package lessons_5;

import java.util.Scanner;

/**
 * Задание 1
 * 1. Создать массив на 10 строк.
 * 2. Ввести с клавиатуры 8 строк и сохранить их в массив. Для считывания строк используй у сканера метод nextLine()
 * 3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
 */
public class HomeWorks1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] array = new String[10];
        for (int i = 0; i < 8; i++)
        {
            System.out.println("Введите "+ i +" символ");
            array[i] = console.nextLine();
        }
        for (int i = 9; i >= 0; i--)
        {
            System.out.println(array[i]);
        }
    }
}
