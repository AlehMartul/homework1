import java.util.Scanner;

public class Task2_6 {
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

        for (int a = 0; a < array.length-1; a=a+2) {
            int temp = array[a];
            int j = a+1;
            array[a] = array[j];
            array[j] = temp;

        }
        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a] + " ");
        }
    }
}