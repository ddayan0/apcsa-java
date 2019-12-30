// Dennis Dayan
//variableIO1.java
import java.util.Scanner;

public class variableIO1 {
    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = kboard.next();
        System.out.println("Enter Last Name");
        String lastName = kboard.next();
        System.out.println("Enter Age");
        int age = kboard.nextInt();
        System.out.println("Enter GPA");
        double gpa = kboard.nextDouble();
        System.out.println("My GPA is " + gpa);
        System.out.println("My Age is " + age);
        System.out.println("My first name is " + firstName);
        System.out.println("My last name is " + lastName);
        if (gpa >= 3.5){
            System.out.println("Good Job");
        }
        else{
            System.out.println("You have it in you, study harder!");
        }
        kboard.close();
