import java.util.*;
// Dennis Dayan
// "Still" and "Hatful of Hollow" are the only valid comp. albums
// subterranean homesick java program
public class array1 {
    public static void main(String[] args) {
        int numArray[] = {0,1,2,3,4}; // using C-style arrays, is this a problem?
        for(int i = 0; i < numArray.length; i++ ){ // regular for loop
            System.out.println(i);
        }
        System.out.println("-------------------------");
        for(int i: numArray){  // E N H A N C E D
            System.out.println(i);
        }
        System.out.println("-------------------------");
        for(int i = 0; i < numArray.length; i++ ){ // only print odds
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
        System.out.println("-------------------------");
        int [] numArray2 = new int[10];
        double total = 0;
        for(int i = 0; i < 10; i++){ // adds 10 ints to array
            int random = (int)Math.floor(10 + Math.random()*90);
            System.out.println(numArray2[i] = random);

        }
        for(int i=0; i<=numArray.length; i++){
            total = total + numArray2[i];
        }
        double average = total / numArray.length;
        System.out.println("Average of Numarray2 is " + average);
        System.out.println("--------------------------");
        // Part 2
        String [] stringArray = {"Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"};
        int random2 = (int)Math.floor( + Math.random() * 4);
        System.out.println("Enter your name for sorting");
        Scanner nameInput = new Scanner(System.in);
        String username = nameInput.next();
        System.out.println(username + ", You have been selected for " + stringArray[random2] + ".");
        System.out.println("--------------------------");
        //part 3
        int [] histogramArray = new int[5];
        for(int i = 0; i <= 100; i++){
            int historandom = (int)Math.floor( + Math.random()*50);
            if (historandom < 10){
                histogramArray[0]++;
            }
            else if (historandom < 20){
                histogramArray[1]++;
            }
            else if (historandom < 30){
                histogramArray[2]++;
            }
            else if (historandom < 40){
                histogramArray[3]++;
            }
            else {
                histogramArray[4]++;
            }
            //System.out.println(Arrays.toString(histogramArray));, works but not allowed


        }
        PrintArray(histogramArray);


    }
    public static void PrintArray(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void PrintArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }






}
