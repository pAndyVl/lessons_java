package lessons_4;

/**
 Задание 2
 Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.

 Пример вывода на экран:
 8
 88
 888
 8888
 88888
 888888
 8888888
 88888888
 888888888
 8888888888
 */
public class HomeWorks2 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 0; i < 10 ; i++) {
            for (int j = 1; j <= count; j++) {
                System.out.print("8");
            }
            System.out.println();
            count++;
        }
    }
}
