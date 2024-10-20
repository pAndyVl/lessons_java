package lessons_5;

import java.util.Scanner;

public class HomeWorks7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = console.nextInt();
        }

        for (int i = 0; i < array.length ; i++)
        {
            for(int j = i+1; j < array.length; j++)
            {
                if(array[i] < array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        for (Integer element : array){
            System.out.print(element + " ");
        }


    }
}
