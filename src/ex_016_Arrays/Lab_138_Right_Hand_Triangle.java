package ex_016_Arrays;
import java.util.Scanner;
public class Lab_138_Right_Hand_Triangle {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter you n");
        int n= sc.nextInt();
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
