package ex_013_Functions;

public class Lab_000_SimpleMethod {
    public static void main(String[] args) {

        String name=return_type();
        System.out.println(name);
        int number=pop();
        System.out.println(number);

    }
    static String return_type(){
        System.out.println("hi there");
        return "akash";
    }
    static int pop(){
        return 5;
    }
}
