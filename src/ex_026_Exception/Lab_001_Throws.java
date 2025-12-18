package ex_026_Exception;



import java.util.Scanner;
public class Lab_001_Throws {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your age");
        int user_age= sc.nextInt();
        User_Club_age(user_age);
    }
    static void User_Club_age(int age)throws Exception{
        if(age < 18){
            throw new Exception("You are not allowed");

        }
        else {
            System.out.println("you are allowed");
        }
    }
}
