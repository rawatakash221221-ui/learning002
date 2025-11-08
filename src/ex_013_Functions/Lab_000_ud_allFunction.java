package ex_013_Functions;

import java.sql.SQLOutput;

public class Lab_000_ud_allFunction {
    public static void main(String[] args) {
        greet();
        String name=greet2();
        System.out.println(name);
        greet3("akash",21,25000);
        int sum=greet4(4,5,6,5);
        System.out.println(sum);



    }
    static void greet()
    {
        System.out.println("hi function 1");
        System.out.println();
    }
    static String greet2(){
        return"Akash";


    }
    static void greet3(String name,int age,double salary){
        System.out.println();
        System.out.println("your name is -> "+name+" \nyour age is-> " +age+ "\nyour salary is-> "+salary);
        System.out.println();
    }
    static int greet4(int a,int b,int c,int d){
        return a+b+c+d;
    }
}
