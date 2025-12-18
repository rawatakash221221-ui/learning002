package ex_026_Exception;

public class Lab_001_Exception {
    public static void main(String[] args) {
        System.out.println("Start the Program");
        String a=args[0];
        int b=Integer.parseInt(a);
      int c= 100/b;
        System.out.println(c);
        System.out.println("End the Program");

    }
}
