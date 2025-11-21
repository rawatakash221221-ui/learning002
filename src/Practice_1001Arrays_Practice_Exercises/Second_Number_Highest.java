package Practice_1001Arrays_Practice_Exercises;

import java.util.Arrays;

public class Second_Number_Highest {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,7};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
}
