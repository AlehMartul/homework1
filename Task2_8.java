import java.util.Scanner;

public class Task2_8 {
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
        int min = array[0];
        int max = array[0];
        for (int a = 0; a < array.length-1; a++) {
            if(array[a] > max){
                max = array[a];
            }
            if(array[a] < min){
                min = array[a];
            }
        }
        System.out.println(" Минималное число " +min + " Максимальное число " + max);
        }

}