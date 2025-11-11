package ex_014_String;

import java.util.Locale;

public class Lab_121_String_Categories {
    public static void main(String[] args) {
        String s1="Akash";// consatnt pool
        String s2=new String("Vikas");//heap area
        s2=s2.toUpperCase();
        System.out.println(s2);
    }
}
