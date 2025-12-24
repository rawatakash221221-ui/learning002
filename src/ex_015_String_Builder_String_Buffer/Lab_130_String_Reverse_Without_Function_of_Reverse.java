package ex_015_String_Builder_String_Buffer;

public class Lab_130_String_Reverse_Without_Function_of_Reverse {
    public static void main(String[] args) {


        String name = "Akash";
        String reverse = " ";

        for (int i = name.length()-1; i>=0 ; i--) {
            reverse=reverse +name.charAt(i);


        }
        System.out.println(reverse);
    }
}