package lesson_3;
/**Объявить три переменных (a, b, c) - стороны предполагаемого треугольника.
 Определить возможность существования треугольника по сторонам.
 Результат вывести на экран в следующем виде:
 "Треугольник существует." - если треугольник с такими сторонами существует.
 "Треугольник не существует." - если треугольник с такими сторонами не существует.
 * */

import java.util.Scanner;

public class HomeWorksFigure {
    public static void main(String[] args) {
        System.out.println("Введите значение 1 стороны фигуры");
        Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt();
        System.out.println("Введите значение 2 стороны фигуры");
        int side2 = scanner.nextInt();
        System.out.println("Введите значение 3 стороны фигуры");
        int side3 = scanner.nextInt();
        if (side3 <= (side1 + side2)){
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
    }
}
