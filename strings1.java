// Dennis Dayan
// Mr. Watson
// AP CSA
// 12/9/19

// why is java hard
// it is complicated now
// i want python back


import javax.sound.midi.Soundbank;

public class strings1 {
    // endsWithAsterisk
    // Write code that will print true if a given string is not empty and
    // ends with an asterisk, or false otherwise
    static void line(){
        System.out.println("_-_-_-__-_-_-__-_-_-__-_-_-_");
    }//end line
    static boolean endsWithAsterisk(String teststr){
        if(teststr.endsWith("*")){
            return true;
        }
        else{
            return false;
        }
    }//end endsWithAsterisk
    // formatBday
    // Write code that will take a birthday String in the format
    // "MMDDYYYY" and print in the format "MM/DD/YYYY"
    // This code must also check if the input is valid:
    // "MMDDYY" and "MMDDYYYY?" should print an error
    static void formatBday(String MMDDYYYY){
        if(MMDDYYYY.contains("?")){
            System.out.println("Invalid");
            System.exit(1337);
        }
        String MM = MMDDYYYY.substring(0, 2);
        String DD = MMDDYYYY.substring(2, 4);
        String YYYY = MMDDYYYY.substring(4);
        System.out.println(MM + "/" + DD + "/" + YYYY );
    }//end formatBday
    // unFormatBday
    // Write code that will take a birthday String in the format
    // "MM-DD-YYYY" and print in the format "MMDDYYYY"
    // This code must also check if the input is valid:
    // "MM/DD/YYYY" should print an error
    static void unFormatBday(String formattedstr){
        if(formattedstr.contains("/")){
            System.out.println("Invalid Exiting ");
            System.exit(1337);
        }
        String unformat = formattedstr.replace("-", "");
        System.out.println(unformat);
    }//end unFormatBday
    // ccNumber
    // Write code that will take in a Credit Card Number
    // "1111222233334444" and add spaces after every fourth digit, except
    // for the last => "1111 2222 3333 4444"
    static  void ccNumber(String ccnum){
        if(ccnum.length() == 16){
            String first4 = ccnum.substring(0, 4);
            String sec4 = ccnum.substring(4, 8);
            String third4 = ccnum.substring(8, 12);
            String final4 = ccnum.substring(12, 16);
            System.out.println(first4 + " " + sec4 + " " + third4 + " " + final4);
        }
    }//end ccNumber
    // whatIndex
    // Write code that will print the index of a given letter/series of
    // letters. If the letter is not found, an error message will print =>
    // “My String”, “S” will print 3
    static void whatIndex(String givenstring, String target){
        int indexnum = givenstring.indexOf(target);
        System.out.println("Target " + target + " Found at " + indexnum );
        if(!givenstring.contains(target)){
            System.out.println("Error, TARGET NOT FOUND");
            System.exit(1337);
        }
    } //end whatIndex
    // frontToBack
    // Write code that will take the first character of a String and place
    // it at the end => "MyString" will print "yStringM"
//    static void frontToBack(String givenstring){
//        String laststr = givenstring
//    }









    public static void main(String[] args) {
        System.out.println(endsWithAsterisk("Hello**")); //returns true
        line();
        formatBday("11242002"); // prints 11/24/02
        line();
        unFormatBday("11-24-2002"); //prints 11242002
        line();
        ccNumber("1111222233334444");
        line();
        whatIndex("Hello, How are you?", "a");


    } //psvm 4 lyfe

} //end plublic class strings1
