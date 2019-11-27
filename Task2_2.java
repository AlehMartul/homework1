import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        System.out.println("Введите длину массива");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int[] array = new int[i];
        int multiply = 1;
        for (int a = 0; a < array.length; a++) {
            array[a] = (int) (Math.random() * 10);
            multiply = multiply * array[a];
            System.out.print(array[a]+" ");
        }
        System.out.println();
        System.out.println(multiply);
    }
}