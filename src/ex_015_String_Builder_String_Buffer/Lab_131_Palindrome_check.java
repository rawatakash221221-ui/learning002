package ex_015_String_Builder_String_Buffer;
import java.util.Scanner;
public class Lab_131_Palindrome_check {
    public static void main(String[] args) {

String reverse="";
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter your Word To check Palindrome Or Not");

      String name= sc.next();
        for (int i=name.length()-1; i >=0 ; i--) {
            reverse = reverse + name.charAt(i);
        }

            if (reverse.equalsIgnoreCase(name)){
                System.out.println("Your word is Palindrome");
            }
            else {
                System.out.println("Your word is not Palindrome");
            }




    }
}