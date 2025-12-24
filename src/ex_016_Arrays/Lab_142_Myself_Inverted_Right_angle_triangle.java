package ex_016_Arrays;
import java.util.Scanner;
public class Lab_142_Myself_Inverted_Right_angle_triangle {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("Enter you N");
        int n= sc.nextInt();
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}