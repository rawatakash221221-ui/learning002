package ex_10_Forloop;

public class Lab_100_Forloop_lower_Break {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if(i==5){
                break;
            }
            System.out.println(i);
        }
    }
}
