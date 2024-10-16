// Our program will ask the user for an array element count. 
//After determining how many numbers will be entered according to the number of array elements he wants, he will ask him to enter the numbers to add these numbers and keep their sum in the "sum" variable.
//As the answer to the average, it will print the number of elements (sum/array).

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
