//If the number is there, it will print the number of the element, if not, it will print nothing.
import java.util.Scanner;

public class finding_number_searched_in_array {
    public static void main(String[] args) {
        System.out.println("Please enter the number you are looking for: ");
        Scanner scan=new Scanner (System.in);

        int isThere = scan.nextInt();

        System.out.println("Please change the following array elements before running ");

        int[] numbers = new int[5];

        numbers[0] = 7;
        numbers[1] = 10;
        numbers[2] = 9;
        numbers[3] = 11;


        boolean found =false;
        int index =-1;


        for (int i = 0; i < numbers.length; i++) {

            if ( numbers [i]== isThere) {
                found=true;
                index=i;
                break;
            }
        }
        if (found) {
            System.out.println("The number is in the array: " +"found in the index of " + index  ); }

            else {
                System.out.println ("The number isn't found in this array");
        }
    }
}