// Dennis Dayan
//Mr. Watson
import java.util.*;
import java.lang.*;
//**
//a new code comes
// exit / sign 0 is showing today
// what is happening
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// a haiku by dennis
//**
public class arrayTwo {
    public static void main(String[] args) {
        String strArray [];
        strArray = new String[10];
        strArray[0] = "Mr. Watson";
        strArray[1] = "Mr. Wilkins";
        strArray[2] = "Mr. Clark";
        strArray[3] = "Mr. Milonas";
        strArray[4] = "Mrs. Bunn";
        strArray[5] = "Mr. Hussey";
        strArray[6] = "Ms. Finck";
        strArray[7] = "Mr. Davis";
        strArray[8] = "Mr. Donohue";
        strArray[9] = "Mr. Choback";
        String strArray2 [];
        strArray2 = new String[10];
        strArray2[0] = "Mr. Watson";
        strArray2[1] = "Mr. Wilkins";
        strArray2[2] = "Ms. Siweic";
        strArray2[3] = "Mr. McGoldrick";
        strArray2[4] = "Ms. Castro";
        strArray2[5] = "Mrs. Tvrdik";
        strArray2[6] = "Mr. No";
        strArray2[7] = "Mr. Yes";
        strArray2[8] = "Mr. Null";
        strArray2[9] = "Mr. NotNull";
        String target = "Mr. Watson";
        for(int i = 0; i < strArray.length; i++){
            for(i = 0; i < strArray2.length; i++){
                if(strArray[i].equals(target) ){
                    System.out.println("Found!" + target);  //FIXED!
                }
                if(strArray2[i].equals(target)){
                    System.out.println("Found!" + target);
                }
            }
        }
        System.out.println("============================================");
        for(int i = 0; i < strArray.length; i++){
            for(i = 0; i < strArray2.length; i++){
                if(strArray[i].equals(strArray2[i])){
                    System.out.println("Common Elements" + " "+ i);
                }
                else{
                    System.out.println("No Common Elements" + " "+ i);
                }
            }
        }
        System.out.println("-----------------------------------------------");
        strArray[7] = "Removed!";
        for(int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        System.out.println("-----------------------------------------------");
        strArray[7] = "Mr. Davis";
         for (int i = 0; i < strArray.length; i++)
             System.out.println(strArray[i]);
        System.out.println("------------------------------------------------");
        for (int i = 0; i < strArray.length/2; i++){
            String temp = strArray[i];
            strArray[i] = strArray[strArray.length - 1 - i];
            strArray[strArray.length - 1- i] = temp;
        }
        for (int i = 0; i < strArray.length; i++)
            System.out.println(strArray[i]);
        System.out.println("-----------------------------------------------");
        String dupstrArray2 [] = new String[10];
        for(int i = 0; i < dupstrArray2.length; i++){
             String temp = strArray2[i];
             dupstrArray2[i] = temp;
        }
        for (int i = 0; i < dupstrArray2.length; i++){
            System.out.println(dupstrArray2[i]);
        }
        System.out.println("------------------------------------------------");
// part 2
        int intarray[] = new int[10];
        Scanner kboard = new Scanner(System.in);
        int userinp = kboard.nextInt();
        for(int i = 0; i < intarray.length; i++){
            intarray[i] = userinp + i;
        }
        for (int i = 0; i < intarray.length; i++){
            System.out.println(intarray[i]);
        }
        int[] intarray2 = {1, 2, 3, 4, 5, 6, 7, 8 , 9, 10};
        System.out.println("------------------------------------------------");
        int itarget = 7;
        for(int i = 0; i < intarray.length; i++){
            for(i = 0; i < intarray2.length; i++){
                if (intarray[i] == itarget){
                    System.out.println("Found!" + " " + intarray[itarget]);
                }
                if (intarray2[i] == itarget){
                    System.out.println("Found" + " " + intarray2[itarget]);
                }
                else{
                    System.out.println("Target Not Found");
                }
            }
        }
        System.out.println("-------------------------------------------------");
        for(int i = 0; i < intarray.length; i++){
            for(i = 0; i <intarray2.length; i++){
                if (intarray[i] == intarray2[i]){
                    System.out.println("Common Elements" + " " + i);
                }
                else{
                    System.out.println("No Common Elements");
                }
            }
        }
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < intarray.length/2; i++){
            int inttemp = intarray[i];
            intarray[i] = intarray[intarray.length - 1 - i];
            intarray[intarray.length - 1- i] = inttemp;
        }
        for(int i = 0; i < intarray.length; i++){
            System.out.println(intarray[i]);
        }
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < intarray2.length/2; i++){
            int inttemp2 = intarray2[i];
            intarray2[i] = intarray2[intarray2.length - 1 - i];
            intarray2[intarray2.length - 1- i] = inttemp2;
        }
        for(int i = 0; i < intarray2.length; i++){
            System.out.println(intarray2[i]);
        }
        System.out.println("-------------------------------------------------");
        int dupintarray [] = new int[10];
        for(int i = 0; i < dupintarray.length; i++){
            int itemp2 = intarray[i];
            dupintarray[i] = itemp2;
        }
        for (int i = 0; i < dupintarray.length; i++){
            System.out.println(dupintarray[i]);
        }
        System.out.println("--------------------------------------------------");
        int min = Integer.MAX_VALUE, index = -1;
        for(int i = 0; i < intarray2.length; i++){
            if(intarray2[i] < min){
                min = intarray2[i];
                index = i;
            }
        }
        System.out.println("Lowest number in intarray2 is: " + min + " " + "This is located at: " + index );
        System.out.println("--------------------------------------------------");
        int min2 = Integer.MAX_VALUE;
        int twoSmallest = Integer.MAX_VALUE;
        for(int i = 0; i < intarray2.length; i++){
            if (intarray2[i] < min2){
                twoSmallest = min2;  // had to switch these from the code above, for some reason it does not work unswitched
                min2 = intarray2[i];
            }
            else if (intarray2[i] < twoSmallest){ //this block found on https://stackoverflow.com/questions/30427857/finding-the-second-smallest-integer-in-array
                twoSmallest = intarray2[i];
            }
        }
        System.out.println("2nd Lowest number in intarray2 is: " + twoSmallest + " " + "This is located at: " + intarray2[twoSmallest]);
        System.out.println("--------------------------------------------------");
    }
}
