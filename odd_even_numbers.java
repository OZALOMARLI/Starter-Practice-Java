//Application that prints the sum of odd numbers and the sum of squares of even numbers up to the entered number

import java.util.Scanner;

public class odd_even_numbers {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of N : ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0){
                a=a+i;
            }
            else  {
                b=b+i^2;
            }
        }
        System.out.println(" Sum of all even numbers up to N: " +a );
        System.out.println("Sum of all odd numbers up to N: " +b );
    }
}