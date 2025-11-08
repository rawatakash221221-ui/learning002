package ex_011_While_Loop;
import java.util.Scanner;
public class Lab_106_WhileLoop3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your Factorial Number");
        if(!scanner.hasNextInt())
        {
            System.out.println("please enter integer you fool!");
        }else {
            int number= scanner.nextInt();
            int fact=1;
            if(number==0){
                fact=1;
                System.out.println("fact =1");
            }
            if(number<0 || number>Integer.MAX_VALUE){
                System.out.println("beyond the limit");
            }
            int i=1;
            while(i <=number)
            {
                fact=fact*i;
                i++;
            }
            System.out.println(fact);
        }
    }
}
