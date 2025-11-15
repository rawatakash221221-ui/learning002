package ex_016_Arrays;

public class Lab_143_Arrays_Second_Highest {
    public static void main(String[] args) {
        int []numbers={42,43,44,45,46,47,48};
        int highest=0;
        int second_highest=0;
        for (int num:numbers){
            if (num>highest){
                second_highest=highest;
                highest=num;
            } else if (num>second_highest && num!=highest) {
                second_highest=num;


            }

        }
        System.out.println(second_highest);
    }
}
