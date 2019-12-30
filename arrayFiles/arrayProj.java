// Dennis Dayan
// AP CSA
// listen to merzbow while examining this mess
import java.util.*; //imports java.util
import java.lang.*; //imports java.lang
public class arrayProj {
    static void printline(){
        System.out.println("-------------------------------------"); //just prints a line, nothing more nothing less
    }
    static boolean isItSame(String [] arr, String [] arrb){ // checks if two given arrays are the same, returns true if they are, false if they are not
        for(int i = 0; i < arr.length; i++){
            if(!arr[i].equals(arrb[i])){
                return false;
            }
        }
        return true;
    }
    static void solve1(){ //first solve level contained in the method
        String phrase = "Think Different"; // set phrase for user
        String category = "Slogans"; // set category
        System.out.println("Your category is " + category);
        Scanner solve1scan = new Scanner(System.in); //defines new scanner object
        String userinput = solve1scan.nextLine();
        if(userinput.equals(phrase)){
            System.out.println("You know have 200 Points! Advancing!"); // completely arbitrary points
            solve2(); //jumps to next solve level contained in the method
        }
        else{
            System.out.println("You Lost!"); //oh no!!!!!
            wheeloffotune(); //restarts the program
        }
    }//end static void
    static void solve2(){
        String phrase = "Apple"; //set phrase
        String category = "Brand"; // set category
        System.out.println("Your category is " + category);
        Scanner solve1scan = new Scanner(System.in); // new scanner object
        String userinput = solve1scan.nextLine();
        if(userinput.equals(phrase)){
            System.out.println("You know have 400 Points! Advancing!"); //arbitrary points
            //System.out.println("TEST");
            solve3(); //advances to next level
        }
        else{
            System.out.println("You Lost!");
            wheeloffotune(); //restarts program
        }
    } //see above, comments are redundant at this point
    static void solve3(){
        String phrase = "Ferrari Enzo";
        String category = "Car";
        System.out.println("Your category is " + category);
        Scanner solve1scan = new Scanner(System.in);
        String userinput = solve1scan.nextLine();
        if(userinput.equals(phrase)){
            System.out.println("You know have 600 Points! You won the game!");
            //System.out.println("TEST");
            wheeloffotune(); // restarts due to win
        }
        else{
            System.out.println("You Lost!");
            wheeloffotune();
        }
    }
    static void spin1(){ // first spin level, all comments are redundant for spin2, 3
        System.out.println("Your category is: Cars"); // set category, DOES NOT USE cats[] ARRAY
        String phrase1 = "Bugatti Veyron"; // set phrase, DOES NOT USE bank*[] ARRAY
        String phrase1Arr[] = {"B", "U", "G", "A", "T", "T", "I", " ", "V", "E", "Y", "R", "O", "N"};//Seperates phrase into letters
        String phrase1Gs[] = {"_", "_", "_", "_", "_", "_", "_", " ", "_", "_", "_", "_", "_", "_"}; // into dashes for display
        Scanner op2guess = new Scanner(System.in);
        String userguess = op2guess.nextLine();
        boolean ispharse1complete = false;
        while (!ispharse1complete) { // if iscontains userguess, array
            if (isContains(phrase1Arr, userguess)) {
                for (int i = 0; i < phrase1Arr.length; i++) {
                    if (phrase1Arr[i].equalsIgnoreCase(userguess)) {
                        phrase1Gs[i] = userguess;   // create a method for storing new guessarray
                    }
                    if(isItSame(phrase1Arr, phrase1Gs)){ //if userguess converted into phrase1Gs is the same as phrase1Arr, the user advances
                        System.out.println("Congratulations, Level 2 with 200 points!"); //arbitrary points
                        spin2(); //next level
                    }
                }
                for(String s : phrase1Gs) { // E N  A N C E D
                    System.out.print(s + " ");
                }
            }
            else{
                System.out.println("Invalid"); // if input is invalid (letter is not present in phrase)
            }
            System.out.println("Enter another letter");
            userguess = op2guess.nextLine(); //defines userguess scanner object
        }
    }
    static void spin2(){ //look at above
        System.out.println("Your category is: People"); // set category, DOES NOT USE cats[] ARRAY
        String phrase1 = "Steve Jobs"; // set phrase, DOES NOT USE bank*[] ARRAY
        String phrase1Arr[] = {"S", "T", "E", "V", "E", " ", "J", "O", "B", "S"};//Seperates phrase into letters
        String phrase1Gs[] = {"_", "_", "_", "_", "_", " ", "_", "_", "_", "_"}; // into dashes for display
        Scanner op2guess = new Scanner(System.in);
        String userguess = op2guess.nextLine();
        boolean ispharse1complete = false;
        while (!ispharse1complete) { // if iscontains userguess, array
            if (isContains(phrase1Arr, userguess)) {
                for (int i = 0; i < phrase1Arr.length; i++) {
                    if (phrase1Arr[i].equalsIgnoreCase(userguess)) {
                        phrase1Gs[i] = userguess;   // create a method for storing new guessarray
                    }
                    if(isItSame(phrase1Arr, phrase1Gs)){
                        System.out.println("Congratulations, Level 3 with 400 points!");
                        spin3();
                    }
                }
                for(String s : phrase1Gs) {
                    System.out.print(s + " ");
                }
            }
            else{
                System.out.println("Invalid");
            }
            System.out.println("Enter another letter");
            userguess = op2guess.nextLine();
        }
    }
    static void spin3(){ //look at above
        System.out.println("Your category is: RBR Teachers"); // set category, DOES NOT USE cats[] ARRAY
        String phrase1 = "Mr Milonas"; // set phrase, DOES NOT USE bank*[] ARRAY
        String phrase1Arr[] = {"M", "R", " ", "M", "I", "L", "O", "N", "A", "S"};//Seperates phrase into letters
        String phrase1Gs[] = {"_", "_", " ", "_", "_", "_", "_", "_", "_", "_"}; // into dashes for display
        Scanner op2guess = new Scanner(System.in);
        String userguess = op2guess.nextLine();
        boolean ispharse1complete = false;
        while (!ispharse1complete) { // if iscontains userguess, array
            if (isContains(phrase1Arr, userguess)) {
                for (int i = 0; i < phrase1Arr.length; i++) {
                    if (phrase1Arr[i].equalsIgnoreCase(userguess)) {
                        phrase1Gs[i] = userguess;   // create a method for storing new guessarray
                    }
                    if(isItSame(phrase1Arr, phrase1Gs)){
                        System.out.println("Congratulations, You won with 600 points!");
                        wheeloffotune(); //restarts program, user has won
                    }
                }
                for(String s : phrase1Gs) {
                    System.out.print(s + " ");
                }
            }
            else{
                System.out.println("Invalid");
            }
            System.out.println("Enter another letter");
            userguess = op2guess.nextLine();
        }
    }
    static void wheeloffotune(){ //menu!
        System.out.println("Welcome to Wheel of Fortune!");
        System.out.println("Choose an Option");
        System.out.println("1: Quit, 2: Spin, 3: Solve"); // menu for user
        Scanner menub = new Scanner(System.in); // initializes new scanner instance menub for the menu ONLY
        int option = menub.nextInt(); // sets int menub to an option variable
        boolean gamecomplete = false;
        while(!gamecomplete) { // Can be replaced with true, but this works as of now (11/26/19)
            if (option == 1) {
                System.exit(0); // quits entire program, sorry mr. watson
            }
            if (option == 2) { // SPIN function
                spin1();
            }
            if (option == 3) {
                solve1(); //SOLVE function
            }
        }
    }
     //end option while
    //end static void
    static boolean isContains(String [] arr,String target){ //returns true if user supplied target string if found in array, false otherwise
        for(int i = 0; i < arr.length; i++){
           if(arr[i].equals(target)){
               return true;
           }
        }
        return false;
    }//end static void
    public static void main(String[] args) { // the program
        wheeloffotune();
    }
} // end public class


//ending off on line 190, nice number. Project finished at 4 December 2019, 11:06 PM UTC