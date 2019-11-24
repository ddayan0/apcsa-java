// Dennis Dayan
// AP CS A
//array3.java
// this program fills the static void in my heart

public class array3 {

    static void binarysearch(int target, int[] arr){
        int low = 0, high = arr.length-1, middle = (low+high)/ 2;
        int foundindex = -1;
        while(arrayData.sortedArray[middle] != target && low <= high){
            if(target < arrayData.sortedArray[middle]){
                high=middle - 1;
            }
            else{
                low = middle + 1;
            }
            middle = (low+high)/2;

        }//end while
        if(arrayData.sortedArray[middle]== target){
            foundindex = middle;
        }
        if(foundindex >= 0){
            System.out.println("Found  " + target + " at " + middle );
        }
        else{
            System.out.println("Could not find target, Error?");
        }



    }// end static void

    static void linear(int lintarg, int[] arr, int[] arr2){
        for(int i = 0; i < arr.length; i++){   //TODO Make boolean, printing extraneously
            for(int j = 0; j < arr2.length; j++){
                if(arr[i] == lintarg){
                    System.out.println("Target" + " " + arr[i]);
                }
                else{
                    System.out.println("Linear target not found" );
                }
                if(arr2[j] == lintarg){
                    System.out.println("Target" + " " + arr2[j]);
                }
                else{
                    System.out.println("Linear target not found");
                }

            }
        }
    }// end static void

    static void printme(){
        System.out.println("---------------------------------------------------");
    }// end static void

    static void printarray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }// end static void

    static void ssort(int[] arr){
        int min, temp;
        for (int index = 0; index < arr.length-1; index++){
            min = index;
            for(int scan = index+1; scan < arr.length; scan++){
                if(arr[scan] < arr[min]){
                    min = scan;
                }
            }


            temp  = arr[min];
            arr[min] = arr[index];
            arr[index] = temp;
        }



    }// end static void

    static void alphsort(String [] arr){
        String temp;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i].compareTo(arr[j]) > 0){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }




    }





    public static void main(String[] args) {
        //testing importing arrayData
        System.out.println(arrayData.sortedArray[0] + " - This a test, IGNORE!");
        System.out.println("---------------------------------------------------");
        // Write code that will perform a binary search on sortedArray. If a
        // target is found, it will print its location, if not it will print
        // an error message to the user
        int target = 21;
        int foundindex = -1;
        int low = 0;
        int high = arrayData.sortedArray.length - 1;
        int middle = (low + high)/2;
        while(arrayData.sortedArray[middle] != target && low <= high){
            if(target < arrayData.sortedArray[middle]){
                high=middle - 1;
            }
            else{
                low = middle + 1;
            }
            middle = (low+high)/2;

        }//end while
        if(arrayData.sortedArray[middle]== target){
            foundindex = middle;
        }
        if(foundindex >= 0){
            System.out.println("Found  " + target + " at " + middle );
        }
        else{
            System.out.println("Could not find target, Error?");
        }
        System.out.println("--------------------------------------------------");

        // Identify a second target (that is NOT expected to be found in
        // sortedArray array), and print the result
        binarysearch(69, arrayData.sortedArray);
        printme();
        linear(3, arrayData.sortedArray, arrayData.unSortedArray);
        printme();
        linear(69, arrayData.sortedArray, arrayData.unSortedArray);
        printme();
        // part 2
        printarray(arrayData.unSortedArray);
        printme();
        ssort(arrayData.unSortedArray);
        printarray(arrayData.unSortedArray);
        printme();
        //BONUS
        String strArray [];
        strArray = new String[10];
        strArray[0] = "A";
        strArray[1] = "C";
        strArray[2] = "X";
        strArray[3] = "Z";
        strArray[4] = "O";
        strArray[5] = "L";
        strArray[6] = "Q";
        strArray[7] = "W";
        strArray[8] = "E";
        strArray[9] = "R";
        alphsort(strArray);
        for(int i = 0; i < strArray.length; i++ ){
            System.out.println(strArray[i]);
        }
        printme();
























    }// end class
} //end main
