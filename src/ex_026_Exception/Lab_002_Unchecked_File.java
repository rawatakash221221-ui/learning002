package ex_026_Exception;

public class Lab_002_Unchecked_File {
    public static void main(String[] args) {
        int a=10;//ArithmeticException
        int b=0;
        int c=a/b;
        System.out.println(c);

        String name=null;//NullPointerException
        name.trim();
        //This is Unchecked File;
    }
}
