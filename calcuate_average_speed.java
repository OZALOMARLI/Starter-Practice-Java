import java.util.Scanner;

public class calcuate_average_speed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the value of Distance :");
        int s = scanner.nextInt();

        System.out.println("Please enter the value of Time :");
        int t = scanner.nextInt();

        int v = s/t;
        System.out.println("Average speed is : " +v);
    }
}