import java.util.SplittableRandom;

public class methods1 {
    static void line(){
        System.out.println("-----------------------------");
    }
    static void hellWorldVoid(){
        System.out.println("Hello World");
    }
    static void myNameVoid(){
        System.out.println("Dennis Dayan");
    }
    static void randomNumberVoid(){
        int max = 100;
        int min = 0;
        int range = max - min + 1;
        System.out.println((int) (Math.random()*range) + min);
    }
    static void sayHelloVoid(String s){
        System.out.println("Hello " + s);
    }
    static void randomNumberVoid(int limit){
        int max = limit;
        int min = 0;
        int range = max - min + 1;
        System.out.println((int)(Math.random()*range) + min);
    }
    static void maxNumVoid(int a, int b, int c){
        if(a > b && a > c){
            System.out.println(a);
        }
        if(b > a && b > c){
            System.out.println(b);
        }
        if(c > a && c > b){
            System.out.println(c);
        }
    }
    static void printArray(String [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    static void printArray(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    static void longestWord(String [] arr){
        int longestWordLength = 0;
        int longestWordIndex = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() > longestWordLength){
                longestWordLength = arr[i].length();
                longestWordIndex = i;
            }
        }
        System.out.println("Longest Word: " + arr[longestWordIndex]);
    }
    static void maxNumVoid (int [] arr){
        int biggestVal = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > arr[0]){
                biggestVal = arr[i];
            }
        }
        System.out.println(biggestVal);
    }
    static String myName(){
        return "Dennis Dayan";
    }
    static int randomNumber(){
        int max = 100;
        int min = 0;
        int range = max - min + 1;
        return (int)(Math.random()*range) + min;
    }
    static int randomNumber(int limit){
        int max = limit;
        int min = 0;
        int range = max - min + 1;
        return (int)(Math.random()*range) + min;
    }
    static int maxNum(int a, int b, int c){
        if(a > b && a > c){
            return a;
        }
        if(b > a && b > c){
            return b;
        }
        if(c > a && c > b){
            return c;
        }
        return -1;
    }
    static String sortArray(String [] arr){
        if(arr.length >= 2){
            String [] left = new String[arr.length / 2];
            String [] right = new String[arr.length - arr.length / 2];
            for(int i = 0; i < left.length; i++){
                left[i] = arr[i];
            }
            for(int i = 0; i < right.length; i++){
                right[i] = arr[i + arr.length / 2];
            }
            sortArray(left);
            sortArray(right);
            mergeMe(arr, left, right);
            for(String sortedArray : arr){
                return sortedArray;
            }


        }
        return "-1";
    }
    static void mergeMe(String [] arr, String [] left, String [] right){
        int a = 0;
        int b = 0;
        for(int i = 0; i < arr.length; i++){
            if(b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)){
                arr[i] = left[a];
                a++;
            } else {
                arr[i] = right[b];
                b++;
            }
        }
    }
    static int sortArray(int [] arr){
        int min, temp;
        for(int index = 0; index < arr.length - 1; index++){
            min = index;
            for(int scan = index +1; scan < arr.length; scan++){
                if(arr[scan] < arr[min]){
                    min = scan;
                }
            }
            temp = arr[min];
            arr[min] = arr[index];
            arr[index] = temp;

        }
        for(int i = 0; i < arr.length; i++){
            return arr[i];
        }
        return -1;
    }







    public static void main(String[] args) {
        hellWorldVoid();
        line();
        myNameVoid();
        line();
        randomNumberVoid();
        line();
        sayHelloVoid("Dennis");
        line();
        randomNumberVoid(100);
        line();
        maxNumVoid(1, 7, 3);
        String myArrayStr [] = {"Dennis", "Max", "Cole"};
        String myArrayStr2 [] = {"Orean", "Nick", "Sam"};
        String empt [] = new String[myArrayStr.length + myArrayStr2.length];
        line();
        printArray(myArrayStr);
        line();
        int myArrayInt [] = {1, 2, 3};
        printArray(myArrayInt);
        line();
        longestWord(myArrayStr);
        line();
        maxNumVoid(myArrayInt);
        line();
        System.out.println(myName());
        line();
        System.out.println(randomNumber());
        line();
        System.out.println(randomNumber(100));
        line();
        System.out.println(maxNum(2, 4, 6));
        line();
        sortArray(myArrayStr);
        sortArray(myArrayStr2);
        mergeMe(empt, myArrayStr, myArrayStr2);
        sortArray(empt);
        for(String output: empt){
            System.out.println(output);
        }
        line();
        int newIntArr[] = {1, 2, 4, 5 , 8};
        sortArray(newIntArr);
        for(int output: newIntArr){
            System.out.println(output);
        }
        line();
        



    }
}
