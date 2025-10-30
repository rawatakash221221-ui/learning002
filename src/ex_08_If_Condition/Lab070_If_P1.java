package ex_08_If_Condition;

public class Lab070_If_P1 {
    public static void main(String[] args) {
        int age=Integer.parseInt(args[0]);
        if(age>21){
            System.out.println("you are allowed to married");
        }
       else{
            System.out.println("you are not allowed to married");
        }
    }
}
