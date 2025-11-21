package Practice_1001Arrays_Practice_Exercises;

import java.util.Arrays;

public class Second_Smallest_Number {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Arrays.sort(arr);
        System.out.println("Second Smallest Number is " +arr[1]);

    }
}