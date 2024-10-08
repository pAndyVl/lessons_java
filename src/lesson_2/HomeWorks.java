package lesson_2;

public class HomeWorks {
    public static void main(String[] args) {
        //Задача 1
        int all = 5;
        float kassa1 = all/2f;
        float kassa2 = all/2f;
        System.out.println("В первой кассе "+kassa1+" рублей");
        System.out.println("Во второй кассе "+kassa2+" рублей");

        //Задача 2
        int as = 50;
        int bs = 20;
        int p = as * bs;
        System.out.println("Площадь квадрата = " + p);

        //Задача 3
        int time1 = 9;
        int time2 = 15;
        int stuck = 3;
        int essen1 = time1/stuck;
        int essen2 = time2/stuck;
        int min = essen2 - essen1;
        System.out.println("Съедает быстрее на " + min +" минуты");

        //Задача 4
        int a = 3;
//        int a = 10;
        int b = 6;
//        int b = 12;
//        int sum = 1 + a + b;
//        int sum = 2 + a + b;
        int sum = 3 + a + b;
//        int sum = 4 + a + b;
        System.out.println("sum = " + sum);


    }
}
