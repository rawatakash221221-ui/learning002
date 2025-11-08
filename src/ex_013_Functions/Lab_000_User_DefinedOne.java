package ex_013_Functions;

public class Lab_000_User_DefinedOne {
    public static void main(String[] args) {
        int result=UserDefined(4 ,5);
        System.out.println(result);
        int result2=UserDefined(44,55);
        System.out.println(result2);
    }
    static int UserDefined(int a,int b){
        return a+b;
    }
}
