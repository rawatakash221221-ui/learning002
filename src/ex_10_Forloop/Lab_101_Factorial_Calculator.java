package ex_10_Forloop;
import java.util.Scanner;

public class Lab_101_Factorial_Calculator {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the Number");
        int a= n.nextInt();
        int fact=1;
        if (a==0) {
            fact=1;
        }
        for (int i = 1; i <=a; i++) {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
