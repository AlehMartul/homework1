import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        System.out.println("Введите длину массива");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int[] array = new int[i];
        int count = 0;
        for (int a = 0; a < array.length; a++) {
            array[a] = (int) (Math.random() * 10);
            if (array[a] == 0) {
                count++;
            }
            System.out.print(array[a] + " ");
        }
        System.out.println();
        if (count != 0) {
            System.out.println("Нулевых элементов " + count);
        } else {
            System.out.println("Нулевых элементов нет");
        }
    }
}