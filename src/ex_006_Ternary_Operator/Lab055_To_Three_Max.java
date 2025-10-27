package ex_006_Ternary_Operator;

public class Lab055_To_Three_Max {
    public static void main(String[] args) {
        int n1=2;
        int n2=9;
        int n3=-10;
        int max=(n1>n2)?((n1>n3)?n1:n3):((n2>n3)?n2:n3);
        System.out.println(max);
    }
}
