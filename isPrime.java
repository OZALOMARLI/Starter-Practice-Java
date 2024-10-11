// Checking whether the number requested from the user is prime or not
import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
  System.out.println("Enter the number:");
  int number = scanner.nextInt();
  if (number % 2 == 0) {
      System.out.println ("This number is prime");
  }
  else {
      System.out.println ("This Number isn't prime");

  }
    }
}
