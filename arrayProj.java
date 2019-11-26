// Dennis Dayan
// AP CSA

import java.util.*; //imports java.util
import java.lang.*; //imports java.lang

public class arrayProj {

    static void wheeloffotune(){
        String bankone [] = {"The Godfather", "Citizen Kane", "Casablanca", "Pulp Fiction", "Star Wars"}; //Movies
        String banktwo [] = {"Bugatti Veyron", "Toyota Prius", "Honda Civic", "Mclaren Senna", "Ferrari LaFerrari"};//Cars
        String bankthree[] = {"Barack Obama", "Saddam Hussein", "Hillary Clinton", "Donald Trump", "Bernie Sanders"};//People
        String bankfour [] = {"Think Different", "Just Do It", "Breakfast of Champions", "Can You Hear Me Now", "Got Milk"};//Slogans
        String cats [] = {"Movies", "Cars", "People", "Slogans"}; // Array containing categories for the independent solve function
        // get a phrase and then cat from it
        //sout category, store phrase
        int max = 3; //Max index for cats []
        int min = 0; // Lowest index for cats []
        int range = max - min + 1; //setting range for math.random in between max and min
        int rand = (int)(Math.random() * range) + min; //Generates a number within that range and stores it into the int rand
        String phrase = " "; // empty phrase for init
        String catstr = " "; // empty category for init
        if(rand == 0){ // if lowest index
            phrase = bankone[rand]; // get random phrase from bankone
            catstr = cats[0]; // phrase automatically Cars as showin in cats array
        } // repeats until rand==3, no further explanation necessary
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
        int points [] = {25, 50, 100, 150, 200};// bank of points to be awarded to the user 
        int userpoints = 0; // initializes userpoints with a value of zero
        System.out.println("Welcome to Wheel of Fortune!");
        System.out.println("Choose an Option");
        System.out.println("1: Quit, 2: Spin, 3: Solve, 4: Print Points"); // menu for user
        Scanner menub = new Scanner(System.in); // initializes new scanner instance menub for the menu ONLY
        int option = menub.nextInt(); // sets int menub to an option variable
        int tries = 0; // Can remove  
        while(tries == 0) { // Can be replaced with true, but this works as of now (11/26/19)
            if (option == 1) {
                break; // quits entire program
            }
            if (option == 2) { // SPIN function
                System.out.println("Your category is: Cars"); // set category, DOES NOT USE cats[] ARRAY
                String phrase1 = "Bugatti Veyron"; // set phrase, DOES NOT USE bank*[] ARRAY
                String phrase1Arr [] = {"B", "u", "g", "a","t", "t", "i", " ", "V", "e", "y", "r", "o", "n"};//Seperates phrase into letters
                String phrase1Gs [] = {"_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"}; // into dashes for display
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
