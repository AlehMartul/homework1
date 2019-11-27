import java.util.Scanner;

public class Task2_3_2 {
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
        int b = 0;
        while (b < array.length) {
            if ((b + 1) % 3 == 0) {
                array[b] = array[b] * 2;
            }
            b++;
        }
        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a] + " ");
        }
    }
}