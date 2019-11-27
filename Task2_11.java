import java.util.Scanner;

public class Task2_11 {
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
        array[0] = array[1]/2;
        for (int a = 1; a < array.length - 1; a++) {
            int b = a - 1;
            int c = a + 1;
           array[a] = (array[b] + array[c]) / 2;
          }
        array[array.length-1] = array[array.length-2]/2;
        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a] + " ");
        }
    }
}