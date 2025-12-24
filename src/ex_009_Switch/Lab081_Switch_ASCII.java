package ex_009_Switch;

public class Lab081_Switch_ASCII {
    public static void main(String[] args) {
        char ch='B';
        switch (ch){
            case 65:
                System.out.println("match ascii");
                break;
            case 66:
                System.out.println("b asciii");
                break;
            default:
                System.out.println("doesnot match ascii");
        }
    }
}
