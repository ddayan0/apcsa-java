import java.util.Scanner;
public class ifElse1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if (num1 == 5) {
            System.out.println("num1, Pass");
        }
        if (num2 == 5) {
            System.out.println("num2, Pass");
        }
        if (num3 == 5) {
            System.out.println("num3, Pass");
        } else {
            System.out.println("Did not equal 5, No Pass");
        }

        if (num1 > num2 && num1 > num3) {
            System.out.println("num1 is largest");
        }
        if (num2 > num1 && num2 > num3) {
            System.out.println("num2 is largest");
        }
        if (num3 > num1 && num3 > num2) {
            System.out.println("num1 is largest");
        }
        if (num1 < num2 && num1 < num3) {
            System.out.println("num1 is the smallest");
        }
        if (num2 < num1 && num2 < num3) {
            System.out.println("num2 is the smallest");
        }
        if (num3 < num1 && num3 < num2) {
            System.out.println("num1 is the smallest");
        }
        if (num1 + 1 == num2 && num2 + 1 == num3) {
            System.out.println("Numbers are in ascending order (By 1)");
        }
        if (num1 - 1 == num2 && num2 - 1 == num3) {
            System.out.println("Numbers are in descending order (By 1)");
        }
        System.out.println("Numbers in ascending order:");
        if (num1 < num2 && num1 < num3) {
            System.out.println(num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println(num2);
        } else if (num3 < num2 && num3 < num1) {
            System.out.println(num3);
        }
        if (num1 > num2 && num1 < num3) {
            System.out.println(num1);
        } else if (num2 > num1 && num2 < num3) {
            System.out.println(num2);
        } else if (num3 > num2 && num3 < num1) {
            System.out.println(num3);
        }
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        } else if (num3 > num2 && num3 > num1) {
            System.out.println(num3);
        }

        //bonus

        double compnum = Math.random() * 5;
        System.out.println("Guess a number");
        double guessnum = scan.nextDouble();
        if(guessnum == compnum){
            System.out.println("You guessed correctly");
        }
        else{
            System.out.println("Try Again");

        }
        double secguess = scan.nextDouble();
        if(secguess == compnum){
            System.out.println("You guessed correctly");
        }
        else{
            System.out.println("Try Again");

        }
        double thguess = scan.nextDouble();
        if(thguess == compnum){
            System.out.println("You guessed correctly");
        }
        else{
            System.out.println("Try Again");
        }
        double foguess = scan.nextDouble();
        if(foguess == compnum){
            System.out.println("You guessed correctly");
        }
        else{
            System.out.println("Try Again");
        }
        double figuess = scan.nextDouble();
        if (figuess == compnum){
            System.out.println("You guessed correctly");
        }
        else{
            System.out.println("Game Over");
        }










    }


}
