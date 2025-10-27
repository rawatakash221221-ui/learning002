package ex_006_Ternary_Operator;

public class Lab057_Real_Age_Classification {
    public static void main(String[]akash_args) {
        String user_input=akash_args[0];
        System.out.println(user_input);
        System.out.println(user_input instanceof String);
        int age=Integer.parseInt(user_input);
               String result=(age<18)?"minor":(age<=60)?"adult":"senior citizen";
        System.out.println(result
        );
    }
}
