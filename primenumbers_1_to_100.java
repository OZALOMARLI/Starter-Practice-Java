// Application that prints prime numbers from 1 to 100

public class primenumbers_1_to_100 {
    public static void main(String[] args) {
        System.out.println("Prime Numbers in 1 to 100 :");
        for (int i = 1; i<=100; i++) {
            int count =0;
        for (int isprime=1; isprime < i; isprime++) {
            if (i%isprime == 0){
                count++;
            }

        }
            if(count==1){
                System.out.println (" Prime Numbers :"+i);
            }
        }

    }
}
