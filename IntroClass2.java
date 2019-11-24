import java.lang.Math;
import java.util.Scanner;
//Dennis Dayan
public class IntroClass2 {
    public static void main(String[] args) {
        int int1 = 13;// Create (2) variables of type int and double

        double double1 = 13.130;// Create (2) variables of type int and double

        Math.pow(int1, 2);// Create an expression that squares each variable

        Math.pow(double1, 2);// Create an expression that squares each variable

        Math.sqrt(int1);
        // Create an expression that finds the absolute value of the
        // difference between your variables

        Math.sqrt(double1);
        double subd = int1 - double1;
        Math.abs(subd);
        int max = 35;
        int min = 10;
        System.out.println(Math.random()*((max-min))+min);// Create an expression that prints out a random number from 10-35
        // cube root
        Math.cbrt(double1);
        //hyperbolic cosine
        Math.cosh(double1);
        //cosine
        Math.cos(double1);

        //bonus
        boolean run = true;
        Scanner scan = new Scanner(System.in);

        while(run) {
            int sysmax = 6;
            int sysmin = 1;
            double comprandom = Math.random() * (sysmax - sysmin) + sysmin;
            int usersysmax = 6;
            int usersysmin = 1;
            double userinput = Math.random() * (usersysmax - usersysmin) + usersysmin;
            if (comprandom > userinput) {
                System.out.println("Computer has won");
                run = false;
                System.out.println("Do you want to play again?");
                String useranswer = scan.next();
                if(useranswer.equals("yes")){
                    run = true;

                }

            }
            if (comprandom < userinput) {
                System.out.println("You won!");

            }
            if (comprandom == userinput) {
                System.out.println("Stalemate");
            }
        }
    }
}
