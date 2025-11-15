package ex_015_String_Builder_String_Buffer;
import java.util.Scanner;
public class Lab_127_Scanner_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your word");
        String name=sc.next();
        System.out.println(name.length());
        System.out.println(name.concat("ji"));
        System.out.println(name.contains("a"+"b"));

    }
}
