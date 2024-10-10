//Adding Array Elements
//Define an array and calculate the sum of all elements of this array and print it. Example array: double[] values = {2.5, 3.5, 4.3, 1.5};

public class adding_array_elements {
    public static void main(String[] args) {
        double [] numbers = {2.5, 3.5, 4.3, 1.5};
        double sum =0;
        for (double number:numbers){
            sum+=number;
        }
        System.out.println(sum);
    }
}
