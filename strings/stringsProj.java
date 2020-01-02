// Dennis Dayan
// Mr. Watson
// AP Comp Sci A
// 17 December 2019 (so far)
// stringsProj.java

// the new age must come
// java must be dead soon
// we want our functions back

// TODO Mini Proj #4 (12 pts)
//        Format Name
//        Convert a name in the format LAST, FIRST to FIRST LAST
//        Make sure to handle spaces and apostrophes
//        Eg: von Neumann, John => John von Neumann
//        Eg: O'Reilly, Bill => Bill O'Reilly
// DONE!



// TODO Mini Proj #6 (12 pts)
//        How Many Multiples?
//        Determine how many letters are found multiple times in a String passed as an argument
//        Print to the console a single instance of a letter that is contained in a String two or more times
//        Eg: “Hello World”
//        l appears 3 times
//        o appears 2 times
//        If there are no multiples, print an error message to the user
// DONE!

// TODO Mini Proj #5 (12 pts)
//        Reverse Each
//        Reverse each word of a small paragraph provided as a parameter
//        This must not reverse the entire paragraph
//        You may use ONE method not on the Strings Slides, but it must be a String method (Choose wisely)
//        Must handle punctuation, special characters, and spacing appropriately
//        Eg: “The quick brown fox jumped over the lazy dog!”
//        ehT kciuq nworb xof depmuj revo eht yza'l !god
// DONE!

// ok first of all, why do we have to do all the hard ones for full credit?
// i mean ok, i guess you want to challenge us and motivate us to challenge ourselves
// but
// thats just a little mean


import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

// Python > C > Java
public class stringsProj {

    static void line(){ //line function for organization
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_"); //ooooo fancy
    } //end line()

    static void formatName(String target){ //method for miniProj #4
        int commaindex = target.indexOf(","); //gets index of comma for splicing
        String lastname = target.substring(0, commaindex); // retrives lastname up to comma
        String firstname = target.substring(commaindex + 2); // gets rest of name from comma
        System.out.println(firstname + " " + lastname); //prints formatted name
    }//end formatName()

    static void howManyMultiples(String target){ //method for miniProj #6
        // AAAAHHHHHHHH WHY MUST THIS BE!
        String comptarg = target.toLowerCase();
        int strlen = comptarg.length();
        int diff =0;
        for(int i = 0; i < strlen; i++){
            diff = removeLetter(target, target.substring(i, i+1)).length();
            if((strlen - diff)!= 1){
                System.out.println(target.substring(i, i+1)+" Repeats "+ (strlen - diff) + " times.");
            }
        }
    }//end howManyMultiples()

    static String  removeLetter(String target, String toRemove){
        String newStr = "";
        for(int i = 0; i < target.length(); i++){
            newStr = target.replace(toRemove, "");
        }
        return newStr;

    }
    static void reverseEach(String target){ //method for miniProj #5
        String[] words = target.split(" "); //splits spaces between each word in the sentence to reverse
        String revStr = ""; // inits empty string to be filled later
        for (int i = 0; i < words.length; i++){ //for:
            String word = words[i]; // sets string object of word to index of string array words for the reversal
            String revWrd = ""; // inits empty string to be filled later
            for(int x = word.length()-1; x >= 0; x--){ //for:
                revWrd = revWrd + word.charAt(x); // sets reverse word to the emp string + the string array at char index of x
            }
            revStr = revStr + revWrd + " "; // actually sets reverse string
            int targlen = target.length()+1; //gets length of target string
            int strlen = revStr.length(); // gets length of the reverse string
            if(targlen == strlen){ // if they both equal
                System.out.println(revStr); // then only print out the final reversed string

            }
        }
    }//end reverseEach()

    //below are arrays useful to the program itself, these are not made to satisfy specific requirements
//    static void stringtoArr(String target){
//        for(int i = 0; i < target.length(); i++){
//            String [] genArray = new String[i];
//        }
//    }

    public static void main(String[] args) { //main method (obviously)
        line(); // calls line function
        formatName("O'Reilly, Bill"); //formatName function
        line();
        howManyMultiples("Impossible"); // howManyMultiples
        line();
        reverseEach("The quick brown fox jumped over the lazy dog!"); //reverseEach
        line();

    } //end psvm()





}
