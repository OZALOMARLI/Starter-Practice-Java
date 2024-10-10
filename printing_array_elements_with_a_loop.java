//Printing Array Elements with a Loop
//Define an array of integers and print all elements of this array with a loop. Example array: int[] scores = {85, 90, 78, 92, 88};

public class printing_array_elements_with_a_loop {
    public static void main(String[] args) {
    int [] numbers = new int [5];
    numbers [0] = 85;
    numbers [1] = 90;
    numbers [2] = 78;
    numbers [3] = 92;
    numbers [4] = 88;

    for (int num:numbers) {
        System.out.println(num);
    }
    }
}