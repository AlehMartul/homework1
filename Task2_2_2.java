import java.util.Scanner;

public class Task2_2_2 {
    public static void main(String[] args) {
        System.out.println("Введите длину массива");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int[] array = new int[i];
        int multiply = 1;
        int b = 0;
        while (b < array.length) {
            array[b] = (int) (Math.random() * 10);
            multiply = multiply * array[b];
            System.out.print(array[b] + " ");
            b++;
        }
        System.out.println();
        System.out.println(multiply);
    }
}