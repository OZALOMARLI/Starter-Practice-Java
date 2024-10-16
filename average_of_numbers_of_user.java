import java.util.Scanner;

public class average_of_numbers_of_user {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println ("Please enter the size of array :");
        int size = scanner.nextInt();
        int [] array = new int[size];
        float sum = 0;

        System.out.println ("Please enter the elements of array: ");
        for (int i=0; i<size; i++) {
            array [i] = scanner.nextInt();
            sum = sum + array[i];
        }

        System.out.println (" Average = " +sum/array.length);

    }
}
