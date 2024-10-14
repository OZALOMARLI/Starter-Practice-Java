/*
About 2'nd LAW of Newton :
An object gains an acceleration that is directly proportional to the net force applied to it and in the same direction. The coefficient of proportionality is the mass of the object.
F = m * a
(F is FORCE)
(m is MASS)
(a is ACCELERATİON)

Let's write the code that performs this calculation

*/
import java.util.Scanner;


public class second_law_of_newton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter The Value of MASS (m) : ");
        int m = scanner.nextInt();

        System.out.println("Please Enter the Value of ACCELERATİON (a) : ");
        int a = scanner.nextInt();
        int f= a*m;
        System.out.println("FORCE (F) = a*m = " +f);

    }
}