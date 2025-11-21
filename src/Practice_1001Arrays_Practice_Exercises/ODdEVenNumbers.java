package Practice_1001Arrays_Practice_Exercises;

public class ODdEVenNumbers {
    public static void main(String[] args) {
        int[]numbers={1,2,3,4,5,6};
        for (int num:numbers){
            if (num%2==0){
                System.out.println("Even Number " +num);

            }
            else if(num%2==1){
                System.out.println("Odd number " +num);
            }
        }

    }
}
