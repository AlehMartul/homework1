import java.util.Scanner;

public class Task2_12 {
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
        int temp1 = array[array.length - 2];
        int temp2 = array[array.length - 1];
        for (int a = array.length - 1; a > 1; a--) {
            array[a] = array[a - 2];
        }
        array[0] = temp1;
        array[1] = temp2;
        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a] + " ");
        }
    }
}