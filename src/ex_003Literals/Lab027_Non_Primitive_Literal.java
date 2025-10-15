package ex_003Literals;

public class Lab027_Non_Primitive_Literal {
    public static void main(String[] args) {
        String name = "Akash Rawat";
        int[] arrays = new int[10];
        arrays[0]=55;
        arrays[1]=56;
        System.out.println(arrays[1]);
        arrays[10]=14;
        System.out.println(arrays[10]);
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
        //	at ex_003Literals.Lab027_Non_Primitive_Literal.main(Lab027_Non_Primitive_Literal.java:10)
    }
}
