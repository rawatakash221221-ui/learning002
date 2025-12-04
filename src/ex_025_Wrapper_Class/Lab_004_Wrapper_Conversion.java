package ex_025_Wrapper_Class;

public class Lab_004_Wrapper_Conversion {
    public static void main(String[] args) {
        String num ="10";
        int aa =10;

       Integer a=Integer.parseInt(num);
       int a_p=Integer.parseInt(num);

       Integer aaa=10;
       String sss=aaa.toString();
        System.out.println(sss instanceof String);
        System.out.println(aaa instanceof Integer);



        }

    }
