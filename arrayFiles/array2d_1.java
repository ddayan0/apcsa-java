// Dennis Dayan
// arrays in java are confusing
// but so are they in C and Lisp. so I can't complain
// although, they are significantly older so java has no excuse
public class array2d_1 {
    static void line(){
        System.out.println("-------------------");
    }
    static void fillEven(int[][] array){
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                array[row][col] = row*2 + col*2;
            }
        }
    }
    static void fillFive(int[][] array){
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                array[row][col] = row*5 + col*5;
            }
        }
    }
    static void fillDash(String[][] array){
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                array[row][col] = "-";
            }
        }
    }
    static void findIndex(int[][] array, int targ){
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                if(array[row][col] == targ){
                    System.out.println(array[row][col] + "\t");
                    System.out.println("Found at " + row + " " + col);
                }
            }
        }
    }
    static void printArray(int[][] array){
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                System.out.print(array[row][col] + "\t");
            }
            System.out.println();
        }
    }
    static void printArray(String[][] array){
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                System.out.print(array[row][col] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //part 1
        line();
        int [][] evenArray = new int [5][5];
        fillEven(evenArray);
        printArray(evenArray);
        //part 2
        line();
        int [][] multFive = new int[5][5];
        fillFive(multFive);
        printArray(multFive);
        line();
        findIndex(multFive, 25);
        line();
        findIndex(multFive, 30);
        line();
        findIndex(multFive, 35);
        line();
        //part 3
        int[][] quickArray = {{1, 2, 3, 4, 5}, {3, 6, 9, 12, 15}};
        printArray(quickArray);
        line();
        String [][] dashArray = new String[5][5];
        fillDash(dashArray);
        printArray(dashArray);
        //part 4
        line();
        









    }


}

