// Dennis Dayan
// AP CSA

import java.util.*;
import java.lang.*;

public class arrayProj {

    static void wheeloffotune(){
        String bankone [] = {"The Godfather", "Citizen Kane", "Casablanca", "Pulp Fiction", "Star Wars"};
        String banktwo [] = {"Bugatti Veyron", "Toyota Prius", "Honda Civic", "Mclaren Senna", "Ferrari LaFerrari"};
        String bankthree[] = {"Barack Obama", "Saddam Hussein", "Hillary Clinton", "Donald Trump", "Bernie Sanders"};
        String bankfour [] = {"Think Different", "Just Do It", "Breakfast of Champions", "Can You Hear Me Now", "Got Milk"};
        String cats [] = {"Movies", "Cars", "People", "Slogans"};
        // get a phrase and then cat from it
        //sout category, store phrase
        int max = 3;
        int min = 0;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;
        String phrase = " ";
        String catstr = " ";
        if(rand == 0){
            phrase = bankone[rand];
            catstr = cats[0];
        }
        if(rand == 1){
            phrase = banktwo[rand];
            catstr = cats[1];
        }
        if(rand == 2){
            phrase = bankthree[rand];
            catstr = cats[2];
        }
        if(rand == 3){
            phrase = bankfour[rand];
            catstr = cats[3];
        }
        int points [] = {25, 50, 100, 150, 200};
        int userpoints = 0;
        System.out.println("Welcome to Wheel of Fortune!");
        System.out.println("Choose an Option");
        System.out.println("1: Quit, 2: Spin, 3: Solve, 4: Print Points");
        Scanner menub = new Scanner(System.in);
        int option = menub.nextInt();
        int tries = 0;
        while(tries == 0) {
            if (option == 1) {
                break;
            }
            if (option == 2) {
                System.out.println("Your category is: Cars");
                String phrase1 = "Bugatti Veyron";
                String phrase1Arr [] = {"B", "u", "g", "a","t", "t", "i", " ", "V", "e", "y", "r", "o", "n"};
                String phrase1Gs [] = {"_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"};
                Scanner op2guess = new Scanner(System.in);
                String userguess = op2guess.nextLine();
                for(int i = 0; i < phrase1Arr.length; i++){
                    if(phrase1Arr[i].equalsIgnoreCase(userguess)){
                        userpoints += points[rand]; //put this into method
                        phrase1Gs[i] = userguess;   // create a method for storing new guessarray
                        for(String s: phrase1Gs){
                            System.out.print(s + " ");
                        }
                    }

                }











            }
            if (option == 3) {
                //int rand2 = (int)(Math.random() * range) + min;
                //int rand3 = (int)(Math.random() * range) + min;
                System.out.println("Your category is: " + catstr);
                Scanner option3 = new Scanner(System.in);
                String solveanswer;
                solveanswer = option3.nextLine();
                if (solveanswer.equals(phrase)) {
                    userpoints = points[rand];
                    System.out.println("You Won!");
                    System.out.println("You have: " + userpoints + " Points!");
                    wheeloffotune();
                }
                else {
                    userpoints = 0;
                    System.out.println("You Guessed Incorrectly! You Now Have: " + userpoints + " Points!");
                    wheeloffotune();
                }
            }
            if(option == 4){
                System.out.println(userpoints);
                wheeloffotune();
            }
        }
    } //end option while
    //end static void
    static boolean isContains(String [] arr, String [] arr2, String [] arr3, String [] arr4, String target){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr2.length; j++){
                for(int d = 0; d < arr3.length; d++){
                    for(int e = 0; e < arr4.length; e++){
                        if(arr[i].equals(target)){
                            return true;
                        }
                        if(arr2[j].equals(target)){
                            return true;
                        }
                        if(arr3[d].equals(target)){
                            return true;
                        }
                        if(arr4[e].equals(target)){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }//end static void
    public static void main(String[] args) {
        wheeloffotune();
    }




} // end public class
