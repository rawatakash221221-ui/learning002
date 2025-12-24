package ex_014_String;

public class Lab_122_String_Functions {
    public static void main(String[] args) {
        String s1="Anybody";
        String s2=new String("Can Dance");
        System.out.println(s1.length());
        System.out.println(s1.concat(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.charAt(0));
        System.out.println(s1.compareTo(s2));
        String s4="24";
        String s3="15";
        System.out.println(s4.compareTo(s3));

    }
}
