import java.util.Scanner;

public class pyramid_many_floors_recieved_user{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of how many floors you want the pyramid to have: ");
        int i = scan.nextInt();

        for (int j=1; j<=i; j++) {
            for (int k=1; k<2*i-j; k++) {
                System.out.print (" ");

            }
            for (int l=1; l<= (2*j-1); l++) {
                System.out.print("*");

            }
            System.out.println();

        }
        System.out.println("   OZAL OMARLI   ");
    }
}
