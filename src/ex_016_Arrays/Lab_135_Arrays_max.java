package ex_016_Arrays;

import java.util.Arrays;

public class Lab_135_Arrays_max {
    public static void main(String[] args) {
        int []arrays={11,14,45,8,78,96,55};
        Arrays.sort(arrays);
        System.out.println(arrays[0]);
        System.out.println(arrays[arrays.length-1]);
    }
}
