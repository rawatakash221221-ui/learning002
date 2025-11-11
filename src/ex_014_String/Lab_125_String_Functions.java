package ex_014_String;

public class Lab_125_String_Functions {
    public static void main(String[] args) {
        String s1="Ram";
        System.out.println(s1.charAt(1));
        System.out.println(s1.length());
        String s11="5";
        System.out.println(s11.concat(s11));
        boolean b=" ".isBlank();
        System.out.println(b);
        String s12="java".replace("a","0");
        System.out.println(s12);
        String s13="Akash".substring(1,5);
        System.out.println(s13);

    }
}
