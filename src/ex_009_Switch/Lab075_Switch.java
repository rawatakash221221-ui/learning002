package ex_009_Switch;

public class Lab075_Switch {
    public static void main(String[] args) {
        int day=3;
        switch(day){
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
