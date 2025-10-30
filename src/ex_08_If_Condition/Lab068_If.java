package ex_08_If_Condition;

public class Lab068_If {
    public static void main(String[] args) {
        String user_input = args[0];

        int age = Integer.parseInt(user_input);
        System.out.println(age);
        if (age > 18) {
            System.out.println("you are adult");
        } else {
            System.out.println("You are minor");
        }
    }
}

