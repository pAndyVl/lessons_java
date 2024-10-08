package lesson_3;

import java.util.Scanner;

public class HomeWorksSvet {
    public static void main(String[] args) {
        System.out.println("Введите значение минут");
        Scanner scanner = new Scanner(System.in);
        double time = scanner.nextInt();
        double color = time % 5;
        if (color <3){
            System.out.println("Вам зелёный, можно идти!");
        } else if (color < 4){
            System.out.println("Предупреждаю, жёлтый!");
        }else {
            System.out.println("Остановись! Красный!");
        }
    }
}
