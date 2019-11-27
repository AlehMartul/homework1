import java.util.Scanner;

public class Task2_10 {
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

        for (int a = 1; a < array.length; a++) {
            int b = a - 1;
            if (array[b] > array[a]) {
                System.out.println("Массив не является возрастающей последовательностью");
                break;
            }else {
                System.out.println("Массив является возрастающей последовательностью");
                break;
            }
        }
    }

}