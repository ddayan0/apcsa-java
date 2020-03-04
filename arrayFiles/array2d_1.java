// Dennis Dayan
// arrays in java are confusing
// but so are they in C and Lisp. so I can't complain
// although, they are significantly older so java has no excuse
public class array2d_1 {
    static void fillEven(int[][] array){
        int even = 1;
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                array[row][col] = row*2 + col*2;
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
    public static void main(String[] args) {
        //part 1
        int [][] evenArray = new int [5][5];
        fillEven(evenArray);
        printArray(evenArray);

    }


}
