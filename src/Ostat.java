import java.util.Scanner;

public class Ostat {
    public static void main(String[] args) {
        //определить четное число
        //Если делится на два то в остатке будет 0 и следовательно число четное
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = a % 2;
        if (c == 0){
            System.out.println("Число четное");
        } else {
            System.out.println("нечетное");
        }
    }
}
// xxxxx xxxxx xxxxx xxxxx