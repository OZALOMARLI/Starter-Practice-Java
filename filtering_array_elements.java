//Filtering Array Elements:
// Define an int array and add the elements greater than 10 to a new array. Example array: int[] values = {5, 12, 7, 15, 3};.

public class filtering_array_elements {
    public static void main(String[] args) {
        int[] numbers = {3, 19, 36, 5, 3, 11, 10, 7};
        for (int number : numbers) {
            if (number>10) {
                System.out.println(number);
            }
        }
    }
}