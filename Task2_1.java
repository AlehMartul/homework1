import java.util.Scanner;

public class Task2_1 {
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
        for (int a = array.length - 1; a > -1; a--) {
            System.out.print(array[a] + " ");
        }

    }
}
