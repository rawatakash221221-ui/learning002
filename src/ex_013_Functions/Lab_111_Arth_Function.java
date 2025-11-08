package ex_013_Functions;
import java.util.Scanner;
public class Lab_111_Arth_Function {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=returnParameter(scanner,"Enter your 1 no");
        int b=returnParameter(scanner,"Enter your 2 no");

        int result_sum=sum(a,b);
        int result_sub=sub(a,b);
        int result_mul=mul(a,b);
        int result_div=div(a,b);

        System.out.println("sum is " +result_sum);
        System.out.println("subtraction is " +result_sub);
        System.out.println("multiplicatin is " +result_mul);
        System.out.println("divison is "+result_div);

    }
    static int returnParameter(Scanner scanner,String prompt){
        System.out.println(prompt);
        if(scanner.hasNextInt()){
            return scanner.nextInt();
        }
        else{
            System.out.println("Enter integer only");
            System.exit(0);
            return 0;
        }

        }
    static int sum(int a,int b){
        return a+b;
    }
    static int sub(int a,int b){
        return a-b;
    }
    static int mul(int a,int b){
        return a*b;
    }
    static int div(int a,int b){
        if (b==0){
            System.out.println("Enter valid value of b");

        }
        return a/b;
    }
}
