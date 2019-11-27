import java.util.Scanner;

public class Task2_7 {
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
        int n = array.length;
        for (int a = 0; a < n / 2; a++) {
            int temp = array [n-1-a];
            array[n-1-a] = array[a];
            array[a] = temp;
                    }
        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a] + " ");
        }
    }
}