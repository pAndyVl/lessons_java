package lessons_5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Задание 3
 * 1. Создать массив на 10 строк.
 * 2. Создать массив на 10 чисел.
 * 3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
 * 4. В каждую ячейку массива чисел записать длину строки из массива строк,
 * индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
 * Для нахождения длины строки используй у конкретного слова вызов метода length()
 */
public class HomeWorks3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] arrayN = new int[10];
        String[] arrayS = new String[10];
        for (int i = 0; i < arrayS.length; i++) {
            System.out.println("Введите " + i + " слово");
            arrayS[i] = console.nextLine();
            arrayN[i] = arrayS[i].length();
        }
        System.out.print(Arrays.toString(arrayN));
    }
}