package Practice_1001Arrays_Practice_Exercises;

import java.util.Arrays;

public class Biggest_Number_Using_Sort {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9};
        Arrays.sort(arr);
        System.out.println("Biggest Number is " +arr[arr.length-1]);
    }
}
