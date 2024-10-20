package lessons_5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Задание 5
 *
 * 1. Создать массив на 20 чисел.
 * 2. Ввести в него значения с клавиатуры.
 * 3. Создать два массива на 10 чисел каждый.
 * 4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
 * 5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
 */
public class HomeWorks5 {
    public static void main(String[] args) {
        int [] bigNumber = new int[20];
        int [] arrN1 = new int[10];
        int [] arrN2 = new int[10];
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < bigNumber.length; i++) {
            System.out.println("Введите " + i + " число");
            bigNumber[i] = console.nextInt();
            if (i < 10) arrN1[i] = bigNumber[i];
        }

        for (int i = 10; i < bigNumber.length; i++) {
            int j = i -10;
            System.out.println(arrN2[j] = bigNumber[i]);
        }
    }
}
