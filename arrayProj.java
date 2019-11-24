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
        int max = 4;
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

        int points [] = {0, 50, 100, 150, 200};
        System.out.println("Welcome to Wheel of Fortune!");
        System.out.println("Choose an Option");
        System.out.println("1: Quit, 2: Spin, 3: Solve");
        Scanner menub = new Scanner(System.in);
        int option = menub.nextInt();
        while(option < 4 && option >= 1) {
            if (option == 1) {
                System.exit(0);
            }
            if (option == 2) {
                System.out.println("Your category is: " + catstr);
                // body
                //if()


            }
            if (option == 3) {
                int tries = 0;
                while (tries < 3) {
                    System.out.println("Your category is: " + catstr);
                    Scanner option3 = new Scanner(System.in);
                    String solveanswer;
                    solveanswer = option3.nextLine();
                    if (solveanswer.equals(phrase)) {
                        System.out.println("You Won!");
                        System.out.println("You have: " + points[rand]);
                        System.exit(0);
                    }
                    else {
                        tries = tries + 1;
                        System.out.println("Try Again");
                        if(tries > 3){
                            break;
                        }

                    }



                }
            }
        } //end option while




    } //end static void
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
