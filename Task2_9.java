import java.util.Scanner;

public class Task2_9 {
    public static void main(String[] args) {
        System.out.println("Введите длину массива");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int[] array = new int[i];
        for (int a = 0; a < array.length; a++) {
            array[a] = (int) (Math.random() * 10);
            System.out.print(array[a] + " ");
        }
        System.out.println();
        int min = array[0];
        int indexOfMin = 0;
        int max = array[0];
        int indexOfMax = 0;
        for (int a = 0; a < array.length; a++) {
            int temp = array[a];
            if (temp > max) {
                max = temp;
                indexOfMax = a;
            }
            if (temp < min) {
                min = temp;
                indexOfMin = a;
           }
        }
        System.out.println(" Минималное число под номером " + indexOfMin +" Максимальное число под номером " + indexOfMax);
    }

}