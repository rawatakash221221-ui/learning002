package ex_011_While_Loop;
import com.sun.source.tree.ContinueTree;

import java.util.Random;
import java.util.Scanner;
public class Lab_107_Random_Guessing {
    public static void main(String[] args) {
        Random random = new Random();
        int numberGuess = random.nextInt(100) + 1;
      //  System.out.println(numberGuess);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no");
        int guess;
        int attempts = 0;
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Please Enter Valid No");
                scanner.next();
                continue;
            }
            guess= scanner.nextInt();
            attempts++;
            if (guess<0||guess>100){
                System.out.println("please Enter no between 1 to 100");
            }
            if(guess <numberGuess){
                System.out.println(" your no is too low");
            } else if (guess>numberGuess) {
                System.out.println("Your No is Too high");

            }
            else {
                System.out.println("Yeah You got The No in " + attempts  +" attempts");
                break;

            }
        }
    }
}
