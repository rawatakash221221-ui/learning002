package ex_09_Switch;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab080_Real_Automation_Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your browser name");
        String browser=sc.next();
        switch (browser){
            case "chrome":
                System.out.println("staring your chrome");
                System.out.println("________");
                System.out.println("tc1");
                break;
            case "firefox":
              case  "Firefox":

                System.out.println("starting your firefox ");
                System.out.println("selenium");
                break;
            case "mozilla":
                System.out.println("starting your mozilla");
                break;
            default:
                System.out.println("invalid search engine");
        }

    }
}
