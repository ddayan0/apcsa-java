// dennis dayan
// mr watson
// ap comp sci a
// "the only way to win is not to play" - wargames (probably)
import java.util.Scanner;
public class loopsProj {
    public static void main(String[] args) { // psvm 4 life!
        Scanner scan = new Scanner(System.in); // initializes scanner object "scan"
        int attempts = 10; // maybe unused? who knows
        for(int i = 0; i < 10; i++ ){
            int pin = (int)(Math.floor(1000 + Math.random() * 9000)); // ultra secure, gens random random 4 digit pin
            int newattempts = attempts - i; // whoa it was used (good job dennis)
            System.out.println("Enter Pin!, you have " +  newattempts  + " attempts remaining! DO NOT USE LETTERS!"); // prints how many attempts remaining
            int userscan = scan.nextInt(); // pretty self-explanatory
            if(userscan == pin){
                System.out.println("Access Granted");
                System.exit(0); // exits at 0
            }
            if(i == 9){ // lock out policy
                System.out.println("CRITICAL: VAULT LOCKING!");
            }
        }
    }
}
