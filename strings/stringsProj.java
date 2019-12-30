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
// IN PROGRESS

// TODO Mini Proj #5 (12 pts)
//        Reverse Each
//        Reverse each word of a small paragraph provided as a parameter
//        This must not reverse the entire paragraph
//        You may use ONE method not on the Strings Slides, but it must be a String method (Choose wisely)
//        Must handle punctuation, special characters, and spacing appropriately
//        Eg: “The quick brown fox jumped over the lazy dog!”
//        ehT kciuq nworb xof depmuj revo eht yza'l !god

// ok first of all, why do we have to do all the hard ones for full credit?
// i mean ok, i guess you want to challenge us and motivate us to challenge ourselves
// but
// thats just a little mean


import java.util.Arrays;

// Python > C > Java
public class stringsProj {

    static void line(){ //line function for organization
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_"); //ooooo fancy
    } //end line()

    static void formatName(String target){ //method for miniProj #4
        int commaindex = target.indexOf(",");
        String lastname = target.substring(0, commaindex);
        String firstname = target.substring(commaindex + 2);
        System.out.println(firstname + " " + lastname);
    }//end formatName()

    static void howManyMultiples(String target){ //method for miniProj #6
        String [] targetArray = new String[target.length()];
        int freq = 0;
        for(int i = 0; i < target.length(); i++){
            targetArray[i] = target.substring(i, i+1);
        }
        for(int i =0; i < targetArray.length; i++){
            for(int j = 0; j < targetArray.length; j++){
                if(targetArray[i].equals(targetArray[j])){
                    break; //finish this?
                    // maybe do sams method of individual letters
                    //screw stupid string arrays?
                }
            }
        }


    }//end howManyMultiples()

    static void reverseEach(String target){ //method for miniProj #5
	    String[] words = target.split(" ");
	    String revStr = "";
	    for (int i = 0; i < words.length; i++){
	    	String word = words[i];
		String revWrd = "";
		for(int x = word.length()-1; x >= 0; x--){
			revWrd = revWrd + word.charAt(x);
		
		}
		revStr = revStr + revWrd + " ";
		int targlen = target.length()+1;
		int strlen = revStr.length();
		if(targlen == strlen){
			System.out.println(revStr);
		
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
        //howManyMultiples("guuw");
	reverseEach("The quick brown fox jumped over the lazy dog!");
	line();

    } //end psvm()





}
