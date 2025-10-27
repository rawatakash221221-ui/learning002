package ex_006_Ternary_Operator;

public class Lab056_To_Three_Max {
    public static void main(String[] args) {
        int n1=10;
        int n2=2;
        int n3=4;
        int max=(n1>n2)?((n1>n3)?n1:n3):((n2>n3)?n2:n3);
        System.out.println(max);
    }
}
