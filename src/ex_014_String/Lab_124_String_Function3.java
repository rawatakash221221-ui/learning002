package ex_014_String;

public class Lab_124_String_Function3 {
    public static void main(String[] args) {
        String s1="Akash";
        String s2=new String("Akash");
        String s3=new String("akash");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
